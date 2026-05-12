
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:38
 */
public class ArtemisPostTest_视频网管 {
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

	//根据监控点列表查询录像完整性结果
	public static String list(ListRequest listRequest ){
		String listDataApi = ARTEMIS_PATH +"/api/nms/v1/record/list";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",listDataApi);
			}
		};
		String body=JSON.toJSONString(listRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据监控点列表查询视频质量诊断结果
	public static String list(ListRequest listRequest ){
		String listDataApi = ARTEMIS_PATH +"/api/nms/v1/vqd/list";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",listDataApi);
			}
		};
		String body=JSON.toJSONString(listRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取监控点在线状态
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/nms/v1/online/camera/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取编码设备在线状态
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/nms/v1/online/encode_device/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
