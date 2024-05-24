package Internet;

import Media.Musica;

import java.util.ArrayList;
import java.util.List;

public class NavegadorInternet {
    public String url;
    public List<String> favoritos = new ArrayList<>();
    public List<String> historico = new ArrayList<>();

    public void acessarURL(String url){
        System.out.println("url " + url + " acessada.");
        adicionarHistorico(url);
    }
    public void avancar() {
        System.out.println("Avançando para a proxima pagina");
        adicionarHistorico(url);
    }
    public void voltar(){
        System.out.println("Voltando para a pagina anterior");
        adicionarHistorico(url);
    }

    public void adicionarFavorito(String url) {
        favoritos.add(url);
        System.out.println("URL " + url + " adicionada aos favoritos");
    }

    public void removerFavorito(String url) {
        favoritos.remove(url);
        System.out.println("URL " + url + " removida dos favoritos");
    }

    public void adicionarHistorico(String url) {
        historico.add(url);
    }

    public void gethistoricoDeNavegacao(){
        for (String url : historico){
            System.out.println(url);
        }
    }
}
