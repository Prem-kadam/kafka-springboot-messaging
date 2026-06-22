package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "mytopic" ,groupId="mygroup")
    public void listen(String message){
        System.out.println("Recieve Message:"+ message);
    }

}
