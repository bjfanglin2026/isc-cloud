package com.isc;

import com.hikvision.artemis.sdk.ArtemisHttpUtil;
import com.hikvision.artemis.sdk.config.ArtemisConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Properties;

/**
 * ISC平台连接测试类
 * 测试平台认证 + 监控点列表获取
 */
public class VideoInitTest {

    // 平台配置
    private static String HOST;
    private static int PORT;
    private static String APP_KEY;
    private static String APP_SECRET;

    private static final String ARTEMIS_PATH = "/artemis";

    static {
        loadConfig();
        // 设置 Artemis SDK 配置
        ArtemisConfig.host = HOST + ":" + PORT;
        ArtemisConfig.appKey = APP_KEY;
        ArtemisConfig.appSecret = APP_SECRET;
    }

    /**
     * 加载配置文件
     */
    private static void loadConfig() {
        try (InputStream in = VideoInitTest.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties props = new Properties();
            props.load(in);
            HOST = props.getProperty("platform.host");
            PORT = Integer.parseInt(props.getProperty("platform.port"));
            APP_KEY = props.getProperty("platform.appKey");
            APP_SECRET = props.getProperty("platform.appSecret");
            System.out.println("配置文件加载成功");
            System.out.println("Host: " + HOST + ":" + PORT);
            System.out.println("AppKey: " + APP_KEY);
        } catch (Exception e) {
            System.err.println("配置文件加载失败: " + e.getMessage());
            System.exit(1);
        }
    }

    /**
     * 测试平台连接（查询监控点列表）
     */
    public static String searchCameras(int pageNo, int pageSize) {
        String api = ARTEMIS_PATH + "/api/resource/v2/camera/search";
        Map<String, String> path = new HashMap<>(2);
        path.put("https://", api);

        // 构造请求体
        JSONObject body = new JSONObject();
        body.put("pageNo", pageNo);
        body.put("pageSize", pageSize);

        String result = ArtemisHttpUtil.doPostStringArtemis(path, body.toJSONString(), null, null, "application/json");
        return result;
    }

    /**
     * 分页获取监控点资源
     */
    public static String getCameras(int pageNo, int pageSize) {
        String api = ARTEMIS_PATH + "/api/resource/v1/cameras";
        Map<String, String> path = new HashMap<>(2);
        path.put("https://", api);

        JSONObject body = new JSONObject();
        body.put("pageNo", pageNo);
        body.put("pageSize", pageSize);

        String result = ArtemisHttpUtil.doPostStringArtemis(path, body.toJSONString(), null, null, "application/json");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("========== ISC平台连接测试 ==========");
        System.out.println("ArtemisConfig.host = " + ArtemisConfig.host);
        System.out.println("ArtemisConfig.appKey = " + ArtemisConfig.appKey);

        try {
            System.out.println("\n--- 测试1: 分页获取监控点列表 ---");
            String result = getCameras(1, 10);
            System.out.println("响应结果: " + result);

            JSONObject json = JSON.parseObject(result);
            if (json != null && "0".equals(json.getString("code"))) {
                System.out.println("\n✅ 平台连接成功！");
                JSONObject data = json.getJSONObject("data");
                if (data != null) {
                    System.out.println("监控点总数: " + data.getInteger("total"));
                    System.out.println("本页数量: " + data.getJSONArray("list").size());
                }
            } else {
                System.out.println("\n❌ 接口返回异常: " + result);
            }

        } catch (Exception e) {
            System.err.println("\n❌ 连接失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
