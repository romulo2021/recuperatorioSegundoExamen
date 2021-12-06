public class Main {
    public static void main(String[] args) {

        Ortoedro ortoedro=new Ortoedro(4,7,8);
        TetraedroRegular tetraedroRegular=new TetraedroRegular(4);
        Cubo cubo=new Cubo(8);
        System.out.println(ortoedro);
    ortoedro.calcularSuperficie();
    ortoedro.calcularVolumen();
        System.out.println("superficie"+ortoedro.calcularSuperficie());
        System.out.println("volumen"+ortoedro.calcularVolumen());

        tetraedroRegular.calcularSuperficie();
        tetraedroRegular.calcularVolumen();
        System.out.println("superficie"+tetraedroRegular.calcularSuperficie());
        System.out.println("volumen"+tetraedroRegular.calcularVolumen());

    cubo.calcularSuperficie();
    cubo.calcularVolumen();
        System.out.println("superficie"+cubo.calcularSuperficie());
        System.out.println("volumen"+cubo.calcularVolumen());
    }
}
