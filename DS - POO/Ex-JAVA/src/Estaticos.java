public class Estaticos {

    // 1. Método estático "Estou aprendendo métodos estáticos!"
    public static void aprenderMetodoEstatico() {
        System.out.println("Estou aprendendo métodos estáticos!");
    }

    // 2. Recebe dois números e retorna a soma
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    // 3. Retorna o valor do dobro de um número recebido por parametro
    public static int dobrar(int numero) {
        return numero * 2;
    }

    // 4.Recebe uma mensagem e imprime 3 vezes
    public static void TresVezes(String mensagem) {
        for (int i = 0; i < 3; i++) {
            System.out.println(mensagem);
        }
    }

    // 5. Verifica se um número recebido por parâmetro é par (retorna booleano)
    public static boolean Par(int numero) {
        return numero % 2 == 0;
    }

    // Método main para testar os codigops
    public static void main(String[] args) {
        // 1. Exibe a mensagem
        aprenderMetodoEstatico();

        // 2. Soma dois números
        int soma = somar(5, 7);
        System.out.println("Soma: " + soma);

        // 3. Retorna o dobro de um número
        int dobro = dobrar(4);
        System.out.println("Dobro do numero: " + dobro);

        // 4. Imprime a mensagem 3 vezes
        TresVezes("Olá, Paulo Roger!");

        // 5. Verifica se um número é par
        boolean result = Par(8);
        System.out.println("O número é par? " + result);
    }
}