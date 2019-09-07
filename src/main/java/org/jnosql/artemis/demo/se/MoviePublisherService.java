package org.jnosql.artemis.demo.se;

import org.aerogear.kafka.SimpleKafkaProducer;
import org.aerogear.kafka.cdi.annotation.Producer;

import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;

@ApplicationScoped
public class MoviePublisherService {

    @Producer
    private SimpleKafkaProducer<Integer, JsonObject> producer;

    public <T> void sendMessage(T entity) {
        producer.send(Config.TOPIC_ENTITY, JsonUtils.toJson(entity));
    }

}
