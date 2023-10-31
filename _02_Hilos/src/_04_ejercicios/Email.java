package _04_ejercicios;

public class Email{
    private String id;
    private String destinatario;
    private String remitente;
    private String asunto;
    private String cuerpo;

    public Email(String id, String destinatario, String remitente, String asunto, String cuerpo) {
        this.id = id;
        this.destinatario = destinatario;
        this.remitente = remitente;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id='" + id + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", remitente='" + remitente + '\'' +
                ", asunto='" + asunto + '\'' +
                ", cuerpo='" + cuerpo + '\'' +
                '}';
    }
}
