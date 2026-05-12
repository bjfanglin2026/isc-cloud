
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:38
 */
public class ArtemisPostTest_电视墙 {
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

	//获取电视墙大屏信息
	public static String allResources(AllResourcesRequest allResourcesRequest ){
		String allResourcesDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/allResources";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",allResourcesDataApi);
			}
		};
		String body=JSON.toJSONString(allResourcesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取电视墙场景列表信息
	public static String scenes(ScenesRequest scenesRequest ){
		String scenesDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/scenes";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",scenesDataApi);
			}
		};
		String body=JSON.toJSONString(scenesRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//电视墙场景切换
	public static String switch(SwitchRequest switchRequest ){
		String switchDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/scene/switch";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",switchDataApi);
			}
		};
		String body=JSON.toJSONString(switchRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取电视墙窗口信息列表
	public static String get(GetRequest getRequest ){
		String getDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/wnds/get";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",getDataApi);
			}
		};
		String body=JSON.toJSONString(getRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量上墙
	public static String add(AddRequest addRequest ){
		String addDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/realplay/add";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",addDataApi);
			}
		};
		String body=JSON.toJSONString(addRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量下墙
	public static String delete(DeleteRequest deleteRequest ){
		String deleteDataApi = ARTEMIS_PATH +"/api/tvms/v1/tvwall/realplay/delete";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deleteDataApi);
			}
		};
		String body=JSON.toJSONString(deleteRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//删除报警
	public static String deletion(DeletionRequest deletionRequest ){
		String deletionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/alarm/deletion";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deletionDataApi);
			}
		};
		String body=JSON.toJSONString(deletionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//场景修改
	public static String update(UpdateRequest updateRequest ){
		String updateDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/scene/update";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",updateDataApi);
			}
		};
		String body=JSON.toJSONString(updateRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//场景创建
	public static String addition(AdditionRequest additionRequest ){
		String additionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/scene/addition";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",additionDataApi);
			}
		};
		String body=JSON.toJSONString(additionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//场景删除
	public static String deletion(DeletionRequest deletionRequest ){
		String deletionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/scene/deletion";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deletionDataApi);
			}
		};
		String body=JSON.toJSONString(deletionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//场景另存为
	public static String saveAs(SaveAsRequest saveAsRequest ){
		String saveAsDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/scene/saveAs";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",saveAsDataApi);
			}
		};
		String body=JSON.toJSONString(saveAsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//新增报警
	public static String addition(AdditionRequest additionRequest ){
		String additionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/alarm/addition";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",additionDataApi);
			}
		};
		String body=JSON.toJSONString(additionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口分割
	public static String division(DivisionRequest divisionRequest ){
		String divisionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnd/division";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",divisionDataApi);
			}
		};
		String body=JSON.toJSONString(divisionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口批量创建
	public static String addition(AdditionRequest additionRequest ){
		String additionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnds/addition";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",additionDataApi);
			}
		};
		String body=JSON.toJSONString(additionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口批量删除
	public static String deletion(DeletionRequest deletionRequest ){
		String deletionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnds/deletion";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deletionDataApi);
			}
		};
		String body=JSON.toJSONString(deletionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口放大
	public static String zoomIn(ZoomInRequest zoomInRequest ){
		String zoomInDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnd/zoomIn";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",zoomInDataApi);
			}
		};
		String body=JSON.toJSONString(zoomInRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口漫游
	public static String move(MoveRequest moveRequest ){
		String moveDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnd/move";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",moveDataApi);
			}
		};
		String body=JSON.toJSONString(moveRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口置顶或置底
	public static String layerCtrl(LayerCtrlRequest layerCtrlRequest ){
		String layerCtrlDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnd/layerCtrl";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",layerCtrlDataApi);
			}
		};
		String body=JSON.toJSONString(layerCtrlRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//窗口还原
	public static String zoomOut(ZoomOutRequest zoomOutRequest ){
		String zoomOutDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/floatWnd/zoomOut";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",zoomOutDataApi);
			}
		};
		String body=JSON.toJSONString(zoomOutRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//非开窗设备窗口分割
	public static String division(DivisionRequest divisionRequest ){
		String divisionDataApi = ARTEMIS_PATH +"/api/tvms/v1/public/tvwall/monitor/division";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",divisionDataApi);
			}
		};
		String body=JSON.toJSONString(divisionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
