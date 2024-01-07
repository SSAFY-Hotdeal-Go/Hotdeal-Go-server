package com.budge.hotdeal_go.model.service;

import org.springframework.stereotype.Service;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;

@Service
public class FirebaseService {

    public String sendNotification(String content, String token) throws FirebaseMessagingException {
        Message message = Message.builder()
                .setToken(token)
                .putData("title", content)
                .build();

        String response = FirebaseMessaging.getInstance().send(message);
        
        return response;
    }
}