package chat.app;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessageRepository
        extends JpaRepository<ChatMessage, Long> {
}