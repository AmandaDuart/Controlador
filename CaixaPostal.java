
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CaixaPostal {

    public String usuario;
    
    public CaixaPostal(String usuario) {
        this.usuario = usuario;
    }
    
    public List<Email> caixaSaida = new ArrayList<Email>();

    public String toString() {
        String caixa = ">>> Caixa Postal de " + this.usuario + " <<<\n";
        for (int i = 0; i < this.caixaSaida.size(); i++) {
            Email email = this.caixaSaida.get(i);
            caixa += "De: " + email.usuario + "\n";
            caixa += "Para: " + Arrays.toString(email.destinatarios) + "\n";
            caixa += email.Assunto + "\n";
            caixa += email.texto + "\n";
        }
        return caixa;
    }

}
