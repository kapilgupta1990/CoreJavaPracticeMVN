package com.cdk.IdeaS;

public class InputModel {

	private String serverType;
	private String softwareType;
	private String softwareName;
	private String versionNo;

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public String getSoftwareType() {
		return softwareType;
	}

	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputModel [serverType=").append(serverType).append(", softwareType=").append(softwareType)
				.append(", softwareName=").append(softwareName).append(", versionNo=").append(versionNo).append("]");
		return builder.toString();
	}
	

}
