package com.bhupendra.karki.springcloudstream.notification;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannels {

    String OUTPUT = "myOutput";
    String INPUT = "myInput";

    @Output(OUTPUT)
    MessageChannel messageChannel();

    @Input(INPUT)
    SubscribableChannel inputChannel();
}
