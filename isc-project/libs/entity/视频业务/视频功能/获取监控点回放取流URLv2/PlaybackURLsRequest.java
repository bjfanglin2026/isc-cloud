public class PlaybackURLsRequest {
	private String cameraIndexCode;
	private String recordLocation;
	private String protocol;
	private Integer transmode;
	private String beginTime;
	private String endTime;
	private String uuid;
	private String expand;
	private String streamform;
	private Integer lockType;

	public String getCameraIndexCode() {
		return cameraIndexCode;
	}

	public void setCameraIndexCode(String cameraIndexCode) {
		this.cameraIndexCode = cameraIndexCode;
	}

	public String getRecordLocation() {
		return recordLocation;
	}

	public void setRecordLocation(String recordLocation) {
		this.recordLocation = recordLocation;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Integer getTransmode() {
		return transmode;
	}

	public void setTransmode(Integer transmode) {
		this.transmode = transmode;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getStreamform() {
		return streamform;
	}

	public void setStreamform(String streamform) {
		this.streamform = streamform;
	}

	public Integer getLockType() {
		return lockType;
	}

	public void setLockType(Integer lockType) {
		this.lockType = lockType;
	}
}
