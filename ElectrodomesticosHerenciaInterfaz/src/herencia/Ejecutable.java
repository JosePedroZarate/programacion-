package herencia;

import java.util.ArrayList;

/**
 *
 * @author pipee
 */
public class Ejecutable {
    public static ArrayList<Electrodomesticos>  listElectro=new ArrayList<>();
    public static void main(String args[]){
        
        double sumaElectrodomesticos=0;
        double sumaLavadoras=0;
        double sumaTelevisiones=0;
        
        Electrodomesticos electrodomestico1=new Electrodomesticos(100,"GRIS",'E',60);
        listElectro.add(0,electrodomestico1);
        Lavadora lavadora1=new Lavadora(130,87,"NEGRO",'A',50);
        listElectro.add(1,lavadora1);
        Television televison1=new Television(300,false,280,"NEGRO",'A',34);
        listElectro.add(2,televison1);
        Electrodomesticos electrodomestico2=new Electrodomesticos(80,"AZUL",'B',21);
        listElectro.add(3,electrodomestico2);
        Lavadora lavadora2=new Lavadora(170,52,"AZUL",'C',55);
        listElectro.add(4,lavadora2);
        Television televison2=new Television(120,false,160,"GRIS",'C',42);
        listElectro.add(5,televison2);

        for (Electrodomesticos listElectro1 : listElectro) {
            if (listElectro1 instanceof Electrodomesticos) {
                sumaElectrodomesticos = sumaElectrodomesticos + listElectro1.precioFinal();
            }
            if (listElectro1 instanceof Lavadora) {
                sumaLavadoras = sumaLavadoras + listElectro1.precioFinal();
            }
            if (listElectro1 instanceof Television) {
                sumaTelevisiones = sumaTelevisiones + listElectro1.precioFinal();
            }
        }
        
        /* for (int i = 0; i < listElectro.size(); i++) {
         *     if (listElectro.get(i) instanceof Electrodomesticos) {
         *       sumaElectrodomesticos = sumaElectrodomesticos + listElectro1.precioFinal();
         *     }
         *     if (listElectro.get(i) instanceof Lavadora) {
         *       sumaLavadoras = sumaLavadoras + listElectro1.precioFinal();
         *     }
         *     if (listElectro.get(i) instanceof Television) {
         *       sumaTelevisiones = sumaTelevisiones + listElectro1.precioFinal();
         *     }
         * }
         */
        
        System.out.println("Precio Total de todos los Electrodomesticos: $USD "+sumaElectrodomesticos);
        System.out.println("Precio Total de Lavadoras: $USD "+sumaLavadoras);
        System.out.println("Precio Total de Televisores: $USD "+sumaTelevisiones);
    }
}