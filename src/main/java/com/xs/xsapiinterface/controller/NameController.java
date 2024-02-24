package com.xs.xsapiinterface.controller;

import com.xs.xsapiclientsdk.model.User;
import com.xs.xsapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称API
 *
 * @author JAUX
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("xs"));
        return "GET你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        //String accessKey = request.getHeader("accessKey");
        //String nonce = request.getHeader("nonce");
        //String timestamp = request.getHeader("timestamp");
        //String sign = request.getHeader("sign");
        //String body = request.getHeader("body");
        ////todo 实际情况应该是去数据库中查是否已分配给用户
        //if (!"xsf".equals(accessKey)) {
        //    throw new RuntimeException("无权限");
        //}
        //if (Long.parseLong(nonce) > 10000) {
        //    throw new RuntimeException("无权限");
        //}
        ////时间和当前时间不能超过五分钟
        //Long currentTime = System.currentTimeMillis() /1000;
        //final Long FIVE_MINUTES = 60 * 5L;
        //if (currentTime - Long.parseLong(timestamp) >= FIVE_MINUTES) {
        //   throw new RuntimeException("无权限");
        //}
        ////todo 实际情况中是从数据库中查出secretKey
        //String serverSign = SignUtils.genSign(body, "sdffgfgrtrrdwerr");
        //if (!sign.equals(serverSign)) {
        //    throw new RuntimeException("无权限");
        //}

        return "POST用户名字是" + user.getUsername();
    }
}
