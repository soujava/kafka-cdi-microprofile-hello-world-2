package org.jnosql.artemis.demo.se;

import org.aerogear.kafka.cdi.annotation.Consumer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;

@ApplicationScoped
public class MovieListenerService {

    @Consumer(topics = Config.TOPIC_ENTITY, groupId = Config.GROUP_ID_ENTITY)
    public void receiver(final JsonObject message) {
        final Movie entity = JsonUtils.fromJson(message, Movie.class);
        System.out.println("That's what I got from the entity: " + entity);
    }

    @PostConstruct
    public void init() {
        System.out.println("init listener for entity");
    }
}
