public class ControllingRequest {
	private String cameraIndexCode;
	private Integer action;
	private String command;
	private Integer speed;
	private Integer presetIndex;

	public String getCameraIndexCode() {
		return cameraIndexCode;
	}

	public void setCameraIndexCode(String cameraIndexCode) {
		this.cameraIndexCode = cameraIndexCode;
	}

	public Integer getAction() {
		return action;
	}

	public void setAction(Integer action) {
		this.action = action;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getPresetIndex() {
		return presetIndex;
	}

	public void setPresetIndex(Integer presetIndex) {
		this.presetIndex = presetIndex;
	}
}
