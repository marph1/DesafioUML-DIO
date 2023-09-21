package meuapp.javaApp;

import meuapp.iphone.Iphone;
public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
