public class UpdateRequest {
	private String regionIndexCode;
	private String parentIndexCode;
	private String regionName;
	private String regionCode;
	private Integer regionType;
	private String description;

	public String getRegionIndexCode() {
		return regionIndexCode;
	}

	public void setRegionIndexCode(String regionIndexCode) {
		this.regionIndexCode = regionIndexCode;
	}

	public String getParentIndexCode() {
		return parentIndexCode;
	}

	public void setParentIndexCode(String parentIndexCode) {
		this.parentIndexCode = parentIndexCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public Integer getRegionType() {
		return regionType;
	}

	public void setRegionType(Integer regionType) {
		this.regionType = regionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
