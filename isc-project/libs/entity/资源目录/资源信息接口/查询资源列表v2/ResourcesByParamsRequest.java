public class ResourcesByParamsRequest {
	private String name;
	private ArrayList<String> regionIndexCodes;
	private Boolean isSubRegion;
	private String resourceType;
	private Integer pageNo;
	private Integer pageSize;
	private ArrayList<String> authCodes;
	private String orderBy;
	private String orderType;
	private ArrayList<Expressions> expressions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getRegionIndexCodes() {
		return regionIndexCodes;
	}

	public void setRegionIndexCodes(ArrayList<String> regionIndexCodes) {
		this.regionIndexCodes = regionIndexCodes;
	}

	public Boolean getIsSubRegion() {
		return isSubRegion;
	}

	public void setIsSubRegion(Boolean isSubRegion) {
		this.isSubRegion = isSubRegion;
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

	public ArrayList<String> getAuthCodes() {
		return authCodes;
	}

	public void setAuthCodes(ArrayList<String> authCodes) {
		this.authCodes = authCodes;
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
