
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:38
 */
public class ArtemisPostTest_视频功能 {
	/**
	 * STEP1：设置平台参数，根据实际情况,设置host appkey appsecret 三个参数.
	 */
	static {
		ArtemisConfig.host = "ip:port";// 平台门户/nginx的IP和端口（必须使用https协议，https端口默认为443）
		ArtemisConfig.appKey = "appKey"; // 请填入appKey
		ArtemisConfig.appSecret = "appSecret";// 请填入appSecret
	}
	/**
	 * STEP2：设置OpenAPI接口的上下文
	 */
	private static final String ARTEMIS_PATH = "/artemis";

	//获取监控点预览取流URLv2
	public static String previewURLs(PreviewURLsRequest previewURLsRequest ){
		String previewURLsDataApi = ARTEMIS_PATH +"/api/video/v2/cameras/previewURLs";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",previewURLsDataApi);
			}
		};
		String body=JSON.toJSONString(previewURLsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取监控点回放取流URLv2
	public static String playbackURLs(PlaybackURLsRequest playbackURLsRequest ){
		String playbackURLsDataApi = ARTEMIS_PATH +"/api/video/v2/cameras/playbackURLs";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",playbackURLsDataApi);
			}
		};
		String body=JSON.toJSONString(playbackURLsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询对讲URL
	public static String talkURLs(TalkURLsRequest talkURLsRequest ){
		String talkURLsDataApi = ARTEMIS_PATH +"/api/video/v1/cameras/talkURLs";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",talkURLsDataApi);
			}
		};
		String body=JSON.toJSONString(talkURLsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据监控点编号进行云台操作
	public static String controlling(ControllingRequest controllingRequest ){
		String controllingDataApi = ARTEMIS_PATH +"/api/video/v1/ptzs/controlling";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",controllingDataApi);
			}
		};
		String body=JSON.toJSONString(controllingRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//监控点3D放大
	public static String selZoom(SelZoomRequest selZoomRequest ){
		String selZoomDataApi = ARTEMIS_PATH +"/api/video/v1/ptzs/selZoom";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",selZoomDataApi);
			}
		};
		String body=JSON.toJSONString(selZoomRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//开始手动录像
	public static String start(StartRequest startRequest ){
		String startDataApi = ARTEMIS_PATH +"/api/video/v1/manualRecord/start";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",startDataApi);
			}
		};
		String body=JSON.toJSONString(startRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//停止手动录像
	public static String stop(StopRequest stopRequest ){
		String stopDataApi = ARTEMIS_PATH +"/api/video/v1/manualRecord/stop";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",stopDataApi);
			}
		};
		String body=JSON.toJSONString(stopRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取手动录像状态
	public static String status(StatusRequest statusRequest ){
		String statusDataApi = ARTEMIS_PATH +"/api/video/v1/manualRecord/status";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",statusDataApi);
			}
		};
		String body=JSON.toJSONString(statusRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//设置预置点信息
	public static String addition(AdditionRequest additionRequest ){
		String additionDataApi = ARTEMIS_PATH +"/api/video/v1/presets/addition";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",additionDataApi);
			}
		};
		String body=JSON.toJSONString(additionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询预置点信息
	public static String searches(SearchesRequest searchesRequest ){
		String searchesDataApi = ARTEMIS_PATH +"/api/video/v1/presets/searches";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchesDataApi);
			}
		};
		String body=JSON.toJSONString(searchesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//删除预置点信息
	public static String deletion(DeletionRequest deletionRequest ){
		String deletionDataApi = ARTEMIS_PATH +"/api/video/v1/presets/deletion";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deletionDataApi);
			}
		};
		String body=JSON.toJSONString(deletionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取视频事件的图片
	public static String picture(PictureRequest pictureRequest ){
		String pictureDataApi = ARTEMIS_PATH +"/api/video/v1/events/picture";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",pictureDataApi);
			}
		};
		String body=JSON.toJSONString(pictureRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//删除巡航路径
	public static String delete(DeleteRequest deleteRequest ){
		String deleteDataApi = ARTEMIS_PATH +"/api/video/v1/cruiseRoutes/delete";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deleteDataApi);
			}
		};
		String body=JSON.toJSONString(deleteRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//巡航路径控制
	public static String controlling(ControllingRequest controllingRequest ){
		String controllingDataApi = ARTEMIS_PATH +"/api/video/v1/cruiseRoutes/controlling";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",controllingDataApi);
			}
		};
		String body=JSON.toJSONString(controllingRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//录像锁定与解锁
	public static String lock(LockRequest lockRequest ){
		String lockDataApi = ARTEMIS_PATH +"/api/video/v1/record/lock";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",lockDataApi);
			}
		};
		String body=JSON.toJSONString(lockRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//手动抓图
	public static String manualCapture(ManualCaptureRequest manualCaptureRequest ){
		String manualCaptureDataApi = ARTEMIS_PATH +"/api/video/v1/manualCapture";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",manualCaptureDataApi);
			}
		};
		String body=JSON.toJSONString(manualCaptureRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量获取监控点的预置点信息
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/video/v1/presets/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询巡航路径
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/video/v1/cruiseRoutes/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询手动录像编号
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/video/v1/manualRecord/taskId/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//添加或修改巡航路径
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/video/v1/cruiseRoutes/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取报警输出通道状态
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/video/v1/alarmOut/status/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//视频图片查询
	public static String pictureInfos(PictureInfosRequest pictureInfosRequest ){
		String pictureInfosDataApi = ARTEMIS_PATH +"/api/video/v1/pictureInfos";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",pictureInfosDataApi);
			}
		};
		String body=JSON.toJSONString(pictureInfosRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//配置报警输出通道状态
	public static String set(SetRequest setRequest ){
		String setDataApi = ARTEMIS_PATH +"/api/video/v1/alarmOut/status/set";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",setDataApi);
			}
		};
		String body=JSON.toJSONString(setRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
