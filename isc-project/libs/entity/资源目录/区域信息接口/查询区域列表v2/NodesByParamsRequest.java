public class NodesByParamsRequest {
	private String resourceType;
	private ArrayList<String> parentIndexCodes;
	private Boolean isSubRegion;
	private Integer pageNo;
	private Integer pageSize;
	private ArrayList<String> authCodes;
	private Integer regionType;
	private String regionName;
	private ArrayList<String> sonOrgIndexCodes;
	private Integer cascadeFlag;
	private String orderBy;
	private String orderType;
	private ArrayList<Expressions> expressions;

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public ArrayList<String> getParentIndexCodes() {
		return parentIndexCodes;
	}

	public void setParentIndexCodes(ArrayList<String> parentIndexCodes) {
		this.parentIndexCodes = parentIndexCodes;
	}

	public Boolean getIsSubRegion() {
		return isSubRegion;
	}

	public void setIsSubRegion(Boolean isSubRegion) {
		this.isSubRegion = isSubRegion;
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

	public ArrayList<String> getAuthCodes() {
		return authCodes;
	}

	public void setAuthCodes(ArrayList<String> authCodes) {
		this.authCodes = authCodes;
	}

	public Integer getRegionType() {
		return regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public ArrayList<String> getSonOrgIndexCodes() {
		return sonOrgIndexCodes;
	}

	public void setSonOrgIndexCodes(ArrayList<String> sonOrgIndexCodes) {
		this.sonOrgIndexCodes = sonOrgIndexCodes;
	}

	public Integer getCascadeFlag() {
		return cascadeFlag;
	}

	public void setCascadeFlag(Integer cascadeFlag) {
		this.cascadeFlag = cascadeFlag;
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
