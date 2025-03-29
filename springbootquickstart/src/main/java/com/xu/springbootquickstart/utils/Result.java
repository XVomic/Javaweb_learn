package com.xu.springbootquickstart.utils;

import com.alibaba.fastjson2.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Result {
    public static String okGetString(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message","ok");
//        JOSNObject.toString()
        String s = JSONObject.toJSONString(map);
        return s;
    }
}
