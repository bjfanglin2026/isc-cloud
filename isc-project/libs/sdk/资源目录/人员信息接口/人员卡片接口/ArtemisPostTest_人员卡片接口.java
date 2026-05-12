
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;


/**
 * Auto Create on 2026-05-06 17:47:02
 */
public class ArtemisPostTest_人员卡片接口 {
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

	//批量开卡
	public static String bindings(BindingsRequest bindingsRequest ){
		String bindingsDataApi = ARTEMIS_PATH +"/api/cis/v1/card/bindings";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",bindingsDataApi);
			}
		};
		String body=JSON.toJSONString(bindingsRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取卡片列表
	public static String cardList(CardListRequest cardListRequest ){
		String cardListDataApi = ARTEMIS_PATH +"/api/resource/v1/card/cardList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",cardListDataApi);
			}
		};
		String body=JSON.toJSONString(cardListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//获取单个卡片信息
	public static String cardInfo(CardInfoRequest cardInfoRequest ){
		String cardInfoDataApi = ARTEMIS_PATH +"/api/irds/v1/card/cardInfo";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",cardInfoDataApi);
			}
		};
		String body=JSON.toJSONString(cardInfoRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//查询卡片列表
	public static String cardList(CardListRequest cardListRequest ){
		String cardListDataApi = ARTEMIS_PATH +"/api/irds/v1/card/advance/cardList";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",cardListDataApi);
			}
		};
		String body=JSON.toJSONString(cardListRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//卡片退卡
	public static String deletion(DeletionRequest deletionRequest ){
		String deletionDataApi = ARTEMIS_PATH +"/api/cis/v1/card/deletion";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",deletionDataApi);
			}
		};
		String body=JSON.toJSONString(deletionRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//增量获取卡片数据
	public static String timeRange(TimeRangeRequest timeRangeRequest ){
		String timeRangeDataApi = ARTEMIS_PATH +"/api/resource/v1/card/timeRange";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",timeRangeDataApi);
			}
		};
		String body=JSON.toJSONString(timeRangeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量挂失
	public static String loss(LossRequest lossRequest ){
		String lossDataApi = ARTEMIS_PATH +"/api/cis/v1/card/batch/loss";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",lossDataApi);
			}
		};
		String body=JSON.toJSONString(lossRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//批量解挂
	public static String unLoss(UnLossRequest unLossRequest ){
		String unLossDataApi = ARTEMIS_PATH +"/api/cis/v1/card/batch/unLoss";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",unLossDataApi);
			}
		};
		String body=JSON.toJSONString(unLossRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}

	//生成卡片二维码
	public static String barCode(BarCodeRequest barCodeRequest ){
		String barCodeDataApi = ARTEMIS_PATH +"/api/cis/v1/card/barCode";
		Map<String,String> path = new HashMap<String,String>(2){
			{
				put("https://",barCodeDataApi);
			}
		};
		String body=JSON.toJSONString(barCodeRequest);
		String result =ArtemisHttpUtil.doPostStringArtemis(path,body,null,null,"application/json");
		return result;
	}


}
