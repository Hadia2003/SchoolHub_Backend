import java.time.LocalDateTime;
import java.util.*;
class Message {
    private String sender;
    String receiver;
    private String content;
    private LocalDateTime timestamp;

    public Message(String sender, String receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public void displayMessage() {
        System.out.println("From: " + sender);
        System.out.println("To: " + receiver);
        System.out.println("Message: " + content);
        System.out.println("Sent at: " + timestamp);
    }
}
