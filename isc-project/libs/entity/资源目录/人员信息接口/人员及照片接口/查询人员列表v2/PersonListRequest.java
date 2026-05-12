public class PersonListRequest {
	private String personIds;
	private String personName;
	private Integer gender;
	private String orgIndexCodes;
	private Integer certificateType;
	private String certificateNo;
	private Integer pageNo;
	private Integer pageSize;
	private Boolean isSubOrg;
	private String orderBy;
	private String orderType;
	private ArrayList<Expressions> expressions;

	public String getPersonIds() {
		return personIds;
	}

	public void setPersonIds(String personIds) {
		this.personIds = personIds;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getOrgIndexCodes() {
		return orgIndexCodes;
	}

	public void setOrgIndexCodes(String orgIndexCodes) {
		this.orgIndexCodes = orgIndexCodes;
	}

	public Integer getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNo() {
		return certificateNo;
	}

	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
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

	public Boolean getIsSubOrg() {
		return isSubOrg;
	}

	public void setIsSubOrg(Boolean isSubOrg) {
		this.isSubOrg = isSubOrg;
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

	public ArrayList<Expressions> getExpressions() {
		return expressions;
	}

	public void setExpressions(ArrayList<Expressions> expressions) {
		this.expressions = expressions;
	}
}
