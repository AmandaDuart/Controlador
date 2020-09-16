
package controlador;

import java.util.ArrayList;
import java.util.List;


public class ServidorEmails {

    private List<CaixaPostal> _vetorPostais = new ArrayList<CaixaPostal>();

    public void enviaEmail(Email email) {
        for (int i = 0; i < this._vetorPostais.size(); i++) {
            CaixaPostal caixaPostal = this._vetorPostais.get(i);
            for (int j = 0; j < email.destinatarios.length; j++) {
                String destinatario = email.destinatarios[j];
                if (caixaPostal.usuario == destinatario) {
                    caixaPostal.caixaSaida.add(email);
                    this._vetorPostais.set(i, caixaPostal);
                }
            }
        }
    }

    public void encaminhaEmail(Email email, String destinatario) {
        for (int i = 0; i < this._vetorPostais.size(); i++) {
            CaixaPostal caixaPostal = this._vetorPostais.get(i);
            if (caixaPostal.usuario == destinatario) {
                caixaPostal.caixaSaida.add(email);
                this._vetorPostais.set(i, caixaPostal);
            }
        }
    }
    
    public void adicionarCaixa(CaixaPostal caixaPostal) {
        this._vetorPostais.add(caixaPostal);
    }

    

}
