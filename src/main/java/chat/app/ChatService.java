package chat.app;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatService {

    private final ChatMessageRepository repository;

    public ChatService(
            ChatMessageRepository repository) {

        this.repository = repository;
    }

    public ChatMessage save(
            ChatMessage message) {

        message.setTimestamp(
                LocalDateTime.now());

        return repository.save(message);
    }

    public List<ChatMessage> getAllMessages() {

        return repository.findAll();
    }
}