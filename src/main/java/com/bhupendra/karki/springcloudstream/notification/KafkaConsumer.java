package com.bhupendra.karki.springcloudstream.notification;

import com.bhupendra.karki.springcloudstream.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

@EnableBinding(MessageChannels.class)
public class KafkaConsumer {

    private static Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @StreamListener(MessageChannels.INPUT)
    public void listenToMessages(@Payload Person person) {
        logger.info("message received: {} on topic {}", person, MessageChannels.INPUT);
    }

}
