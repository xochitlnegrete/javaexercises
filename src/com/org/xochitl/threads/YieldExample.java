package com.org.xochitl.threads;

public class YieldExample implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            // Llama a yield después de imprimir cada número
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new YieldExample());
        Thread hilo2 = new Thread(new YieldExample());

        // Establece nombres para identificar los hilos en la salida
        hilo1.setName("Hilo 1");
        hilo2.setName("Hilo 2");

        // Inicia ambos hilos
        hilo1.start();
        hilo2.start();
    }
}
