package _01_ejercicios;

import java.util.Scanner;

/**
 * @author dichaowang
 */

/*
 * Hacer un programa que pida 3 números a un usuario por pantalla, a partir de

 * esos números arrancamos 3 hilos a partir de una misma clase que tendrán que

 * decir si son primos o no

 * Se pide también que se calcule el tiempo que tarda cada hilo en ejecutarses

 * Ayuda: La clase Date guarda el tiempo en milisegundos desde el año 1970

 * Date date = new Date();

 * date.getTime() //nos devuelve el numero de milisegundos
 */
public class _Actividad_01_Main {
    public static void main(String[] args) {
        System.out.println("Escribe 3 números por el terminal para comprobar si son primos");
        Scanner sc = new Scanner(System.in);

        System.out.println("Primer número: ");
        Long i = sc.nextLong();
        System.out.println("Segundo número: ");
        Long j = sc.nextLong();
        System.out.println("Tercer número: ");
        Long k = sc.nextLong();

        //Este objeto será capaz de arrancar un hilo
        _Actividad_01 hilo1 = new _Actividad_01(i);
        hilo1.setName("Hilo-1");//establecemos el nombre del hilo

        _Actividad_01 hilo2 = new _Actividad_01(j);
        hilo2.setName("Hilo-2");

        _Actividad_01 hilo3 = new _Actividad_01(k);
        hilo3.setName("Hilo-3");

        hilo1.start();
        hilo2.start();
        hilo3.start();

    }
}
