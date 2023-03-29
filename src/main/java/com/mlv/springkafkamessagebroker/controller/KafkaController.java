package com.mlv.springkafkamessagebroker.controller;

import com.mlv.springkafkamessagebroker.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private Producer producer;

    @GetMapping("/message")
    public void eventSender(@RequestParam("message") String message){
        producer.sendEvent(message);
    }
}
