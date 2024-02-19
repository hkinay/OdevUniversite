package OdevSmsService;

public class NexmoSmsProvider implements SmsProvider{
    @Override
    public void sendSms(String message) {
        System.out.printf("Nexmo ile SMS Gönderimi yapılıyor. %s%n",message);
    }
}
