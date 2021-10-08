package ru.pk.testkafka.test2.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestProducer1 {
    private static final String TOPIC = "test-topic1";

    @Autowired
    private KafkaTemplate<String, String> sendTenmplate;

    public void send(String value) {
        sendTenmplate.send(TOPIC, value);
    }

}
