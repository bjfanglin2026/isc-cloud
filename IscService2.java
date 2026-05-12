    /**
     * 获取监控点预览取流URL
     */
    public String getPreviewUrl(String cameraIndexCode, int streamType, String protocol) {
        String api = ARTEMIS_PATH + "/api/video/v2/cameras/previewURLs";
        Map<String, String> path = new HashMap<>(2);
        path.put("https://", api);

        JSONObject body = new JSONObject();
        body.put("cameraIndexCode", cameraIndexCode);
        body.put("streamType", streamType);
        body.put("protocol", protocol != null ? protocol : "TCP");

        String result = doPost(api, body.toJSONString());
        logger.info("getPreviewUrl 响应: {}", result);
        return result;
    }
