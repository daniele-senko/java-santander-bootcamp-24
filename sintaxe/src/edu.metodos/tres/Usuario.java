
public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Volume atual? " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.trocarCanal(13);
        
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("A TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> A TV ligada? " + smartTv.ligada);

    }
}
