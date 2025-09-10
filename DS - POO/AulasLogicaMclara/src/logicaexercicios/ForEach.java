package logicaexercicios;

//exercicio 8
public class ForEach {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.2, 6.8, 10.0};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Media das notas: " + media);
    }
}
