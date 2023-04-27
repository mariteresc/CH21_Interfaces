
public class Cuadrado implements FigurasGeometricas {
    private String name;
    private double lado;

    public Cuadrado(String name, double lado) {
        this.name = name;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (getLado() * getLado());
    }

    @Override
    public double calcularPerimetro() {
        return (getLado())*4;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado [name=" + name + ", lado=" + lado + "]";
    }
}






