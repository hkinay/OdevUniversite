package OdevSmsService;

public class TwilioSmsProvider implements SmsProvider{
    @Override
    public void sendSms(String message) {
        System.out.printf("Twilio ile SMS Gönderimi yapılıyor. %s%n",message);

    }
}
