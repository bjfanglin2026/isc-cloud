import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import java.util.HashMap;
import java.util.Map;

public class TestUrl {
    static {
        com.hikvision.artemis.sdk.config.ArtemisConfig.host = "172.16.18.85:443";
        com.hikvision.artemis.sdk.config.ArtemisConfig.appKey = "27133966";
        com.hikvision.artemis.sdk.config.ArtemisConfig.appSecret = "aTbADLtEFsjhSHCNIXuO";
    }
    public static void main(String[] args) {
        String api = "/artemis/api/video/v2/cameras/previewURLs";
        Map<String,String> path = new HashMap<>();
        path.put("https://", api);
        JSONObject body = new JSONObject();
        body.put("cameraIndexCode", "ff78b27895484c3291fd87b7e4774999");
        body.put("streamType", 0);
        body.put("protocol", "TCP");
        String result = ArtemisHttpUtil.doPostStringArtemis(path, body.toJSONString(), null, null, "application/json");
        System.out.println(result);
        JSONObject json = JSON.parseObject(result);
        if ("0".equals(json.getString("code"))) {
            JSONObject data = json.getJSONObject("data");
            System.out.println("URL: " + (data != null ? data.getString("url") : "null"));
        }
    }
}
