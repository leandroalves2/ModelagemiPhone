package Telefone;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {

    private String numeroTelefone;
    private List<Contato> listaDeContatos = new ArrayList<>();
    public List<String> historicoDeChamadas = new ArrayList<>();


    public void Discar(String numeroTelefone){
        System.out.println("Ligando para o numero: " + numeroTelefone);
        adicionarHistorico(numeroTelefone);
    }
    public void Atender(){
        System.out.println("Atendendo");
    }

    public void adicionarContato(Contato contato) {
        listaDeContatos.add(contato);
        System.out.println("Contado adicionado a lista");
    }
    public void removerContato(Contato contato) {
        listaDeContatos.remove(contato);
        System.out.println("Contado removido da lista");
    }

    public void adicionarHistorico(String numeroTelefone) {
        historicoDeChamadas.add(numeroTelefone);
    }

    public void gethistoricoDeChamadas(){
        for (String numeroTelefone : historicoDeChamadas){
            System.out.println(numeroTelefone);
        }
    }

}
