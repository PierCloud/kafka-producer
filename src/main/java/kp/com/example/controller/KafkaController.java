package kp.com.example.controller;

import io.swagger.annotations.*;
import kp.com.example.producer.service.TopicProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
@Api(value = "HelloWorldSpringBootSwagger", tags = "Controller di prova ")
public class KafkaController {
    @ApiModelProperty(notes = "referenza al servizio producer")
    private final TopicProducerService topicProducer;

    @ApiOperation(value = "inoltra payload dati su kafka", notes = "payload = string")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "messaggio inoltrato"),
            @ApiResponse(code = 404, message = "none")})

    @GetMapping(value = "/send")
    public void send(){
        topicProducer.send("messaggio di prova del topic");
    }
}
