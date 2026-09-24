package mini_project;

interface Notification {
    void sendMessage();
}


class Email implements Notification {
    public void sendMessage(){
        System.out.println("sending Email");
    }
}

class SMS   implements Notification {
    public void sendMessage(){
        System.out.println("sending SMS");
    }
}

class WhatsApp implements Notification {
    public void sendMessage(){
        System.out.println("sending WhatsApp");
    }
}

public class alertsms {
    public static void main(String[] args){
        Email email = new Email();
        email.sendMessage();

        SMS sms = new SMS();
        sms.sendMessage();

        WhatsApp whatsApp = new WhatsApp();
        whatsApp.sendMessage();
    }
}