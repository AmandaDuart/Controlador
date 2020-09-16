package controlador;

public class Main {

    public static void main(String[] args) {
        ServidorEmails servidor = new ServidorEmails(   );
        CaixaPostal fulano = new CaixaPostal("Fulano");
        CaixaPostal sicrano = new CaixaPostal("Sicrano");
        CaixaPostal beltrano = new CaixaPostal("Beltrano");
        CaixaPostal outrano = new CaixaPostal("Outrano");
        servidor.adicionarCaixa(fulano);
        servidor.adicionarCaixa(sicrano);
        servidor.adicionarCaixa(beltrano);
        servidor.adicionarCaixa(outrano);
        Email e1 = new Email("Fulano",
                new String[]{"Sicrano", "Beltrano"},
                "Super importante!",
                "Retorne-me o quanto antes!");
        servidor.enviaEmail(e1);
        servidor.encaminhaEmail(e1, "Outrano");
        System.out.println(fulano);
        System.out.println(sicrano);
        System.out.println(beltrano);
        System.out.println(outrano);
    }
}
