public class Main {

    public static void main(String[] args){

        try {

            Mesa mesa = new Mesa(15);

            Thread camilo = new Thread(new Comensal("Camilo",10,mesa));
            camilo.setPriority(Thread.MAX_PRIORITY);
            Thread fabian = new Thread(new Comensal("Fabian",10,mesa));
            fabian.setPriority(Thread.MIN_PRIORITY);
            Thread manuel = new Thread(new Comensal("Manuel",10,mesa));
            manuel.setPriority(Thread.NORM_PRIORITY);

            camilo.start();
            fabian.start();
            manuel.start();

            camilo.join();
            fabian.join();
            manuel.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
