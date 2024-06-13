public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // caracteristicas a nivel declasse
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanaç(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        //novoCanal é uma varivel disponível apenas nesse bloco de código, pois ela vem como parâmetro
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

    }


}