public class Cubo extends figuraTridimensional {

private double lado;
private static final int CARAS=6;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public Cubo() {
        this.lado=1;
    }

@Override
    public double calcularVolumen() {
        double volumen=Math.pow(lado,3);
        return  volumen;
    }
    @Override
    public  double calcularSuperficie(){
        double superficie=6* (Math.pow(lado,2));
    return superficie;
    }


    @Override
    public String toString() {
        return "La Figura e sun Cubo";
    }


}
