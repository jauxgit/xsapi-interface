package com.xs.xsapiinterface;

import com.xs.xsapiclientsdk.client.XsApiClient;
import com.xs.xsapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class XsapiInterfaceApplicationTests {

    @Resource
    private XsApiClient xsApiClient;

    @Test
    void contextLoads() {
        String result = xsApiClient.getNameByGet("xiaoshan");
        User user = new User();
        user.setUsername("xiaoshan8");
        String userNameByPost = xsApiClient.getUserNameByPost(user);
        System.out.println(result);
        System.out.println(userNameByPost);
    }

}
