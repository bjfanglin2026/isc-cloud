
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_人员及照片接口 {
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

	//添加人员v2
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/resource/v2/person/single/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//修改人员
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/resource/v1/person/single/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取组织下人员列表v2
	public static String personList(PersonListRequest personListRequest ){
		String personListDataApi = ARTEMIS_PATH +"/api/resource/v2/person/orgIndexCode/personList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",personListDataApi);
			}
		};
		String body=JSON.toJSONString(personListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取人员列表v2
	public static String personList(PersonListRequest personListRequest ){
		String personListDataApi = ARTEMIS_PATH +"/api/resource/v2/person/personList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",personListDataApi);
			}
		};
		String body=JSON.toJSONString(personListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询人员列表v2
	public static String personList(PersonListRequest personListRequest ){
		String personListDataApi = ARTEMIS_PATH +"/api/resource/v2/person/advance/personList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",personListDataApi);
			}
		};
		String body=JSON.toJSONString(personListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量删除人员
	public static String delete(DeleteRequest deleteRequest ){
		String deleteDataApi = ARTEMIS_PATH +"/api/resource/v1/person/batch/delete";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deleteDataApi);
			}
		};
		String body=JSON.toJSONString(deleteRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//修改人脸
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/resource/v1/face/single/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//添加人脸
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/resource/v1/face/single/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//删除人脸
	public static String delete(DeleteRequest deleteRequest ){
		String deleteDataApi = ARTEMIS_PATH +"/api/resource/v1/face/single/delete";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deleteDataApi);
			}
		};
		String body=JSON.toJSONString(deleteRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量添加人员
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/resource/v1/person/batch/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//提取人员图片
	public static String picture(PictureRequest pictureRequest ){
		String pictureDataApi = ARTEMIS_PATH +"/api/resource/v1/person/picture";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",pictureDataApi);
			}
		};
		String body=JSON.toJSONString(pictureRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取人员数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/person/personList/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//根据人员唯一字段获取人员详细信息
	public static String personInfo(PersonInfoRequest personInfoRequest ){
		String personInfoDataApi = ARTEMIS_PATH +"/api/resource/v1/person/condition/personInfo";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",personInfoDataApi);
			}
		};
		String body=JSON.toJSONString(personInfoRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取资源属性
	public static String properties(PropertiesRequest propertiesRequest ){
		String propertiesDataApi = ARTEMIS_PATH +"/api/resource/v1/resource/properties";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",propertiesDataApi);
			}
		};
		String body=JSON.toJSONString(propertiesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
