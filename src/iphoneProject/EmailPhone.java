package iphoneProject;

import java.util.Scanner;

public class EmailPhone extends IosService {

    @Override
    public void ligar() {
        System.out.println("Email ligado");        
        
    }

    @Override
    public void desligar() {
        System.out.println("Email Desligado");        
    }

    String sendMensagem(){
        System.out.println("Enviando uma mensagem");
        return "Mensagem enviada.";
    }
    String takeMensagem(){
        System.out.println("Recebendo mensagem");
        return "Mensagem recebida";
    }
    protected boolean deletarMenssagem = false;

    void deleteMensagem(){
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.println("deseja deletar a mensagem? s/n");
        String resposta = scanner.nextLine();
        if(resposta.equals("s")){
        System.out.println("Deletando mensagem");
        System.out.println("Menssagem deletada");
        }else{
            System.out.println("Operação cancelada");
        }
        } catch (Exception e) {
            System.out.println("Operação inválida, deseja deletar a mensagem? s/n");
        }
    }
}