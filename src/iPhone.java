import Internet.NavegadorInternet;
import Media.Musica;
import Media.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class iPhone {
    public static void main(String[] args) {

        System.out.println("Reproduzindo musica.");

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Musica musica = new Musica("Run To The Hills", "Iron Maiden", 231);
        reprodutor.reproduzir(musica);
        reprodutor.adicionarNaListaDeReproducao(musica);
        reprodutor.pausar();
        reprodutor.avancar();
        musica = new Musica("Tears Of The Dragon", "Bruce Dickinson ", 401);
        reprodutor.reproduzir(musica);
        reprodutor.adicionarNaListaDeReproducao(musica);
        reprodutor.pausar();
        System.out.println();

        AparelhoTelefonico iphone = new AparelhoTelefonico();
        String numeroDeTelefone = "12999999999";
        iphone.Discar(numeroDeTelefone);
        iphone.Atender();
        numeroDeTelefone = "11988888888";
        iphone.Discar(numeroDeTelefone);
        iphone.Atender();
        System.out.println("Historico de chamadas:");
        iphone.gethistoricoDeChamadas();
        System.out.println();

        NavegadorInternet internet = new NavegadorInternet();
        internet.acessarURL("https://www.dio.me/");
        System.out.println("Historico de Navegacao");
        internet.gethistoricoDeNavegacao();



    }
}