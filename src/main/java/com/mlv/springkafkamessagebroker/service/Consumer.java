package com.mlv.springkafkamessagebroker.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics = "mano_topic",groupId = "mano_group")
    public void getEvent(String message){
        System.out.println("I am a Consumer and I have Received the event from Producer(mano_topic) :"+message);
    }
}
