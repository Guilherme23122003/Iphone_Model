package iphoneProject;

public abstract class IosService implements IosSystem {
    void volumeDown(){
        System.out.println("Diminuindo o volume --");
    };
    void volumeUp(){
        System.out.println("Aumentando o volume ++");
    };
    void lightScreenUp(){
        System.out.println("Aumentando o brilho ++");
    };
    void lightScreenDown(){
        System.out.println("Diminuindo o briho --");
    }
    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        
    };
}