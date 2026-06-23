package com.example.produccer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class Producer {
//
//    private KafkaTemplate<String,RiderLocation> kafkaTemplate;
//
//    public Producer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    @PostMapping("send")
//    public String sendMessage(@RequestParam String message){
//        RiderLocation riderLocation=new RiderLocation("rider1",14.24,53.19);
//         kafkaTemplate.send("new-topic",riderLocation);
//         return "send: "+riderLocation.getRiderId();
//    }
//
//
//
//}
//
