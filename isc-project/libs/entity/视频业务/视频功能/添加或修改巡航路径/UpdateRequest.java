public class UpdateRequest {
	private String cameraIndexCode;
	private Integer cruiseIndex;
	private String cruiseName;
	private ArrayList<Points> points;

	public String getCameraIndexCode() {
		return cameraIndexCode;
	}

	public void setCameraIndexCode(String cameraIndexCode) {
		this.cameraIndexCode = cameraIndexCode;
	}

	public Integer getCruiseIndex() {
		return cruiseIndex;
	}

	public void setCruiseIndex(Integer cruiseIndex) {
		this.cruiseIndex = cruiseIndex;
	}

	public String getCruiseName() {
		return cruiseName;
	}

	public void setCruiseName(String cruiseName) {
		this.cruiseName = cruiseName;
	}

	public ArrayList<Points> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Points> points) {
		this.points = points;
	}
}
