public class AdditionRequest {
	private String event_name;
	private String event_index;
	private String dlp_indexcode;
	private Integer event_level;
	private Integer event_keep_time;
	private Integer alarm_stream_type;
	private String camera_list;
	private String wnd_list;
	private String event_desc;

	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_index() {
		return event_index;
	}

	public void setEvent_index(String event_index) {
		this.event_index = event_index;
	}

	public String getDlp_indexcode() {
		return dlp_indexcode;
	}

	public void setDlp_indexcode(String dlp_indexcode) {
		this.dlp_indexcode = dlp_indexcode;
	}

	public Integer getEvent_level() {
		return event_level;
	}

	public void setEvent_level(Integer event_level) {
		this.event_level = event_level;
	}

	public Integer getEvent_keep_time() {
		return event_keep_time;
	}

	public void setEvent_keep_time(Integer event_keep_time) {
		this.event_keep_time = event_keep_time;
	}

	public Integer getAlarm_stream_type() {
		return alarm_stream_type;
	}

	public void setAlarm_stream_type(Integer alarm_stream_type) {
		this.alarm_stream_type = alarm_stream_type;
	}

	public String getCamera_list() {
		return camera_list;
	}

	public void setCamera_list(String camera_list) {
		this.camera_list = camera_list;
	}

	public String getWnd_list() {
		return wnd_list;
	}

	public void setWnd_list(String wnd_list) {
		this.wnd_list = wnd_list;
	}

	public String getEvent_desc() {
		return event_desc;
	}

	public void setEvent_desc(String event_desc) {
		this.event_desc = event_desc;
	}
}
