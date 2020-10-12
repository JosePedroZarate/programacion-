package herencia;

/**
 *
 * @author pipee
 */
public class Electrodomesticos {

    protected final int precioBasexDefecto=100;
    protected final String colorxDefecto="BLANCO";
    protected final char consumoEnergeticoxDefecto='F';
    protected final int pesoxDefecto=5;

    protected int precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
    
    public Electrodomesticos() {
        this.precioBase=precioBasexDefecto;
        this.color=colorxDefecto;
        this.consumoEnergetico=consumoEnergeticoxDefecto;
        this.peso=pesoxDefecto;
    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=colorxDefecto;
        this.consumoEnergetico=consumoEnergeticoxDefecto;
    }

    public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char consumoEnergetico){
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'E') {
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoEnergeticoxDefecto;
        }
        
    }
    
    private void comprobarColor(String color){
        String Color[]={"BLANCO","NEGRO","ROJO","AZUL","GRIS"};
        boolean c=false;
        for (int i = 0; i < Color.length && !c; i++) {
            if (Color[i].equals(color)) {
                c=true;
            }
        }
        if (c) {
            this.color=color;
        }else{
            this.color=colorxDefecto;
        }
    }
    
    public double precioFinal(){
        int PF=0;
        switch(consumoEnergetico){
            case 'A':
                PF += 100;
                break;
            case 'B':
                PF += 80;
                break;
            case 'C':
                PF += 60;
                break;
            case 'D':
                PF += 50;
                break;
            case 'E':
                PF += 30;
                break;
            case 'F':
                PF += 10;
                break;
        }
        if (peso>=0 && peso<19) {
            PF += 10;
        }else{
            if (peso>=20 && peso<49) {
                PF += 50;
            }else{
                if (peso>=50 && peso<79) {
                    PF += 80;
                }else{
                    if (peso>=80) {
                        PF += 100;
                    }
                }
            }
        }
        return precioBase+PF;
    }
}
