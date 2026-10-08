package lab2;

public class Resumo {
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return this.tema;
    }
}
