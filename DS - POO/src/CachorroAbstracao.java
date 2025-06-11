// Subclasse (classe filho)
public class CachorroAbstracao extends AnimalAbstracao {
    public CachorroAbstracao(String nome){
        super(nome);
    }

    //Sobreescrevendo o método emitirSom da superclasse
    @Override
    public void emitirSom(){
        System.out.println("Au, Au!");
    }
}
