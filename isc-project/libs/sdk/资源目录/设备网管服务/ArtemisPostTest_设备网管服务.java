
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_设备网管服务 {
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

	//获取资源的历史在线记录
	public static String history_status(History_statusRequest history_statusRequest ){
		String history_statusDataApi = ARTEMIS_PATH +"/api/nms/v1/online/history_status";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",history_statusDataApi);
			}
		};
		String body=JSON.toJSONString(history_statusRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
