package com.ashokit;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {

	public static void main(String[] args) {
		String originalMsg = "ashokit@123";
		System.out.println("Orginal Msg :: " + originalMsg);
		String encodedMsg = Demo.encodeMsg(originalMsg);
		System.out.println("Encoded Msg :: " + encodedMsg);
		String decodedMsg = Demo.decodeMsg(encodedMsg);
		System.out.println("Decoded Msg :: " + decodedMsg);
	}

	/**
	 * This method is used to encode data
	 * 
	 * @param msg
	 * @return String
	 */
	public static String encodeMsg(String msg) {
		Encoder encoder = Base64.getEncoder();
		String encodedMsg = encoder.encodeToString(msg.getBytes());
		return encodedMsg;
	}

	/**
	 * This method is used to decode the message
	 * @param encodedMsg
	 * @return String
	 */
	public static String decodeMsg(String encodedMsg) {
		Decoder decoder = Base64.getDecoder();
		byte[] decodedMsg = decoder.decode(encodedMsg);
		String decodedStr = new String(decodedMsg);
		return decodedStr;
	}

}
