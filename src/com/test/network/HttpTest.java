package com.test.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class TestHttpRequest { //작동순서,작동원리 중요!! 

    public static void testHttpRequest(String targetURL, String parameter) throws Exception {
        HttpURLConnection connection = null; //서버와 HTTP 연결통로 만듬

 
        //URL 객체 생성
        URL url = new URL(targetURL); //MalformedURLException
        //HTTP Server와의 Connection 설정
        connection = (HttpURLConnection)url.openConnection(); //IoException

        //HTTP Request 메세지의 헤드값 설정
        connection.setRequestMethod("POST"); //ProtocolException
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Content-Language", "ko-KR");

        //HTTP 서버로 데이터 전송 시 행할 선택 사항
        connection.setUseCaches(false); //캐쉬 설정 안함

        //위의 설정대로 HTTP서버로 데이터 전송을 함.
        connection.setDoOutput(true); 

        //Request
        //HEADER 값 전송
        DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
        //BODY 값 전송
        wr.write(parameter.getBytes("UTF-8"));
        //임시로 버퍼에 저장된 값을 출력(전송)
        wr.flush();
        wr.close();


        //Response 받기
        int responseCode = connection.getResponseCode(); //상태값
        BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

        StringBuilder response = new StringBuilder();
        String line;
        while((line = rd.readLine())!= null){
            response.append(line).toString();
            response.append("\r\n"); //CR (Carriage Return) -->타자기
        }
        rd.close(); //BufferedReader 닫아줌

        System.out.println("HTTP 응답 코드 : " + responseCode);
        System.out.println("HTTP 응답 헤더 :" + connection.getHeaderFields());
        System.out.println("HTTP BODY :"+response.toString());

        connection.disconnect();
      
    }

    
}

public class HttpTest {

    public static void main(String[] args) throws Exception { //위에서 throws 사용하니까 똑같이 사용
        String targetURL = "http://127.0.0.1:8080/board/write";
        String parameters ="writer=김철수&title=컨티션난감&content=안타깝네요";

        TestHttpRequest.testHttpRequest(targetURL, parameters);

        
    }
}
