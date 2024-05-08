package concurrencia.tradicional;

import java.time.LocalDateTime;
import java.util.Random;

public class ExambleHerenciaThread extends  Thread{

    private static int contador =0;
    @Override
    public void run() {
        try {

            for(int i = 0 ; i <5 ;i++){

                Random random = new Random();
               // int aleatorio = random.nextInt(10)*1000;
                this.increment(1000);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void increment(int sleep ){
        System.out.println("El hilo " + Thread.currentThread().getId() + "   sleep " + sleep  + " Hora  "  + LocalDateTime.now()+"  contador =>" + contador++);
        System.out.println();
    }
}
