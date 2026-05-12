
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:38
 */
public class ArtemisPostTest_视频参数配置 {
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

	//获取视频OSD显示参数
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/video/v1/picParams/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取视频叠加字符串参数
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/video/v1/showStringParams/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取预览画面参数配置
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/video/v1/videoParams/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//设置视频OSD显示参数
	public static String udpate(UdpateRequest udpateRequest ){
		String udpateDataApi = ARTEMIS_PATH +"/api/video/v1/picParams/udpate";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",udpateDataApi);
			}
		};
		String body=JSON.toJSONString(udpateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//设置视频叠加字符串参数
	public static String udpate(UdpateRequest udpateRequest ){
		String udpateDataApi = ARTEMIS_PATH +"/api/video/v1/showStringParams/udpate";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",udpateDataApi);
			}
		};
		String body=JSON.toJSONString(udpateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//设置预览画面参数配置
	public static String udpate(UdpateRequest udpateRequest ){
		String udpateDataApi = ARTEMIS_PATH +"/api/video/v1/videoParams/udpate";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",udpateDataApi);
			}
		};
		String body=JSON.toJSONString(udpateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
