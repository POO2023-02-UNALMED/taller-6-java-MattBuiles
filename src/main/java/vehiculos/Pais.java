package vehiculos;
import java.util.ArrayList;
import java.util.List;

public class Pais {
  String nombre;
  int contador;
  public static List<Pais> paises = new ArrayList<>();
  public Pais(String nombre) {
    this.nombre = nombre;
    paises.add(this);
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public static Pais paisMasVendedor(){
    Pais pa=null;
    int num=0;
    for(Pais pais: paises){
      if(pais.contador > num){
        num=pais.contador;
        pa=pais;
      }
    }
    return pa;
  }
}