public class TestaAnimalAbstracao {
    public static void main(String[] args) {
        //cria um novo objeto cachorro e gato
        AnimalAbstracao cachorro = new CachorroAbstracao("Billy");
        AnimalAbstracao gato = new GatoAbstracao("Bibi");

        //chama um metodo chamado emitirSom do objeto cachorro e gato
        cachorro.emitirSom();
        gato.emitirSom();
    }
}
