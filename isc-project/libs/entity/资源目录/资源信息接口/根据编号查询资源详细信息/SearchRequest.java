public class SearchRequest {
	private String resourceType;
	private ArrayList<String> resourceIndexCodes;

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public ArrayList<String> getResourceIndexCodes() {
		return resourceIndexCodes;
	}

	public void setResourceIndexCodes(ArrayList<String> resourceIndexCodes) {
		this.resourceIndexCodes = resourceIndexCodes;
	}
}
