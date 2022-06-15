package kp.com.example.controller;

import kp.com.example.producer.service.TopicProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final TopicProducerService topicProducer;
    @GetMapping(value = "/send")
    public void send(){
        topicProducer.send("messaggio di prova del topic");
    }
}
