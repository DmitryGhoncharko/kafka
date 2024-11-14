package pl.piomin.services.department.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "my_topic", groupId = "my_group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}

