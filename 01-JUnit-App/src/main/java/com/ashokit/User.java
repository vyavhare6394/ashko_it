package com.ashokit;

public class User {

	private String id;
	private String pw;
	private String fn;
	private String ln;
	private String email;
	
	
	public User(String id, String pw, String fn, String ln, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.fn = fn;
		this.ln = ln;
		this.email = email;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getFn() {
		return fn;
	}


	public void setFn(String fn) {
		this.fn = fn;
	}


	public String getLn() {
		return ln;
	}


	public void setLn(String ln) {
		this.ln = ln;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
}
