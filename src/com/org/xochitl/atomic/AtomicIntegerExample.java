package com.org.xochitl.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        // atomic increment
        int valorIncrementado = atomicInteger.incrementAndGet();
        System.out.println("Valor incrementado: " + valorIncrementado);

        // Decremento atómico
        int valorDecrementado = atomicInteger.decrementAndGet();
        System.out.println("Valor decrementado: " + valorDecrementado);

        // Agregar un valor específico atómicamente
        atomicInteger.addAndGet(5);
        System.out.println("Valor después de agregar 5: " + atomicInteger.get());

        // Obtener y actualizar atómicamente
        int resultadoAntiguo = atomicInteger.getAndSet(10);
        System.out.println("Valor anterior: " + resultadoAntiguo);
        System.out.println("Valor actual: " + atomicInteger.get());
        System.out.println("(expected, updated) : " + atomicInteger.compareAndSet(10, 20));
        System.out.println("Valor actual: " + atomicInteger.get());
    }
}
