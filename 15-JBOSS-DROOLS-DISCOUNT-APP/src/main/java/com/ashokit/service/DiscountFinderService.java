package com.ashokit.service;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.StatefulSession;
import org.springframework.stereotype.Service;

import com.ashokit.model.Product;

@Service
public class DiscountFinderService {

	public Double fireDiscountRules(String productType) throws Exception {

		// Creating Input object and setting data
		Product p = new Product();
		p.setProductType(productType);

		// load input file
		InputStream inputStream = getClass().getResourceAsStream("/com/rules/discount-rules.drl");
		Reader reader = new InputStreamReader(inputStream);

		PackageBuilder pkgBuilder = new PackageBuilder();
		pkgBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package pkg = pkgBuilder.getPackage();

		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(pkg);

		StatefulSession session = ruleBase.newStatefulSession();
		session.insert(p); // setting input data in obj format
		session.fireAllRules(); // executing rules here
		session.dispose();

		return p.getDiscount();
	}

}
