public class TetraedroRegular extends figuraTridimensional {
private double arista;
private static final int CARAS=4;

    public TetraedroRegular(double arista) {
    this.arista=arista;

    }
public TetraedroRegular(){
        this.arista=1;
}
@Override
public double calcularVolumen(){
        double volumen=(Math.pow(2,(1/2))*((Math.pow(arista, 3))/12));
        return volumen;
    }
    @Override
    public double calcularSuperficie() {
        double superficie=(Math.pow(3, (1/2)))*(Math.pow(arista, 2));
        return superficie;
    }

    @Override
    public String toString() {
        return "La figura es un Tetraedro Regular";
    }
}
