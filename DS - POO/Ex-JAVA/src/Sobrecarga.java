public class Sobrecarga {
    //1. Exibir numeros inteiros e reias
    public void exibirNumero(int numero) {
        System.out.println("Número inteiro: " + numero);
    }

    public void exibirNumero(double numero) {
        System.out.println("Número real: " + numero);
    }

    //2. Calcular a area do quadrado e retangulo
    public double calcularArea(double lado) {
        return lado * lado;
    }
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    //3. Exibir texto simples e um repetido varias vezes
    public void exibirTexto(String texto) {
        System.out.println("Texto: " + texto);
    }

    public void exibirTexto(String texto, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.println((i + 1) + ": " + texto);
        }
    }

    //4. Somas com 2, 3 e 4 numeros inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public int somar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //5. Exibir caracteres e strings
    public void exibir(char caractere) {
        System.out.println("Caracter: " + caractere);
    }

    public void exibir(String texto) {
        System.out.println("String: " + texto);
    }



    //Metodo principal para rodar os codigos
    public static void main(String[] args) {
        // objetos do codigo 1
        Sobrecarga sobrecarga = new Sobrecarga();
        sobrecarga.exibirNumero(20);
        sobrecarga.exibirNumero(1.5);

        //objetos do codigo 2
        System.out.println("Area do quadrado: " + sobrecarga.calcularArea(6));
        System.out.println("Area do retangulo: " + sobrecarga.calcularArea(3, 9));

        //objetos do codigo 3
        sobrecarga.exibirTexto("Bom dia, professor Paulo!");
        sobrecarga.exibirTexto("Bom dia!", 5);

        //objetos do codigo 4
        System.out.println("Soma de 2 numeros: " + sobrecarga.somar(3,7));
        System.out.println("Soma de 3 numeros: " + sobrecarga.somar(2, 4, 6));
        System.out.println("Soma de 4 numeros: " + sobrecarga.somar(7, 8, 9, 5));

        //objetos do codigo 5
        sobrecarga.exibir('M');
        sobrecarga.exibir("Texto com String");
    }
}
