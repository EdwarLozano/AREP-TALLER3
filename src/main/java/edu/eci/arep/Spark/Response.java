package edu.eci.arep.Spark;

import java.util.Map;

public class Response {
    String body;
    String raw;
    String status;
    String code;
    Map<String,String> headers;



    public Response(String body, String status, String code, Map<String, String> headers) {
        this.body = body;
        this.status = status;
        this.code = code;
        this.headers = headers;
    }

    public Response(String headers, String body){
        raw = headers + "\r\n" + body;
        String[] headersList = headers.split("\r\n");
        status = headersList[0].split(" ")[3];
        code = headersList[0].split(" ")[1];
        for (String header : headersList){
            if (header.contains(":")){
                this.headers.put(header.split(":")[1], body);
            }
        }
    }

    public String getHeader(String key){
        return headers.get(key);
    }

    public String getCode(){
        return code;
    }

    public String getStatus(){
        return status;
    }

    @Override
    public String toString(){
        return raw;
    }

    public String getBody(){
        return body;
    }


}