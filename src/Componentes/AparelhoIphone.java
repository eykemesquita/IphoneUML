package Componentes;

public abstract class AparelhoIphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocar() {
        // Implementação para tocar música
    }
    public void pausar() {
        // Implementação para pausar música
    }

    public void selecionarMusica() {
        // Implementação para selecionar música
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Implementação para exibir página
    }
    public void adicionarNovaAba(String url) {
        // Implementação para adicionar nova aba
    }
    public void atualizarPagina() {
        // Implementação para atualizar página
    }

    // Implementação dos métodos da interface AparelhoTelefonico

    public void ligar() {
        // Implementação para ligar
    }
    public void atender() {
        // Implementação para atender
    }
    public void iniciarCorrerioDeVoz() {
        // Implementação para iniciar correio de voz
    }

    // Métodos específicos da classe iPhone

    public void  desbloquear() {
        // Implementação para desbloquear
    }

    public boolean isDesligado() {
        // Implementação para verificar se está desligado
        return false;
    }

    public void ligarIphone() {
        // Implementação para ligar o iPhone
    }

}
