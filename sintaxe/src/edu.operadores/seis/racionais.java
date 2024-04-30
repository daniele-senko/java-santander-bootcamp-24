public class racionais {
    public static void main (String[] args){
        String nomeUm = "Daniele";
        String nomeDois = new String("Daniele");
// utilizar equals para comparar strings é a forma mais recomendada
        System.out.println(nomeUm.equals(nomeDois));

        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println(" a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}
