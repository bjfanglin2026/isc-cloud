public class AdditionRequest {
	private String cameraIndexCode;
	private String presetName;
	private Integer presetIndex;

	public String getCameraIndexCode() {
		return cameraIndexCode;
	}

	public void setCameraIndexCode(String cameraIndexCode) {
		this.cameraIndexCode = cameraIndexCode;
	}

	public String getPresetName() {
		return presetName;
	}

	public void setPresetName(String presetName) {
		this.presetName = presetName;
	}

	public Integer getPresetIndex() {
		return presetIndex;
	}

	public void setPresetIndex(Integer presetIndex) {
		this.presetIndex = presetIndex;
	}
}
