package logicaexercicios;

//Exercicio 3
public class SwitchAninhado {
    public static void main(String[] args) {
        int categoria = 2;
        int opcao = 1;
        switch (categoria) {
            case 1 -> {
                System.out.println("Categoria: Filmes");
                switch (opcao) {
                    case 1 -> System.out.println("Invocação do Mal 4");
                    case 2 -> System.out.println("Sonic 3");
                }
            }
            case 2 -> {
                System.out.println("Categoria: Séries");
                switch (opcao) {
                    case 1 -> System.out.println("The Big Bang Theory");
                    case 2 -> System.out.println("Sobrenatural");
                }
            }
        }
    }
}
