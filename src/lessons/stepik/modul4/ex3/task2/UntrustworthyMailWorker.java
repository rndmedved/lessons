package lessons.stepik.modul4.ex3.task2;

public class UntrustworthyMailWorker implements MailService{
    private final MailService realMailService = new RealMailService();
    private MailService[] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable mailProcessed = mail;
        for (MailService ms:mailServices){
            mailProcessed = ms.processMail(mailProcessed);
        }
        return realMailService.processMail(mail);
    }
    public MailService getRealMailService(){
        return realMailService;
    }
}
