package com.usa.ri.gov.service;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.usa.ri.gov.bindings.IndvInfo;
import com.usa.ri.gov.bindings.PlanInfo;

@Service("eligService")
public class DetermineEligibilityService {

	public PlanInfo determineEligibility(IndvInfo indvInfo) {
		String planName = indvInfo.getPlanName();
		/*if(planName.equals("SNAP")) {
			SNAPRuleService snap = new SNAPRuleService();
			return snap.executeRules(indvInfo);
		}else if(planName.equals("CCAP")) {
			CCAPRuleService ccap  = new CCAPRuleService();
			return ccap.executeRules(indvInfo);
		}else if(planName.equals("Medicaid")) {
			MedicaidRuleService medicaid = new MedicaidRuleService();
			return medicaid.executeRules(indvInfo);
		}else{
			return null;
		}*/
		
		PlanInfo planInfo = null;
		try {
			Class clz = Class.forName("com.usa.ri.gov.service." + planName + "RuleService");
			Object obj = clz.newInstance();
			Method m = clz.getDeclaredMethod("executeRules", IndvInfo.class);
			Object resObj = m.invoke(obj, indvInfo);
			planInfo = (PlanInfo)resObj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return planInfo;
		
	}
}
