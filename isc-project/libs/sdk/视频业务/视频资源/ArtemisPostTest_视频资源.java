
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:38
 */
public class ArtemisPostTest_视频资源 {
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

	//增量获取报警输出数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/alarmOut/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询报警输出列表
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/resource/v1/alarmOut/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询监控点列表v2
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/resource/v2/camera/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询编码设备列表v2
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/resource/v2/encodeDevice/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//分页获取监控点资源
	public static String cameras(CamerasRequest camerasRequest ){
		String camerasDataApi = ARTEMIS_PATH +"/api/resource/v1/cameras";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",camerasDataApi);
			}
		};
		String body=JSON.toJSONString(camerasRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据编号获取监控点详细信息
	public static String indexCode(IndexCodeRequest indexCodeRequest ){
		String indexCodeDataApi = ARTEMIS_PATH +"/api/resource/v1/cameras/indexCode";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",indexCodeDataApi);
			}
		};
		String body=JSON.toJSONString(indexCodeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取监控点数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/camera/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取编码设备数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/encodeDevice/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
