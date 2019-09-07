package org.jnosql.artemis.demo.se;

import org.aerogear.kafka.cdi.annotation.Consumer;

import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;

@ApplicationScoped
public class TextListenerService {

    @Consumer(topics = Config.TOPIC_TEXT, groupId = Config.GROUP_ID_TEXT)
    public void receiver(final String message) {
        System.out.println("That's what I got from the message 1: " + message);
    }

}
