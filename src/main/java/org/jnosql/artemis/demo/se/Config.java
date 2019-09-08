package org.jnosql.artemis.demo.se;


import org.aerogear.kafka.cdi.annotation.KafkaConfig;

//@KafkaConfig(bootstrapServers = "localhost:9092")
@KafkaConfig(bootstrapServers = "#{kafka_host}:#{kafka_port}")
public class Config {

    static final String TOPIC_ENTITY = "movie";

    static final String GROUP_ID_ENTITY = "movie_group";


    static final String TOPIC_TEXT = "text";

    static final String GROUP_ID_TEXT = "text_group";

    static final String GROUP_ID_TEXT_2 = "text_group_2";
}
