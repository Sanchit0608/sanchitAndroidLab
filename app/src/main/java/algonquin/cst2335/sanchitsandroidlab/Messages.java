package algonquin.cst2335.sanchitsandroidlab;

public class Messages {
    public long id;
    String messageInput;
    public Boolean sendOrReceive;

    Messages(String messageIn, Boolean SorR) {
        this.messageInput = messageIn;
        this.sendOrReceive = SorR;

    }

    Messages(String messageIn, Boolean SorR, long id) {
        this.messageInput = messageIn;
        this.sendOrReceive = SorR;
        this.id=id;

    }




    public String getMessageInput() {
        return messageInput;
    }

    public long getId() {
        return id;
    }
}