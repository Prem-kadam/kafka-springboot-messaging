package com.example.produccer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic createNewTopic(){
        return new NewTopic("new-topic",3,(short) 1);
    }
}
