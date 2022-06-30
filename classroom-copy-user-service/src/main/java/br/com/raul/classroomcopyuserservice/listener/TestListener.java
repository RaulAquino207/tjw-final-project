package br.com.raul.classroomcopyuserservice.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestListener {

    @KafkaListener(topics = "NEW-USER", groupId = "group-1")
    public void listener(String message) {

        System.out.println("Thread: " + Thread.currentThread().getId());
        System.out.println("Received: " + message);
    }
}
