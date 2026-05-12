
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_区域信息接口 {
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

	//获取根区域信息
	public static String root(RootRequest rootRequest ){
		String rootDataApi = ARTEMIS_PATH +"/api/resource/v1/regions/root";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",rootDataApi);
			}
		};
		String body=JSON.toJSONString(rootRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询区域列表v2
	public static String nodesByParams(NodesByParamsRequest nodesByParamsRequest ){
		String nodesByParamsDataApi = ARTEMIS_PATH +"/api/irds/v2/region/nodesByParams";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",nodesByParamsDataApi);
			}
		};
		String body=JSON.toJSONString(nodesByParamsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据区域编号获取下一级区域列表v2
	public static String subRegions(SubRegionsRequest subRegionsRequest ){
		String subRegionsDataApi = ARTEMIS_PATH +"/api/resource/v2/regions/subRegions";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",subRegionsDataApi);
			}
		};
		String body=JSON.toJSONString(subRegionsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//修改区域
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/resource/v1/region/single/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取区域数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/region/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量添加区域
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/resource/v1/region/batch/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据编号获取区域详细信息
	public static String regionInfo(RegionInfoRequest regionInfoRequest ){
		String regionInfoDataApi = ARTEMIS_PATH +"/api/resource/v1/region/regionCatalog/regionInfo";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",regionInfoDataApi);
			}
		};
		String body=JSON.toJSONString(regionInfoRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
