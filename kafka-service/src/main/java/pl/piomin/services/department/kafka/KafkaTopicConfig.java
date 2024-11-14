package pl.piomin.services.department.kafka;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {


    public AdminClient adminClient() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093");
        return AdminClient.create(configs);
    }


    public Void createKafkaTopic() {
        AdminClient client = adminClient();
        NewTopic newTopic = new NewTopic("my_topic", 3, (short) 1);
        client.createTopics(Collections.singletonList(newTopic));
        return null;
    }
}
