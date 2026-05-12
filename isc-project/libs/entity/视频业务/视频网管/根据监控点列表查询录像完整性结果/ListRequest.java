public class ListRequest {
	private Integer pageNo;
	private Integer pageSize;
	private String beginTime;
	private String endTime;
	private ArrayList<String> indexCodes;

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

	public ArrayList<String> getIndexCodes() {
		return indexCodes;
	}

	public void setIndexCodes(ArrayList<String> indexCodes) {
		this.indexCodes = indexCodes;
	}
}
