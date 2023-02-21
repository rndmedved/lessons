package lessons.stepik.modul4.ex3.task2;

public class Thief implements MailService{
    private int minMailPrice;
    private int stolenValue;

    public Thief(int minMailPrice) {
        this.minMailPrice = minMailPrice;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable stolenMail = mail;
        if(mail instanceof MailPackage){
            if (((MailPackage) mail).getContent().getPrice() >= minMailPrice){
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                stolenMail = new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0));
            }
        }
        return stolenMail;
    }
    public int getStolenValue(){
        return stolenValue;
    }
}
