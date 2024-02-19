package OdevSmsService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        SmsProvider twilio = new TwilioSmsProvider();
        SmsProvider nexmo = new NexmoSmsProvider();

        Scanner sec = new Scanner(System.in);
        System.out.println("Mesaj gönderilecek firmayı seçiniz : 1= Twilio 2= Nexmo");
while (true){
    try{
        int numberOfsmsProvider = sec.nextInt(); //SMS provider seçilir
        if(numberOfsmsProvider==1){

            SmsService smsService = new SmsService(twilio);
            smsService.sendSms("Bu kısım mesaj alanıdır..");
            break;

        }else if (numberOfsmsProvider == 2) {

            SmsService smsService = new SmsService(nexmo);
            smsService.sendSms("Bu kısım mesaj alanıdır..");
            break;

        }else{
            System.out.println("Yanlış bir tuşa basmış olabilirsiniz. Yeniden deneyiniz");
        }
    }
    catch (Exception InputMismatchException){
        System.out.println("Sayı giriniz.");
        break;
    }


}



    }



}
