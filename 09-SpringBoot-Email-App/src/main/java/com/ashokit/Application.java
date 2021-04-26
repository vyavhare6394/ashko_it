package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.utils.EmailUtils;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);

		EmailUtils emailUtils = ctxt.getBean(EmailUtils.class);

		String to = "ashokitschool@gmail.com";
		String subject = "<h1>This is for testing</h1>";
		String body = "<b>This mail sent from spring boot application</b>";

		// boolean isSent = emailUtils.sendEmail(to, subject, body);
		boolean isSent = emailUtils.sendEmailNew(to, subject, body);

		System.out.println("Email Sent ? :: " + isSent);
	}

}
