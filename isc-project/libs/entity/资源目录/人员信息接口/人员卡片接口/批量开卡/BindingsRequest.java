public class BindingsRequest {
	private String startDate;
	private String endDate;
	private ArrayList<CardList> cardList;

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public ArrayList<CardList> getCardList() {
		return cardList;
	}

	public void setCardList(ArrayList<CardList> cardList) {
		this.cardList = cardList;
	}
}
