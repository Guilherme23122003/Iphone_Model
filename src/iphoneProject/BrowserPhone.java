package iphoneProject;

import java.time.LocalTime;
import java.util.Scanner;

public class BrowserPhone extends IosService {


    @Override
    public void ligar() {
        System.out.println("Browser ligado");
        super.ligar();
    }

    @Override
    public void desligar() {
        System.out.println("Browser desligado");
        super.desligar();
    }
    
    void mapsGPS(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja iniciar o realizar uma pesquisa? s/n");
        String retorno = scanner.nextLine();
        if(retorno.equals ("s")) {
            System.out.println("Navegando na WEB");
        } else{
            System.out.println("Cancelando operação...");
        }
    }

    void weatherTime(){
        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();
        String saudacao;

        if (hora >= 6 && hora < 12) {
            saudacao = "Bom dia! ☀";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde! 🌥";
        } else {
            saudacao = "Boa noite 💤";
        }
    }
}
