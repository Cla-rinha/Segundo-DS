package logicaexercicios;

//Exercicio 2
public class IfAninhado {
    public static void main(String[] args) {
        double nota = 7;
        int frequencia = 75;
        if (nota >=7) {
            if (frequencia >= 75) {
                System.out.println("Sua nota e frequencia estão boas!");
            }else {
                System.out.println("Sua frequencia é menor que 75%.");
            }
        }else {
            System.out.println("Sua nota è menor que 7.");
        }
    }
}
