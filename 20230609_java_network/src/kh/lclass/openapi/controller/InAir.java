package kh.lclass.openapi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class InAir {
	public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B551177/StatusOfArrivals/getArrivalsCongestion"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=7DNZ0XRAzoxGtOTYQidaku8hf2iePoPfqUgaciddwHDSA160F64biYScUNIF1+kRz9xd4uq3tD8ufLiGDNn6g=="); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*데이터 행*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*데이터 표출 페이지 수*/
        urlBuilder.append("&" + URLEncoder.encode("terno","UTF-8") + "=" + URLEncoder.encode("T1", "UTF-8")); /*터미널 구분값 T1: 제1여객터미널, T2: 제2여객터미널*/
        urlBuilder.append("&" + URLEncoder.encode("airport","UTF-8") + "=" + URLEncoder.encode("HAN", "UTF-8")); /*출발지공항(IATA) 코드*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8")); /*응답유형 [xml, json] default=xml*/
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
