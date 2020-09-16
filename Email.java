
package controlador;

public class Email {
    
    public String usuario;
    public String Assunto;
    public String texto;
    public String[] destinatarios;

    public Email (String usuario, String Assunto, String texto, String[] destinatarios ){
        this.usuario = usuario;
        this.Assunto = Assunto;
        this.texto = texto;
        this.destinatarios = destinatarios;
    }
}
