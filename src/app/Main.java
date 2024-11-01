package app;

import app.model.Message;
import app.printer.MessagePrinter;
import app.printer.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new MessagePrinter();

        Message message1 = new Message("Привіт!", "Іван");
        Message message2 = new Message("Як справи?", null);
        Message message3 = new Message(null, null);

        printer.print(message1);
        printer.print(message2);
        printer.print(message3);

    }

}