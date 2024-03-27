package herencia;

public class Cuadrado extends  Figura{

    private  double lado;


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        System.out.println("llamado desde Cuadrado");
        return lado*lado;
    }


}
