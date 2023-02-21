package lessons.stepik.modul4.ex3.task2;

public class Inspector implements MailService{

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage){
            if(((MailPackage) mail).getContent().getContent().contains("stones")){
                throw new StolenPackageException();
            } else if(((MailPackage) mail).getContent().getContent().equals(WEAPONS) ||
            ((MailPackage) mail).getContent().getContent().equals(BANNED_SUBSTANCE)){
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
class IllegalPackageException extends RuntimeException{}
class StolenPackageException extends  RuntimeException{}

