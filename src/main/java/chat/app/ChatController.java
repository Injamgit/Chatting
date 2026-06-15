package chat.app;

import chat.app.ChatMessage;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private final ChatService chatService;

    public ChatController(
            ChatService chatService) {

        this.chatService = chatService;
    }

    @MessageMapping("/send")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(
            ChatMessage message) {

        return chatService.save(message);
    }
}