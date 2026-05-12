public class PersonListRequest {
	private String orgIndexCode;
	private Integer pageNo;
	private Integer pageSize;

	public String getOrgIndexCode() {
		return orgIndexCode;
	}

	public void setOrgIndexCode(String orgIndexCode) {
		this.orgIndexCode = orgIndexCode;
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
