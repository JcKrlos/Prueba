public abstract class Figura {
  protected int x;
  protected int y;

   
  protected Figura() {
  }


  protected Figura(int x, int y) {
    this.x = x;
    this.y = y;
  }

//una clase para ser abstracta necesia tener al menos un metodo abstracto
  public abstract double calcularArea();

}
