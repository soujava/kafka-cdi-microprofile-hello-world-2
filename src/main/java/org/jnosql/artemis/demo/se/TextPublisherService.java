package org.jnosql.artemis.demo.se;

import org.aerogear.kafka.SimpleKafkaProducer;
import org.aerogear.kafka.cdi.annotation.Producer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TextPublisherService {

    @Producer
    private SimpleKafkaProducer<Integer, String> producer;

    public <T> void sendMessage(String message) {
        producer.send(Config.TOPIC_TEXT, message);
    }

}
