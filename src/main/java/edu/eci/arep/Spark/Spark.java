package edu.eci.arep.Spark;

import java.util.HashMap;
import java.util.Map;

public class Spark {
    static Map<String, RequestResponse> gets = new HashMap<String, RequestResponse>();
    static Map<String, RequestResponse> puts = new HashMap<String, RequestResponse>();

    public interface RequestResponse{
        Object process(Request request, Response response);
    }

    public static void get(String path,  RequestResponse requestResponse){
        if (!gets.containsKey(path)){
            gets.put(path, requestResponse);
        }
    }

    public static Object getGet(String path, Request request, Response response){
        return gets.get(path).process(request, response);
    }

    public static void post(String path, RequestResponse requestResponse){
        if (!puts.containsKey(path)){
            puts.put(path, requestResponse);
        }
    }

    public static Object getPost(String path, Request request, Response response){
        return puts.get(path).process(request, response);
    }

    public static Boolean isMapped(String path){
        return gets.containsKey(path);
    }

}