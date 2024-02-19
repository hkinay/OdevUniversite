package OdevSmsService;

public class SmsService {
    //Bu sınıf ile sms sağlayıcısına bağımlılık enjekte edilir. Bu sayede sendSms metodunu kullanan sms sağlayıcıları artabilir
    private SmsProvider smsProvider;

    public SmsService(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }
    public void sendSms(String message){
        smsProvider.sendSms(message);
    }
}
