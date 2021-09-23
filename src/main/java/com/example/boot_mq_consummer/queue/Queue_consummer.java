package com.example.boot_mq_consummer.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class Queue_consummer {
    @JmsListener(destination = "${myQueueName}")
    public void receive(TextMessage textMessage) throws Exception{
        String text = textMessage.getText();
        System.out.println("***消费者收到的消息:    " + text);
    }
}
