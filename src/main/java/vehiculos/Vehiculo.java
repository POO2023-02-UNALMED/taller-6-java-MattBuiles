package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
  String placa;
  int puertas;
  int velocidadMaxima;
  String nombre;
  int precio;
  int peso;
  String traccion;
  Fabricante fabricante;
  static int cantidadVehiculos;
  public static List<Vehiculo> vehiculos = new ArrayList<>();

  public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion,
      Fabricante fabricante) {
    this.placa = placa;
    this.puertas = puertas;
    this.velocidadMaxima = velocidadMaxima;
    this.nombre = nombre;
    this.precio = precio;
    this.peso = peso;
    this.traccion = traccion;
    this.fabricante = fabricante;
    vehiculos.add(this);
    cantidadVehiculos++;
    fabricante.contador+=1;
  }

  public Vehiculo() {
    vehiculos.add(this);
    cantidadVehiculos++;
  }

  public static int getCantidadVehiculos() {
    return cantidadVehiculos;
  }

  public static void setCantidadVehiculos(int cantidadVehiculos) {
    Vehiculo.cantidadVehiculos = cantidadVehiculos;
  }

  public static List<Vehiculo> getVehiculos() {
    return vehiculos;
  }

  public static void setVehiculos(List<Vehiculo> vehiculos) {
    Vehiculo.vehiculos = vehiculos;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public int getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public String getTraccion() {
    return traccion;
  }

  public void setTraccion(String traccion) {
    this.traccion = traccion;
  }

  public Fabricante getFabricante() {
    return fabricante;
  }

  public void setFabricante(Fabricante fabricante) {
    this.fabricante = fabricante;
  }

  public static String vehiculosPorTipo() {
    int cantidadAutomoviles = 0;
    int cantidadCamionetas = 0;
    int cantidadCamiones = 0;
    for (Vehiculo vehiculo : vehiculos) {
      if (vehiculo instanceof Automovil) {
        cantidadAutomoviles++;
      } else if (vehiculo instanceof Camioneta) {
        cantidadCamionetas++;
      } else if (vehiculo instanceof Camion) {
        cantidadCamiones++;
      }
    }
    return "Automoviles: " + cantidadAutomoviles + "\nCamionetas: " + cantidadCamionetas + "\nCamiones: "
        + cantidadCamiones;
  }
}
