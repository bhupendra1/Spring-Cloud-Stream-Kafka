package com.bhupendra.karki.springcloudstream.notification;

import com.bhupendra.karki.springcloudstream.controller.PersonController;
import com.bhupendra.karki.springcloudstream.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(MessageChannels.class)
public class KafkaProducer {

    private static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    @Qualifier(MessageChannels.OUTPUT)
    private MessageChannel messageChannel;

    public void sendMessage(Person person) {
        logger.info("Sending payload: {} on topic {}", MessageBuilder.withPayload(person).build(), MessageChannels.OUTPUT);
        messageChannel.send(MessageBuilder.withPayload(person).build());
    }
}
