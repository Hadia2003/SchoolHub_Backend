import java.util.*;
interface Chat {
    void sendMessage(Message message);
    List<Message> receiveMessages(String user);
}

// Chat functionality implementing Chat interface
class CommunicationHub implements Chat {
    private List<Message> messages;

    public CommunicationHub() {
        this.messages = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message) {
        messages.add(message);
        System.out.println("Message sent successfully.");
    }

    @Override
    public List<Message> receiveMessages(String user) {
        List<Message> userMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.receiver.equals(user)) {
                userMessages.add(message);
            }
        }
        return userMessages;
    }
}

