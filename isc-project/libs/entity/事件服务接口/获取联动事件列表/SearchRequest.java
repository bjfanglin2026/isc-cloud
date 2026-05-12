public class SearchRequest {
	private String eventRuleId;
	private String ability;
	private String regionIndexCode;
	private ArrayList<String> locationIndexCodes;
	private String resName;
	private ArrayList<String> resIndexCodes;
	private ArrayList<String> resTypes;
	private String eventType;
	private ArrayList<String> eventLevels;
	private String remark;
	private Integer handleStatus;
	private String startTime;
	private String endTime;
	private Integer pageSize;
	private Integer pageNo;

	public String getEventRuleId() {
		return eventRuleId;
	}

	public void setEventRuleId(String eventRuleId) {
		this.eventRuleId = eventRuleId;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getRegionIndexCode() {
		return regionIndexCode;
	}

	public void setRegionIndexCode(String regionIndexCode) {
		this.regionIndexCode = regionIndexCode;
	}

	public ArrayList<String> getLocationIndexCodes() {
		return locationIndexCodes;
	}

	public void setLocationIndexCodes(ArrayList<String> locationIndexCodes) {
		this.locationIndexCodes = locationIndexCodes;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public ArrayList<String> getResIndexCodes() {
		return resIndexCodes;
	}

	public void setResIndexCodes(ArrayList<String> resIndexCodes) {
		this.resIndexCodes = resIndexCodes;
	}

	public ArrayList<String> getResTypes() {
		return resTypes;
	}

	public void setResTypes(ArrayList<String> resTypes) {
		this.resTypes = resTypes;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public ArrayList<String> getEventLevels() {
		return eventLevels;
	}

	public void setEventLevels(ArrayList<String> eventLevels) {
		this.eventLevels = eventLevels;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getHandleStatus() {
		return handleStatus;
	}

	public void setHandleStatus(Integer handleStatus) {
		this.handleStatus = handleStatus;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
}
