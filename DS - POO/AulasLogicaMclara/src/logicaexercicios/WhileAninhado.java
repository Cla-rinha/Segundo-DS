package logicaexercicios;

//exercicio 5
public class WhileAninhado {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int j = 1;

            System.out.println("Tabuada: " + i);

            while (j <= 10) {
                System.out.println(i + "x" + j + "=" + (i * j));
                j++;
            }
            i++;
        }
    }
}
