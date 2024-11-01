package app.printer;

import app.model.Message;

public class MessagePrinter implements Printer {

    public void print(Message message) {

        if (message.getText() == null && message.getSender() == null) {

            Runnable emptyMessageHandler = new Runnable() {

                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");

                }

            };

            emptyMessageHandler.run();
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());

        }

    }

}