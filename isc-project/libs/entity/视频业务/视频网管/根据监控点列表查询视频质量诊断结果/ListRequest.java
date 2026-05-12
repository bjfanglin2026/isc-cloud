public class ListRequest {
	private Integer pageNo;
	private Integer pageSize;
	private ArrayList<String> indexCodes;

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

	public ArrayList<String> getIndexCodes() {
		return indexCodes;
	}

	public void setIndexCodes(ArrayList<String> indexCodes) {
		this.indexCodes = indexCodes;
	}
}
