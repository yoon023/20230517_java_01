package kh.lclass.openapi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

//SERVICE_KEY_IS_NOT_REGISTERED_ERROR
public class FoodRadi {
	   public static void main(String[] args) throws IOException {
	        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1471000/IprtFoodRadInspStusService/getYrNatnRadInspStusInq"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "="); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("3", "UTF-8")); /*한 페이지 결과 수*/
	        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*응답데이터 형식(xml/json) default : xml*/
	        urlBuilder.append("&" + URLEncoder.encode("PRCS_DT","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*검사연도*/
	        urlBuilder.append("&" + URLEncoder.encode("MNFT_NATN_CD_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*국가명*/
	        urlBuilder.append("&" + URLEncoder.encode("PRDLST_NM","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*품목명*/
	        URL url = new URL(urlBuilder.toString());
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("GET");
	        conn.setRequestProperty("Content-type", "application/json");
	        System.out.println("Response code: " + conn.getResponseCode());
	        BufferedReader rd;
	        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        } else {
	            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	        }
	        StringBuilder sb = new StringBuilder();
	        String line;
	        while ((line = rd.readLine()) != null) {
	            sb.append(line);
	        }
	        rd.close();
	        conn.disconnect();
	        System.out.println(sb.toString());
	    }
}
