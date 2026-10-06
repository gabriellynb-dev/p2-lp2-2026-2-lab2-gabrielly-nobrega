package lab2;

public class RegistroResumos {

    private String[] tema;
    private String[] conteudos;
    private int numeroResumos;
    private int proximo;
    private int qtdResumos;      // só coisa de Eliane: começar atributos sem valor algum, não fiz isso em todas do meu, mas só pra digitar algo mesmo kkkkkkkk

    public RegistroResumos(int numeroDeResumos) {
        this.numeroResumos = numeroDeResumos;
        this.tema = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.qtdResumos = 0;
    }

    public void adiciona(String tema, String conteudo) {

        for (int i = 0; i < numeroResumos; i++) {
            if (this.tema[i] != null && this.tema[i].equals(tema)) {
                return;
            }
        }

        this.tema[proximo] = tema;
        this.conteudos[proximo] = conteudo;

        if (qtdResumos < numeroResumos) {
            qtdResumos++;
        }

        proximo++;

        if (proximo == numeroResumos) {
            proximo = 0;
        }
    }

    public int conta() {
        return qtdResumos;
    }

    public String[] pegaResumos() {
        String[] resumos = new String[numeroResumos];

        for (int i = 0; i < numeroResumos; i++) {
            if (tema[i] != null) {
                resumos[i] = tema[i] + ": " + conteudos[i];
            }
        }

        return resumos;
    }

    public String imprimeResumos() {
        String retorno = "- " + qtdResumos + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < qtdResumos; i++) {
            retorno += tema[i];

            if (i < qtdResumos - 1) {
                retorno += " | ";
            }
        }

        return retorno;
    }

    public boolean temResumo(String temaBusca) {
        for (int i = 0; i < numeroResumos; i++) {
            if (tema[i] != null && temaBusca.equals(tema[i])) {
                return true;
            }
        }

        return false;
    }
}