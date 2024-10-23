public class Circulo extends Figura {

  private double radio;

  

  public Circulo() {
  }

  public Circulo(int x, int y, double radio) {
    super(x, y);
    this.radio = radio;
  }


  @Override
  public double calcularArea() {
    double resultado = 3.1416*radio*radio;
    return resultado;
  }

}
