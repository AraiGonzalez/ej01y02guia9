
package Entidades;

import java.util.Scanner;


public class Televisor extends Electrodomesticos {

    private Integer resolucion;
    private boolean TDT;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean TDT, Integer precio, String color, String consumo, Integer peso, String nombre) {
        super(precio, color, consumo, peso, nombre);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString()+ "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }

    public void crearTelevisor(Televisor televisor){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        televisor.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor: ");
        resolucion=leer.nextInt();
        System.out.println("Ingrese si el televisior tiene TDT: S/N");
        if(leer.next().equalsIgnoreCase("s")){
            TDT=true;
        }else{
            TDT=false;
        }
        
    }

    @Override
    public void precioFinal(String consumo, Integer peso) {
        super.precioFinal(consumo, peso); 
        if(resolucion>40){
            precio+=precio*30/100;
        } 
        if(TDT==true){
            precio+=500;
        }
        System.out.println("El precio final es "+precio);
    }
    
    
    
    
}
