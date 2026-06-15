package chat.app;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String content;


    private LocalDateTime timestamp;

    public ChatMessage() {
    }

    public ChatMessage(String sender,
                       String content) {
        this.sender = sender;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    // getters setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}