package _04_ejercicios;

public class Consumidor extends Thread{

    public Email email;
    public Cola cola;

    public Consumidor(_04_ejercicios.Cola cola){
        super();
        this.email = email;
        this.cola = cola;
    }



    public void run(){
        //Podemos sustituir el 'while' por el 'for' si queremos que manda X mensajes

        for(int i = 1;i <= 10;i++) {
            Email email = cola.getEmail();
            System.out.println(email + " ha consumido el mensaje: " + email);
        }

    }
    }


