
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:48:07
 */
public class ArtemisPostTest_事件服务接口 {
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

	//按事件类型取消订阅
	public static String eventUnSubscriptionByEventTypes(EventUnSubscriptionByEventTypesRequest eventUnSubscriptionByEventTypesRequest ){
		String eventUnSubscriptionByEventTypesDataApi = ARTEMIS_PATH +"/api/eventService/v1/eventUnSubscriptionByEventTypes";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",eventUnSubscriptionByEventTypesDataApi);
			}
		};
		String body=JSON.toJSONString(eventUnSubscriptionByEventTypesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//按事件类型订阅事件
	public static String eventSubscriptionByEventTypes(EventSubscriptionByEventTypesRequest eventSubscriptionByEventTypesRequest ){
		String eventSubscriptionByEventTypesDataApi = ARTEMIS_PATH +"/api/eventService/v1/eventSubscriptionByEventTypes";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",eventSubscriptionByEventTypesDataApi);
			}
		};
		String body=JSON.toJSONString(eventSubscriptionByEventTypesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询事件订阅信息
	public static String eventSubscriptionView(EventSubscriptionViewRequest eventSubscriptionViewRequest ){
		String eventSubscriptionViewDataApi = ARTEMIS_PATH +"/api/eventService/v1/eventSubscriptionView";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",eventSubscriptionViewDataApi);
			}
		};
		String body=JSON.toJSONString(eventSubscriptionViewRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取联动事件列表
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/els/v1/events/search";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",searchDataApi);
			}
		};
		String body=JSON.toJSONString(searchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
