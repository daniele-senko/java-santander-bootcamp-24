
public class ResultadoEscolaar {
    public static void main(String[] args) {

        int nota = 10;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) // sempre retornar true ou false
            System.out.println("Prova Recuperação");

        else
            System.out.println("Reprovado");
    }
}