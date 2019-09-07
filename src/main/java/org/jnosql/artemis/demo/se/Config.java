package org.jnosql.artemis.demo.se;


import org.aerogear.kafka.cdi.annotation.KafkaConfig;

@KafkaConfig(bootstrapServers = "#{kafka_host}:#{kafka_port}")
public class Config {

    static final String TOPIC_ENTITY = "movie";

    static final String GROUP_ID_ENTITY = "movie_group";


    static final String TOPIC_TEXT = "text";

    static final String GROUP_ID_TEXT = "text_group";
}
