package concurrencia.tradicional;

import java.time.LocalDateTime;
import java.util.Random;

public class ExampleIMlmentRunnbale implements  Runnable{

    @Override
    public void run() {
        try {
            for(int i = 0 ; i <5 ;i++){

                Random random = new Random();
                int aleatorio = random.nextInt(10)*1000;
                System.out.println("El hilo " + Thread.currentThread().getId() +" contador"  + i + "sleep " +aleatorio +" Hora"  + LocalDateTime.now());
                Thread.sleep(aleatorio);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
