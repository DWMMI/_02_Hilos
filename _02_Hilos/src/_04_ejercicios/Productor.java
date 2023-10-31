package _04_ejercicios;

public class Productor extends Thread {

    public Email email;
    public Cola cola;


    public Productor( _04_ejercicios.Cola cola) {
        super();
        this.email = email;
        this.cola = cola;
    }


    //Cada productor produce 10 mensajes

    public void run() {
        for (int i = 1; i <= 10; i++) {
            Email email = new Email(""+i,"destinatario"+i,"remitente"+i,"asunto"+i,"cuerpo"+i);
            cola.addEmail(email);
        }
    }

}
