public class EventSubscriptionViewRequest {
	private ArrayList<Integer> eventTypes;
	private String eventDest;
	private Integer subType;
	private ArrayList<Integer> eventLvl;

	public ArrayList<Integer> getEventTypes() {
		return eventTypes;
	}

	public void setEventTypes(ArrayList<Integer> eventTypes) {
		this.eventTypes = eventTypes;
	}

	public String getEventDest() {
		return eventDest;
	}

	public void setEventDest(String eventDest) {
		this.eventDest = eventDest;
	}

	public Integer getSubType() {
		return subType;
	}

	public void setSubType(Integer subType) {
		this.subType = subType;
	}

	public ArrayList<Integer> getEventLvl() {
		return eventLvl;
	}

	public void setEventLvl(ArrayList<Integer> eventLvl) {
		this.eventLvl = eventLvl;
	}
}
