package com.example.produccer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return ()-> {
            RiderLocation riderLocation=new RiderLocation("Rider2",85.5,54.2);
            System.out.println("send :"+riderLocation.getRiderId());
            return riderLocation;
        };
    }
}
