
package Entidades;

import java.util.Scanner;


public class Lavadora extends Electrodomesticos {
    
    private Integer carga;

    public Lavadora() {
        super();
        
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumo, Integer peso, String nombre) {
        super(precio, color, consumo, peso, nombre);
        this.carga = carga;
    }

    

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + super.toString()+ "carga=" + carga + '}';
    }

    public void crearLavadora(Lavadora lavadora){
        lavadora.crearElectrodomestico();
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de carga: ");
        carga=leer.nextInt();
      
    }

    @Override
    public void precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso); //To change body of generated methods, choose Tools | Templates.
        if(carga>30){
            precio+=500;
        }
        System.out.println("El precio final de: "+ nombre +" es: " +precio);
    }
    
    
    
    
    

    
    

}
