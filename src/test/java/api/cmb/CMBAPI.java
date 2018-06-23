package api.cmb;

import api.cmb.dto.CMBRequest;
import api.cmb.dto.DCOPDPAYX;
import api.cmb.dto.Info;
import api.cmb.dto.SDKPAYRQX;
import com.alibaba.fastjson.JSON;
import com.baili.utils.JaxbObjectAndXmlUtil;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.Charset;

public class CMBAPI {

    public String url ="http://localhost:8080";

    @Test
    public void payment() throws IOException {
        CMBRequest cmbRequest = getCMBRequest();
        String xml = JaxbObjectAndXmlUtil.object2Xml(cmbRequest, "UTF-8");
        System.out.println("xml = " + xml);
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        String response = Request.Post(url).bodyStream(is).
                bodyString(xml,ContentType.TEXT_HTML).execute().
                returnContent().asString(Charset.forName("GBK"));
        System.out.println("response = " + response);
//        sendRequest(xml);
    }
    /**
     * 连接前置机，发送请求报文，获得返回报文
     *
     * @param data
     * @return
     * @throws MalformedURLException
     */
    private String sendRequest(String data) {
        String result = "";
        try {
            URL target = new URL(url);
            HttpURLConnection conn;
            conn = (HttpURLConnection) target.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            OutputStream os;
            os = conn.getOutputStream();
            System.out.println("data.toString() = \n" + data.toString());
            os.write(data.getBytes("UTF-8"));
            os.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn
                    .getInputStream(),"GBK"));
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println(result);
            br.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        CMBRequest cmbRequest = getCMBRequest();
        String xml = JaxbObjectAndXmlUtil.object2Xml(cmbRequest, "gbk");
        System.out.println("xml = " + xml);
        CMBRequest request = JaxbObjectAndXmlUtil.xml2Object(xml, CMBRequest.class, "gbk");
        System.out.println("request = " + JSON.toJSONString(request));
    }

    private static CMBRequest getCMBRequest() {
        DCOPDPAYX dcopdpayx = new DCOPDPAYX.Builder().setBNKFLG("北京市")
                .setCCYNBR("br").setCRTACC("杀死").build();

        Info info = new Info();
        info.setDattyp("d");
//        info.setFunnam("");
        info.setLgnnam("name");

        SDKPAYRQX sdkpayrqx = new SDKPAYRQX();
        sdkpayrqx.setBuscod("w");

        CMBRequest cmbRequest = new CMBRequest();
        cmbRequest.setDcopdpayx(dcopdpayx);
        cmbRequest.setInfo(info);
        cmbRequest.setSdkpayrqx(sdkpayrqx);

        return cmbRequest;
    }

}
