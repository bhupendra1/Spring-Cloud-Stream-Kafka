package com.bhupendra.karki.springcloudstream.controller;

import com.bhupendra.karki.springcloudstream.model.Person;
import com.bhupendra.karki.springcloudstream.notification.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/api/person")
    public void postPerson(@RequestBody Person person) {
        kafkaProducer.sendMessage(person);
    }
}
