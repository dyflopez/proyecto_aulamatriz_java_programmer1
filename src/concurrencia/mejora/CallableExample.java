package concurrencia.mejora;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String>{

    @Override
    public String call() throws Exception {
        Thread.sleep(9000);
        return "Hola juan ";
    }
}
