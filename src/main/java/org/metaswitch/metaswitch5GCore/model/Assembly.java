package org.metaswitch.metaswitch5GCore.model;

public class Assembly {

	private String asseblyName;
	private String openstackImageName;
	private String networkPrivateKey;
	private int connectionTimeout;
	
	public Assembly() {
		
	}
	
	public Assembly(String asseblyName, String openstackImageName, String networkPrivateKey, int connectionTimeout) {
		super();
		this.asseblyName = asseblyName;
		this.openstackImageName = openstackImageName;
		this.networkPrivateKey = networkPrivateKey;
		this.connectionTimeout = connectionTimeout;
	}

	public String getAsseblyName() {
		return asseblyName;
	}

	public void setAsseblyName(String asseblyName) {
		this.asseblyName = asseblyName;
	}

	public String getOpenstackImageName() {
		return openstackImageName;
	}

	public void setOpenstackImageName(String openstackImageName) {
		this.openstackImageName = openstackImageName;
	}

	public String getNetworkPrivateKey() {
		return networkPrivateKey;
	}

	public void setNetworkPrivateKey(String networkPrivateKey) {
		this.networkPrivateKey = networkPrivateKey;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}
	
	
	
}
