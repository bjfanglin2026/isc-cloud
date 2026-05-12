public class SaveAsRequest {
	private String name;
	private Integer dlp_id;
	private Integer scene_id;
	private Integer device_scene;
	private Integer copy_cycle;
	private String copy_cycle_list;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDlp_id() {
		return dlp_id;
	}

	public void setDlp_id(Integer dlp_id) {
		this.dlp_id = dlp_id;
	}

	public Integer getScene_id() {
		return scene_id;
	}

	public void setScene_id(Integer scene_id) {
		this.scene_id = scene_id;
	}

	public Integer getDevice_scene() {
		return device_scene;
	}

	public void setDevice_scene(Integer device_scene) {
		this.device_scene = device_scene;
	}

	public Integer getCopy_cycle() {
		return copy_cycle;
	}

	public void setCopy_cycle(Integer copy_cycle) {
		this.copy_cycle = copy_cycle;
	}

	public String getCopy_cycle_list() {
		return copy_cycle_list;
	}

	public void setCopy_cycle_list(String copy_cycle_list) {
		this.copy_cycle_list = copy_cycle_list;
	}
}
