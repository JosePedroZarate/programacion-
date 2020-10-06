package herencia;

/**
 *
 * @author pipee
 */
public class Television extends Electrodomesticos{
    private final int resolucionxDefecto=20;
    private final boolean sintonizadorTDTxDefecto=false;
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this.resolucion=resolucionxDefecto;
        this.sintonizadorTDT=sintonizadorTDTxDefecto;
    }

    public Television(int precioBase, int peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=colorxDefecto;
        this.consumoEnergetico=consumoEnergeticoxDefecto;
    }

    public Television(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double precioFinal(){
        double PF=super.precioFinal();
        if (resolucion>40) {
            PF += precioBase*0.3;
        }
        if (sintonizadorTDT) {
            PF += 50;
        }
        return PF;
    }
    
}
