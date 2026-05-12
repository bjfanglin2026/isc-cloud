public class OrgListRequest {
	private String orgName;
	private String orgIndexCodes;
	private Integer pageNo;
	private Integer pageSize;
	private String parentOrgIndexCodes;
	private Boolean isSubOrg;
	private ArrayList<Expressions> expressions;
	private String orderBy;
	private String orderType;

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgIndexCodes() {
		return orgIndexCodes;
	}

	public void setOrgIndexCodes(String orgIndexCodes) {
		this.orgIndexCodes = orgIndexCodes;
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

	public String getParentOrgIndexCodes() {
		return parentOrgIndexCodes;
	}

	public void setParentOrgIndexCodes(String parentOrgIndexCodes) {
		this.parentOrgIndexCodes = parentOrgIndexCodes;
	}

	public Boolean getIsSubOrg() {
		return isSubOrg;
	}

	public void setIsSubOrg(Boolean isSubOrg) {
		this.isSubOrg = isSubOrg;
	}

	public ArrayList<Expressions> getExpressions() {
		return expressions;
	}

	public void setExpressions(ArrayList<Expressions> expressions) {
		this.expressions = expressions;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
}
