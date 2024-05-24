## POO - Desafio


### Modelagem e Diagramação de um Componente iPhone

Neste desafio, fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, tendo como base o vídeo de lançamento do iPhone de 2007. Em seguida, implementando as classes e interfaces basicos no formato de arquivos .java.


[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8&t=130s)


```mermaid
    classDiagram    
    
        class Media{
            <<interface>>
            +reproduzir() void
            +pausar() void
            +avancar() void
            +retroceder() void 
        }
        
        class ReprodutorMusical{
            - musicaAtual: Musica
            - listaDeReproducao: Lista<Musica>
            +reproduzir() void
            +pausar() void
            +avancar() void
            +retroceder() void
            +adicionarNaListaDeReproducao(musica: Musica) void
            +removerDaListaDeReproducao(musica: Musica) void      
        }
    
        class AparelhoTelefonico{
            - numeroTelefone: String
            - listaDeContatos: Lista<Contato>
            - historicoDeChamadas: Lista<String>
    
            + discar(numero: String) void
            + atender() void
            + adicionarContato(contato: Contato) void
            + removerContato(contato: Contato) void
            + adicionarHistorico(String: numeroTelefone) void
            + gethistoricoDeChamadas() void
        }
    
        class NavegadorInternet{
            - URLAtual: String
            - favoritos: Lista<String>
            - historico: Lista<String>
    
            + acessarURL(url: String) void
            + voltar() void
            + avancar() void
            + adicionarFavorito(url: String) void
            + removerFavorito(url: String) void 
            + adicionarHistorico() void
            + gethistoricoDeNavegacao() void
        }
    
        class Musica {
            - titulo: String
            - artista: String
            - duracao: int
        }
    
        class Contato {
            - nome: String
            - numeroTelefone: String
        }
    
        class iPhone{
            
        }
    
        iPhone --|> ReprodutorMusical
        iPhone --|> AparelhoTelefonico
        iPhone --|> NavegadorInternet
        ReprodutorMusical --|> Media
        ReprodutorMusical --|> Musica
        AparelhoTelefonico --|> Contato
```
