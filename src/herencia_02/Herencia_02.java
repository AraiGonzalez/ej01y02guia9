
package herencia_02;

import Entidades.Electrodomesticos;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
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


public class Herencia_02 {

    
    public static void main(String[] args) {
        List<Electrodomesticos> electrodomestico=new ArrayList();
        Lavadora lv = new Lavadora();
        lv.setNombre("lavadora");
        lv.crearLavadora(lv);
        lv.precioFinal(lv.getConsumo(), lv.getPeso());
        
        
        Televisor tl= new Televisor();
        tl.setNombre("televisor");
        tl.crearTelevisor(tl);
        tl.precioFinal(tl.getConsumo(), tl.getPeso());
        
        Lavadora lv2 = new Lavadora();
        lv.setNombre("lavadora");
        lv.crearLavadora(lv);
        Televisor tl2= new Televisor();
        tl.setNombre("televisor");
        tl.crearTelevisor(tl);
        electrodomestico.add(tl);
        electrodomestico.add(lv);
        for (Electrodomesticos electrodomesticos : electrodomestico) {
            System.out.println(electrodomestico);
        }
        
        
    }

}
