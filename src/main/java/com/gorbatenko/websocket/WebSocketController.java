package com.gorbatenko.websocket;


import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        System.out.println(HtmlUtils.htmlEscape(message.getName()));
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }





}

