package Media;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical implements MediaInterface {
    private Musica musicaAtual;
    private List<Musica> listaDeReproducao = new ArrayList<>();


    public void reproduzir(Musica musicaAtual){
        System.out.println("Reproduzindo " + musicaAtual.getTitulo() + ", do artista " + musicaAtual.artista);
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void avancar() {
        System.out.println("Avançando para a proxima musica");

    }

    public void retroceder() {
        System.out.println("Voltando para a musica anterior");

    }

    public void adicionarNaListaDeReproducao(Musica musicaAtual) {
        listaDeReproducao.add(musicaAtual);
        System.out.println("Música " + musicaAtual.getTitulo() + " adicionada à lista de reprodução");
    }


    public void removerDaListaDeReproducao(Musica musicaAtual){
        listaDeReproducao.remove(musicaAtual);
        System.out.println("Musica " + musicaAtual.getTitulo() + ", removida da lista de reprodução");
    }
}
