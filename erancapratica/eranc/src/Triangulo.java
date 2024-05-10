public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor){}
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
    public double area(){
        return base*altura/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
