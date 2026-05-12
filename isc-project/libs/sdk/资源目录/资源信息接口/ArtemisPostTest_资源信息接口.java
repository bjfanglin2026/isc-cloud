
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_资源信息接口 {
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

	//查询资源列表v2
	public static String resourcesByParams(ResourcesByParamsRequest resourcesByParamsRequest ){
		String resourcesByParamsDataApi = ARTEMIS_PATH +"/api/irds/v2/resource/resourcesByParams";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",resourcesByParamsDataApi);
			}
		};
		String body=JSON.toJSONString(resourcesByParamsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据区域获取下级资源列表v2
	public static String subResources(SubResourcesRequest subResourcesRequest ){
		String subResourcesDataApi = ARTEMIS_PATH +"/api/irds/v2/resource/subResources";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",subResourcesDataApi);
			}
		};
		String body=JSON.toJSONString(subResourcesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取资源列表v2
	public static String resources(ResourcesRequest resourcesRequest ){
		String resourcesDataApi = ARTEMIS_PATH +"/api/irds/v2/deviceResource/resources";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",resourcesDataApi);
			}
		};
		String body=JSON.toJSONString(resourcesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取资源数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/resource/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据编号查询资源详细信息
	public static String search(SearchRequest searchRequest ){
		String searchDataApi = ARTEMIS_PATH +"/api/resource/v1/resource/indexCodes/search";
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
