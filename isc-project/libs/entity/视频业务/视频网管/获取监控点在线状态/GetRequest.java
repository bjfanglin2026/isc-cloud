public class GetRequest {
	private String regionId;
	private String includeSubNode;
	private ArrayList<String> indexCodes;
	private String status;
	private Integer pageNo;
	private Integer pageSize;

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getIncludeSubNode() {
		return includeSubNode;
	}

	public void setIncludeSubNode(String includeSubNode) {
		this.includeSubNode = includeSubNode;
	}

	public ArrayList<String> getIndexCodes() {
		return indexCodes;
	}

	public void setIndexCodes(ArrayList<String> indexCodes) {
		this.indexCodes = indexCodes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
}
