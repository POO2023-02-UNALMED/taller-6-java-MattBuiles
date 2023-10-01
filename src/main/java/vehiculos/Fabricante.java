package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Fabricante {
  String nombre;
  Pais pais;
  int contador;
  public static List<Fabricante> fabricantes = new ArrayList<>();
  public Fabricante(String nombre, Pais pais) {
    this.nombre = nombre;
    this.pais = pais;
    pais.contador+=1;
    fabricantes.add(this);
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Pais getPais() {
    return pais;
  }
  public void setPais(Pais pais) {
    this.pais = pais;
  }
  public static Fabricante fabricaMayorVentas() {
    Fabricante pa = null;
    int num = 0;
    for (Fabricante fabricante : fabricantes) {
      if (fabricante.contador > num) {
        num = fabricante.contador;
        pa = fabricante;
      }
    }
    return pa;
  }
}
