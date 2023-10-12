package _01_ejercicios;

import java.util.Date;

public class _Actividad_01 extends Thread {
    Long numero;
    public boolean esPrimo;

    public _Actividad_01(Long numero) {
        this.numero = numero;
    }


    @Override
    public void run() {
        //https://docs.oracle.com/javase/7/docs/api/java/lang/System.html#nanoTime()
        //https://es.stackoverflow.com/questions/24374/c%C3%B3mo-calcular-el-tiempo-de-ejecuci%C3%B3n-de-un-proceso-en-java
        long startTime = System.nanoTime();
        // Calculamos si el número es primo
        boolean esPrimo = esPrimo(numero);
        long endTime = System.nanoTime() - startTime;

        //TODO Profe corrígeme:
        /*
        Date inicio = new Date();
        boolean esPrimo = esPrimo(numero);
        Date fin = new Date();
        long tiempoTranscurrido = fin.getTime() - inicio.getTime();
        */

        System.out.println(numero + " es primo: " + esPrimo + " en el " + Thread.currentThread().getName());
        System.out.println("Tiempo de ejecución para " + numero + ": " + endTime + " nanosegundos, en el " + Thread.currentThread().getName()); //para dar más presición, he utilizado nanosegundos

    }

    boolean esPrimo(long n) {
        if (n <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
