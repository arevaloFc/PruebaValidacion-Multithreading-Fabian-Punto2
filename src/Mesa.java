public class Mesa {
    private int cantidadMagdalenas;

    public Mesa(int cantidadMagdalenas){
        this.cantidadMagdalenas = cantidadMagdalenas;
    }

    synchronized public void cogerMagdalena(String comensalNombre, int TIEMPO_CONSUMO) throws InterruptedException {
        System.out.println( comensalNombre + " ha cogido una magdalena de la mesa");
        this.cantidadMagdalenas = cantidadMagdalenas - 1;
        Thread.sleep(TIEMPO_CONSUMO);
        System.out.println( comensalNombre + " se ha terminado de comer una magdalena");
    }

    public int getCantidadMagdalenas() {
        return cantidadMagdalenas;
    }

    public void setCantidadMagdalenas(int cantidadMagdalenas) {
        this.cantidadMagdalenas = cantidadMagdalenas;
    }
}
