package com.KafkaSpringBootConsumer.consumer;


import com.KafkaSpringBootConsumer.dto.Customer;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class KafkaMessageListener {
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "kafka-json-topics2", groupId = "kafka-consumer-grp-4json")
    public void consumer(Customer customer) {
        log.info("consumer receiving messages {}", customer);
    }

//    @KafkaListener(topics = "kafka-con-prod-topics", groupId = "kafka-consumer-grp2")
//    public void consumer2(String message) {
//        log.info("consumer2 receiving messages {}", message);
//    }
//
//    @KafkaListener(topics = "kafka-con-prod-topics", groupId = "kafka-consumer-grp2")
//    public void consumer3(String message) {
//        log.info("consumer3 receiving messages {}", message);
//    }
//
//    @KafkaListener(topics = "kafka-con-prod-topics", groupId = "kafka-consumer-grp2")
//    public void consumer4(String message) {
//        log.info("consumer4 receiving messages {}", message);
//    }


}
