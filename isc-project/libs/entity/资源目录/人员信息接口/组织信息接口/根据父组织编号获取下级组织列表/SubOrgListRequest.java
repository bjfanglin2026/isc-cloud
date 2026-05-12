public class SubOrgListRequest {
	private String parentOrgIndexCode;
	private Integer pageNo;
	private Integer pageSize;

	public String getParentOrgIndexCode() {
		return parentOrgIndexCode;
	}

	public void setParentOrgIndexCode(String parentOrgIndexCode) {
		this.parentOrgIndexCode = parentOrgIndexCode;
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
