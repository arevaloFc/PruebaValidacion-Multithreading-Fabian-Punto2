public class Comensal implements Runnable{
    private String nombre;
    private Mesa mesa;
    private final int TIEMPO_CONSUMO;

    public Comensal(String comersalNombre,int tiempoConsumo, Mesa mesa){
        this.nombre = comersalNombre;
        this.mesa = mesa;
        this.TIEMPO_CONSUMO = tiempoConsumo * 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getTIEMPO_CONSUMO() {
        return TIEMPO_CONSUMO;
    }

    @Override
    public void run() {

        for (int i = 0; i < mesa.getCantidadMagdalenas(); i++) {
            try {
                this.mesa.cogerMagdalena(this.nombre,this.TIEMPO_CONSUMO);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
