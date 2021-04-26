package com.ashokit;

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {

	public static String encryptData(String text) throws Exception {

		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.reset();
		System.out.println("Original text : " + text);

		md.update(text.getBytes());

		byte[] digest = md.digest();
		System.out.println("Digested Text :: " + new String(digest));

		Encoder encoder = Base64.getEncoder();
		byte[] encodedDigested = encoder.encode(digest);

		System.out.println("Encoded + Digested Text :: " + new String(encodedDigested));

		return new String(encodedDigested);
	}

	public static void main(String[] args) throws Exception {
		PwdUtils.encryptData("india@123");
	}
}
