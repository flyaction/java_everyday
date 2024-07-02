package com.flyaction.demo.controller;


import com.flyaction.demo.annotation.LogAnnotation;
import com.flyaction.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/md")
public class Md5Controller {


    @GetMapping("/time")
    public String time(){

        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        return dateFormat.format(date);
    }

    @GetMapping("/order")
    public String order() throws Exception {
        String params = "a=1&c=3&b=2";

        Map<String, String> map = new HashMap<>();
        try {
            String[] kvs = params.split("&");
            for (String kv :kvs) {
                String[] kav = kv.split("=");
                map.put(kav[0], kav[1]);
            }
        } catch (Exception e) {
            throw new Exception("URL 参数不规范");
        }
        List<String> tmp = new ArrayList<>();
        List<Map.Entry<String, String>> infoIds = new ArrayList<>(map.entrySet());
        infoIds.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, String> item :infoIds) {
            tmp.add(item.getKey() + "=" + item.getValue());
        }
        return String.join("&", tmp);
    }

    @GetMapping("/md5")
    public String md5() throws Exception {

       // String reqStr =  "abcdefg11111111111111111111ddd";

        String paramStr = "a=1&c=3&b=2";
        String bodyStr = "{\"name\":\"xf\",\"age\":\"dd\"}";
        paramStr = order(paramStr);

        String timestamp = "20240601104455";
        String reqStr = paramStr + bodyStr;
        String secretKey = "d1209cfefe895364e03";
        reqStr = reqStr + secretKey + timestamp;


        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        byte[] btInput = reqStr.getBytes();
        MessageDigest mdInst = MessageDigest.getInstance("MD5");
        mdInst.update(btInput);
        byte[] md = mdInst.digest();
        int j = md.length;
        char[] str = new char[j * 2];
        int k = 0;
        for (byte byte0 : md) {
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];
            str[k++] = hexDigits[byte0 & 0xf];
        }
        return bytesToHexString(new String(str).getBytes("UTF-8")).toUpperCase(Locale.US);
    }


    public static String bytesToHexString(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte value : b) {
            String hex = Integer.toHexString(value & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex);
        }
        return sb.toString();
    }


    public static String order(String params) throws Exception {
        Map<String, String> map = new HashMap<>();
        try {
            String[] kvs = params.split("&");
            for (String kv :kvs) {
                String[] kav = kv.split("=");
                map.put(kav[0], kav[1]);
            }
        } catch (Exception e) {
            throw new Exception("URL 参数不规范");
        }
        List<String> tmp = new ArrayList<>();
        List<Map.Entry<String, String>> infoIds = new ArrayList<>(map.entrySet());
        infoIds.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, String> item :infoIds) {
            tmp.add(item.getKey() + "=" + item.getValue());
        }
        return String.join("&", tmp);
    }

}
