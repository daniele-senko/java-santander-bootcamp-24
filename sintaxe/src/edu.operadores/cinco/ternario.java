public class ternario {
    // é uma operação if, só que escrito apenas em uma linha
    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        String resultado = a == b ? "true" : "false";
        System.out.println(resultado);
        int resultado1 = a == b ? 1 : 0;
        System.out.println(resultado1);
    }
}
