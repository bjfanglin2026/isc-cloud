public class SubRegionsRequest {
	private String parentIndexCode;
	private String resourceType;
	private Integer pageNo;
	private Integer pageSize;
	private Integer cascadeFlag;

	public String getParentIndexCode() {
		return parentIndexCode;
	}

	public void setParentIndexCode(String parentIndexCode) {
		this.parentIndexCode = parentIndexCode;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
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

	public Integer getCascadeFlag() {
		return cascadeFlag;
	}

	public void setCascadeFlag(Integer cascadeFlag) {
		this.cascadeFlag = cascadeFlag;
	}
}
