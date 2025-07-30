package multiThreading.task10;

class Chat {
    boolean questionAsked = false;

    public synchronized void sendMessage(String msg) throws InterruptedException {
        if (questionAsked) wait();
        System.out.println("Sender: " + msg);
        questionAsked = true;
        notify();
    }

    public synchronized void receiveMessage(String msg) throws InterruptedException {
        if (!questionAsked) wait();
        System.out.println("Receiver: " + msg);
        questionAsked = false;
        notify();
    }
}

public class Task10 {
    public static void main(String[] args) {
        Chat chat = new Chat();

        String[] questions = {"Hi!", "How are you?", "What's up?"};
        String[] answers = {"Hello!", "I'm good.", "All good here."};

        Thread sender = new Thread(() -> {
            try {
                for (String q : questions) {
                    chat.sendMessage(q);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread receiver = new Thread(() -> {
            try {
                for (String a : answers) {
                    chat.receiveMessage(a);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        sender.start();
        receiver.start();
    }
}

