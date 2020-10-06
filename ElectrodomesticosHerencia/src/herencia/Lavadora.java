package herencia;

/**
 *
 * @author pipee
 */
public class Lavadora extends Electrodomesticos {
    private final int cargaxDefecto=5;
    private int carga;

    public Lavadora() {
        this.carga=cargaxDefecto;
    }

    public Lavadora(int precioBase, int peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=colorxDefecto;
        this.consumoEnergetico=consumoEnergeticoxDefecto;
    }

    public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    

    @Override
    public double precioFinal(){
        double PF=super.precioFinal();
        if (carga>30) {
            PF += 50;
        }
        return PF;
    }

}
