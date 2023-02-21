package lessons.stepik.modul4.ex3.task2;

public class Test2 {
    public static void main(String[] args) {
        Package package1 = new Package("мыло", 50);
        Sendable mail1 = new MailPackage("Красноярск", "Москва", package1);
        Sendable mail2 = new MailMessage("Красноярск" , "Москва", "Some message!");
        System.out.println(mail1 instanceof MailPackage);
        System.out.println(mail1 instanceof MailMessage);
        System.out.println(mail2 instanceof MailPackage);
        System.out.println(mail2 instanceof MailMessage);
    }
}
