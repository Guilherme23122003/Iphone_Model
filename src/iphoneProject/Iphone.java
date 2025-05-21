package iphoneProject;

public class Iphone {
    public static void main(String[] args) throws Exception {
        //Instanciando as aplicações:
        System.out.println("-------------------------");
        ClockPhone iClock = new ClockPhone();
        EmailPhone iEmail = new EmailPhone();
        BrowserPhone iBrowserPhone = new BrowserPhone();
        System.out.println("-------------------------");

        //ClockPhone e seus recursos:
        System.out.println("-------------------------");
        iClock.ligar();
        iClock.showClock();
        iClock.alarmeSoud();
        iClock.desligar();
        System.out.println("-------------------------");

        //EmailPhone e seus recursos:
        System.out.println("-------------------------");
        iEmail.ligar();
        iEmail.sendMensagem();
        iEmail.takeMensagem();
        iEmail.deleteMensagem();
        iEmail.desligar();
        System.out.println("-------------------------");


        //iBrowserPhone e seus recursos:
        System.out.println("-------------------------");
        iBrowserPhone.ligar();
        iBrowserPhone.mapsGPS();
        iBrowserPhone.weatherTime();
        iBrowserPhone.desligar();
        System.out.println("-------------------------");
    }
}