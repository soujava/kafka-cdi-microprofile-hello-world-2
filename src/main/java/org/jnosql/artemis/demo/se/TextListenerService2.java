package org.jnosql.artemis.demo.se;

import org.aerogear.kafka.cdi.annotation.Consumer;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TextListenerService2 {

    @Consumer(topics = Config.TOPIC_TEXT, groupId = Config.GROUP_ID_TEXT_2)
    public void receiver(final String message) {
        System.out.println("That's what I got from the text message2: " + message);
    }

}
