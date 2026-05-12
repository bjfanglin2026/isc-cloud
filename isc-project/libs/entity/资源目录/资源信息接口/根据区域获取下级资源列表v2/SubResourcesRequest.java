public class SubResourcesRequest {
	private String regionIndexCode;
	private Integer pageNo;
	private ArrayList<String> authCodes;
	private Integer pageSize;
	private String resourceType;

	public String getRegionIndexCode() {
		return regionIndexCode;
	}

	public void setRegionIndexCode(String regionIndexCode) {
		this.regionIndexCode = regionIndexCode;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public ArrayList<String> getAuthCodes() {
		return authCodes;
	}

	public void setAuthCodes(ArrayList<String> authCodes) {
		this.authCodes = authCodes;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
}
