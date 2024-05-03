public class logicos {
    public static void main(String[] args){
        boolean condicional = true;
        boolean condicional2 = false;

        if (condicional && condicional2){
            System.out.println("as duas condições são verdadeiras");
        } 

        if (condicional || condicional2){
            System.out.println("pelo menos uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}
