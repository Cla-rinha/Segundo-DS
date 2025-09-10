package logicaexercicios;

//exercicio 9

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Encontramos o numero 7, paramos o laço.");
                break;
            }
            System.out.println("Numero: " + i);
        }
    }
}
