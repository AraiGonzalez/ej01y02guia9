
package Entidades;

import java.util.Scanner;
/////3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
//Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
//televisores, con valores ya asignados.
//Luego, recorrer este array y ejecutar el método precioFinal() en cada
//electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
//es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
//eso, también deberemos mostrar, la suma del precio de todos los
//Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
//y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
//electrodomésticos, 2000 para lavadora y 5000 para televisor.

public class Electrodomesticos {
    
    protected String nombre;
    protected Integer precio;
    protected String color;
    protected String consumo;
    protected Integer peso;

    public Electrodomesticos() {
    }
    

    public Electrodomesticos(Integer precio, String color, String consumo, Integer peso, String nombre) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
        this.nombre= nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }
    

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre + " precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    public boolean comprobarConsumo(String letra){
        
        return letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("b")||letra.equalsIgnoreCase("c")||letra.equalsIgnoreCase("d")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("f");
        
    }
    
    public void comprobarColor(String colorElegido){
        switch (colorElegido.toLowerCase()) {
            case "negro":
                color=colorElegido;
                break;
            case "azul":
                color=colorElegido;
                break; 
            case "rojo":
                color=colorElegido;
                break;
            case "gris":
                color=colorElegido;
                break;
            case "blanco":
                color=colorElegido;
                break;
            default:
                color="blanco";
        }
        
    }
    
    public void crearElectrodomestico(){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el valor de: "+ nombre);
        precio=leer.nextInt();
        if (precio<1000){
            precio=1000;
        }
        
        System.out.println("Ingrese el color del electrodomestico: ");
        String colorElegido= leer.next();
        comprobarColor(colorElegido);
        
        System.out.println("Ingrese el consumo del electrodomestico: ");
        String letra= leer.next();
        if (comprobarConsumo(letra)){
            consumo=letra;
        
        } else{
            consumo="f";
        }
        
        System.out.println("Ingrese el peso del electrodomestico: ");
        peso=leer.nextInt();
        
    }
    
    public void precioFinal(String consumo, Integer peso){
        switch (consumo.toLowerCase()) {
            case "a":
                precio= precio + 1000;
                break;
            case "b":
                precio= precio + 800;
                break;
            case "c":
                precio= precio + 600;
                break;
            case "d":
                precio= precio + 500;
                break;
            case "e":
                precio= precio + 300;
                break;
            case "f":
                precio= precio + 100;
                break;
            
        }
        
      if (peso >= 1 && peso <= 19) {
            precio+= 100;
        } else if (peso >= 20 && peso <= 49) {
            precio+= 500;
        } else if (peso >= 50 && peso <= 79) {
            precio+= 800;
        } else if (peso > 80) {
            precio+= 1000;
        }

        
    }
    
    

}
