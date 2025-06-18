public class TestarFormaInterfaces {
    public static void main(String[] args) {
        FormaInterfaces circulo = new CirculoInterfaces(2);
        FormaInterfaces retangulo = new RetanguloInterfaces(3 , 4);

        System.out.println("Area do Circulo: " +circulo.calcularArea());
        System.out.println("Area do Retangulo: " +retangulo.calcularArea());
    }
}
