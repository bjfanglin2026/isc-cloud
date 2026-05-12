public class TalkURLsRequest {
	private String cameraIndexCode;
	private Integer transmode;
	private String expand;
	private String eurlExpand;

	public String getCameraIndexCode() {
		return cameraIndexCode;
	}

	public void setCameraIndexCode(String cameraIndexCode) {
		this.cameraIndexCode = cameraIndexCode;
	}

	public Integer getTransmode() {
		return transmode;
	}

	public void setTransmode(Integer transmode) {
		this.transmode = transmode;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getEurlExpand() {
		return eurlExpand;
	}

	public void setEurlExpand(String eurlExpand) {
		this.eurlExpand = eurlExpand;
	}
}
