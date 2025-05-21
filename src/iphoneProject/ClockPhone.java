package iphoneProject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClockPhone extends IosService {

    @Override
    public void ligar() {
        System.out.println("Relógio ligado");        
        
    }

    @Override
    public void desligar() {
        System.out.println("Relógio Desligado");        
    }

    public void showClock() {
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hora atual: " + hora.format(formatHora) + " | Data atual: " + data.format(formatData));
    }

    public void alarmeSoud() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Defina o horário do alarme (formato 24H - HH:mm): ");
        String entrada = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horarioAlarme;

        try {
            horarioAlarme = LocalTime.parse(entrada, formatter);
        } catch (Exception e) {
            System.out.println("Formato inválido. Use HH:mm");
            scanner.close();
            return;
        }

        System.out.println("✅ Alarme configurado para: " + horarioAlarme.format(formatter));
        System.out.println("⌛ Aguardando o horário...");

        while (true) {
            LocalTime agora = LocalTime.now().withSecond(0).withNano(0);
            if (agora.equals(horarioAlarme)) {
                System.out.println("\n🔔🔔🔔 ALARME TOCANDO! Hora atual: " + agora.format(formatter));
                break;
            }
            Thread.sleep(1000);
        }

        scanner.close();
    }
}