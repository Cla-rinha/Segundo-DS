public class Sobrescrita {

    // Classe base Animal
    static class Animal {
        // Método emitirSom() da classe Animal
        public void emitirSom() {
            System.out.println("O animal está fazendo um som");
        }
    }

    // Classe Cachorro que vem de Animal e sobrescreve o método emitirSom()
    static class Cachorro extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Au Au!");
        }
    }


    // Classe base Transporte
    static class Transporte {
        public void mover() {
            System.out.println("O transporte está em movimento");
        }
    }

    // Classe Carro que vem de Transporte
    static class Carro extends Transporte {
        @Override
        public void mover() {
            System.out.println("O carro está em movimento");
        }
    }

    // Classe base Forma
    static class Forma {
        public void desenhar() {
            System.out.println("Desenhando uma forma");
        }
    }

    // Classe Circulo que vem de Forma e sobrescreve o método desenhar()
    static class Circulo extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um círculo");
        }
    }

    // Classe Quadrado que vem de Forma
    static class Quadrado extends Forma {
        @Override
        public void desenhar() {
            System.out.println("Desenhando um quadrado.");
        }
    }


    // Classe base Funcionario
    static class Funcionario {
        public void trabalhar() {
            System.out.println("Funcionário trabalhando");
        }
    }

    // Classe Professor que vem de Funcionario
    static class Professor extends Funcionario {
        @Override
        public void trabalhar() {
            System.out.println("O Paulo está ensinando Java");
        }
    }


    // Classe base Esporte
    static class Esporte {
        public void jogar() {
            System.out.println("Estou jogando um esporte");
        }
    }

    // Classe Futebol que vem de Esporte
    static class Futebol extends Esporte {
        @Override
        public void jogar() {
            System.out.println("Estou jogando futebol");
        }
    }

    // Classe Basquete que vem de Esporte
    static class Basquete extends Esporte {
        @Override
        public void jogar() {
            System.out.println("Estou jogando basquete");
        }
    }


    // Classe principal para testar todos os codigos
    public static void main(String[] args) {

        // Testando a classe Animal e sua subclasse Cachorro
        Animal animal = new Animal();
        animal.emitirSom();
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        // Testando a classe Transporte e sua subclasse Carro
        Transporte transporte = new Transporte();
        transporte.mover();
        Carro carro = new Carro();
        carro.mover(); //

        // Testando a classe Forma e suas subclasses Circulo e Quadrado
        Forma forma = new Forma();
        forma.desenhar(); //
        Circulo circulo = new Circulo();
        circulo.desenhar();
        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();

        // Testando a classe Funcionario e sua subclasse Professor
        Funcionario funcionario = new Funcionario();
        funcionario.trabalhar();
        Professor professor = new Professor();
        professor.trabalhar();

        // Testando a classe Esporte e suas subclasses Futebol e Basquete
        Esporte esporte = new Esporte();
        esporte.jogar();
        Futebol futebol = new Futebol();
        futebol.jogar();
        Basquete basquete = new Basquete();
        basquete.jogar();
    }
}
