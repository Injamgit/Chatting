//package chat.app;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/messages")
//public class MessageController {
//
//    private final ChatService chatService;
//
//    public MessageController(
//            ChatService chatService) {
//
//        this.chatService = chatService;
//    }
//
//    @GetMapping
//    public List<ChatMessage> getMessages() {
//
//        return chatService.getAllMessages();
//    }
//}