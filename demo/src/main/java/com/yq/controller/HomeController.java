package com.yq.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestBody Map<String,Object> reqMap){
        System.out.println("index*************");
        System.out.println(reqMap);
        String subscribeUrl = (String) reqMap.get("subscribe_url");
        String signature = (String) reqMap.get("signature");
        String topicUrn = (String) reqMap.get("topic_urn");
        String messageId = (String) reqMap.get("message_id");
        String signatureVersion = (String) reqMap.get("signature_version");
        String type = (String) reqMap.get("type");
        String message = (String) reqMap.get("message");
        String signingCertUrl = (String) reqMap.get("signing_cert_url");
        String timestamp = (String) reqMap.get("timestamp");

        return "hello";
    }

}
