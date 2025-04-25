public class GettersSetters {
    public static class Pessoa {

        // Atributos privados da pessoa
        private String nome;
        private int idade;

        // Getter e Setter para o nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter e Setter para a idade
        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    public static class Produto {

        // Atributos do produto
        private String nome;
        private double preco;

        // Getter e Setter para o nome
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter e Setter para o preco
        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }
    }

    public static class Livro {

        // Atributos do livro
        private String titulo;
        private String autor;

        // Getter e Setter para o titulo
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        // Getter e Setter para o autor
        public String getAutor() {
            return autor;
        }
        public void setAutor(String autor) {
            this.autor = autor;
        }
    }

    public static class Animal {

        // Atributos do animal
        private String tipo;
        private String som;

        // Getter e Setter para o tipo
        public String getTipo() {
            return tipo;
        }
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        // Getter e Setter para o som
        public String getSom() {
            return som;
        }
        public void setSom(String som) {
            this.som = som;
        }
    }

    public static class ContaBancaria {

        // Atributos privados
        private double saldo;
        private String titular;

        // Getter e Setter para o saldo
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        // Getter e Setter para o titular
        public String getTitular() {
            return titular;
        }
        public void setTitular(String titular) {
            this.titular = titular;
        }
    }


    // Método main para testar os codigos
    public static void main(String[] args) {

        // Testando a classe Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Maria");
        pessoa.setIdade(16);
        System.out.println("Pessoa: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());

        // Testando a classe Produto
        Produto produto = new Produto();
        produto.setNome("Tenis");
        produto.setPreco(368.99);
        System.out.println("Produto: " + produto.getNome() + ", Preço: R$" + produto.getPreco());

        // Testando a classe Livro
        Livro livro = new Livro();
        livro.setTitulo("Harry Potter e o Cálice de Fogo");
        livro.setAutor("J.K.Rowling");
        System.out.println("Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor());

        // Testando a classe Animal
        Animal animal = new Animal();
        animal.setTipo("Cachorro");
        animal.setSom("Au au");
        System.out.println("Animal: " + animal.getTipo() + ", Som: " + animal.getSom());

        // Testando a classe ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Lucas Camilo");
        conta.setSaldo(1300);
        System.out.println("Titular: " + conta.getTitular() + ", Saldo: R$" + conta.getSaldo());
    }
}
