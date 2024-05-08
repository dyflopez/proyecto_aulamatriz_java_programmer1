package concurrencia.mejora;

import java.time.LocalDateTime;
import java.util.Random;

public class ThreadCount extends Thread{

    private static int contador =0;
    @Override
    public void run() {
        try {

            for(int i = 0 ; i <5 ;i++){

                Random random = new Random();
                this.increment(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void increment(int i ){
        System.out.println("El hilo " + Thread.currentThread().getId() + "   i  " + i  + " Hora  "  + LocalDateTime.now()+"  contador =>" + contador++);
        System.out.println();
    }
}
