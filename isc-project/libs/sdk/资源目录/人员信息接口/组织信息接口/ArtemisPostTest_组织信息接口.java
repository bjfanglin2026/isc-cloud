
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_组织信息接口 {
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

	//获取根组织
	public static String rootOrg(RootOrgRequest rootOrgRequest ){
		String rootOrgDataApi = ARTEMIS_PATH +"/api/resource/v1/org/rootOrg";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",rootOrgDataApi);
			}
		};
		String body=JSON.toJSONString(rootOrgRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量添加组织
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/resource/v1/org/batch/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询组织列表v2
	public static String orgList(OrgListRequest orgListRequest ){
		String orgListDataApi = ARTEMIS_PATH +"/api/resource/v2/org/advance/orgList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",orgListDataApi);
			}
		};
		String body=JSON.toJSONString(orgListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据父组织编号获取下级组织列表
	public static String subOrgList(SubOrgListRequest subOrgListRequest ){
		String subOrgListDataApi = ARTEMIS_PATH +"/api/resource/v1/org/parentOrgIndexCode/subOrgList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",subOrgListDataApi);
			}
		};
		String body=JSON.toJSONString(subOrgListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//修改组织
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/resource/v1/org/single/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量删除组织
	public static String delete(DeleteRequest deleteRequest ){
		String deleteDataApi = ARTEMIS_PATH +"/api/resource/v1/org/batch/delete";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deleteDataApi);
			}
		};
		String body=JSON.toJSONString(deleteRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取组织数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/org/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据组织编号获取组织详细信息
	public static String orgInfo(OrgInfoRequest orgInfoRequest ){
		String orgInfoDataApi = ARTEMIS_PATH +"/api/resource/v1/org/orgIndexCodes/orgInfo";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",orgInfoDataApi);
			}
		};
		String body=JSON.toJSONString(orgInfoRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
