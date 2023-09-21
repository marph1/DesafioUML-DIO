package meuapp.iphone;
import meuapp.interfaces.ReprodutorMusical;
import meuapp.interfaces.AparelhoTelefonico;
import meuapp.interfaces.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Tocando Musica");
    }

    public void pausar() {
        System.out.println("Pausando Musica");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    public void ligar() {
        System.out.println("Ligando Iphone");
    }

    public void atender() {
        System.out.println("Atendendo aparelho");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador");
    }

    public void adicionarNovaAba() {
        System.out.println("Adiocionando pagina no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina no navegador");
    }
}