Java SDK目录说明
1.SDK压缩文件中含有3个文件夹：
   1)entity文件夹:该文件夹目录层级：接口分组名文件夹/接口名文件夹/接口的入参对象；
   2)SDK文件夹：该文件夹目录层级：接口分组名文件夹/接口名文件夹/调用接口方法的类文件。
2.API网关调用SDK依赖说明：
   1)需要使用maven引入API网关接口调用SDK，maven坐标为：
       <dependency>
            <groupId>com.hikvision.ga</groupId>
            <artifactId>artemis-http-client</artifactId>
            <version>1.1.2</version>
       </dependency>
   2)最新版本API网关接口调用SDK请在https://open.hikvision.com -> 文档->软件产品->智能应用平台->对接指南 中获取
   3)API网关接口调用SDK使用说明请参考《artemis-http-client说明文档.pdf》
3.注意事项：
  1)根据实际情况填入host、appKey、appSecret信息。
  