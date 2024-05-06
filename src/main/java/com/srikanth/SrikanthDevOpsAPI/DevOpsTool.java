package com.srikanth.SrikanthDevOpsAPI;

public class DevOpsTool {
	
	private String name;
	private double version;
	private String details;
	
	public DevOpsTool(String name, double version, String details) {
		super();
		this.name = name;
		this.version = version;
		this.details = details;
	}
	@Override
	public String toString() {
		return "DevOpsTool [name=" + name + ", version=" + version + ", details=" + details + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}
