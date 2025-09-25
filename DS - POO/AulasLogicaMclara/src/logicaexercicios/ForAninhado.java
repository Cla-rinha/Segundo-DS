package logicaexercicios;

//exercicio 7
public class ForAninhado {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int soma = i + j;
                System.out.print(soma + "\t");
            }
            System.out.println();
        }
    }
}