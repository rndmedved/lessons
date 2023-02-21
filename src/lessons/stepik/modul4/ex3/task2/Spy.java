package lessons.stepik.modul4.ex3.task2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers";
    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailMessage){
            if(mail.getFrom().equals(AUSTIN_POWERS) ||
                    mail.getTo().equals(AUSTIN_POWERS)){
                logger.log(Level.WARNING, "Detected target mail correspondence: from " + mail.getFrom() +
                        " to " + mail.getTo() + " \"" + ((MailMessage) mail).getMessage() + "\"");
            } else {
                logger.log(Level.INFO, "Usual correspondence: from " + mail.getFrom() + " to " + mail.getTo());
            }
        }
        return mail;
    }
}
