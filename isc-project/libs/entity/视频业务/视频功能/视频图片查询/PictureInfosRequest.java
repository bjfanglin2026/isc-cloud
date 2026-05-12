public class PictureInfosRequest {
	private Integer pageNo;
	private Integer pageSize;
	private ArrayList<String> cameraIndexCodes;
	private String captureId;
	private String startTime;
	private String endTime;
	private String netProtocol;
	private Integer sort;
	private Integer compressRatio;

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public ArrayList<String> getCameraIndexCodes() {
		return cameraIndexCodes;
	}

	public void setCameraIndexCodes(ArrayList<String> cameraIndexCodes) {
		this.cameraIndexCodes = cameraIndexCodes;
	}

	public String getCaptureId() {
		return captureId;
	}

	public void setCaptureId(String captureId) {
		this.captureId = captureId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getNetProtocol() {
		return netProtocol;
	}

	public void setNetProtocol(String netProtocol) {
		this.netProtocol = netProtocol;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getCompressRatio() {
		return compressRatio;
	}

	public void setCompressRatio(Integer compressRatio) {
		this.compressRatio = compressRatio;
	}
}
