package vehiculos;
public class Camion extends Vehiculo {
  int ejes;
  /*super.puertas=2;
  super.velocidadMaxima=80;
  super.traccion="4X2";
  */
  public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
    super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
    this.ejes = ejes;
  }
  public int getEjes() {
    return ejes;
  }
  public void setEjes(int ejes) {
    this.ejes = ejes;
  }
}
