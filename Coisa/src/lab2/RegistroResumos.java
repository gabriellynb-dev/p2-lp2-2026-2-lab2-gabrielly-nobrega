package lab2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class RegistroResumos {
    private Resumo[] resumos;
    private int proximo;
    private int qtdResumos;

    // metodo construtor
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.qtdResumos = 0;
    }

    // metodo adiciona
    public void adiciona(String tema, String conteudo) {
        for (int i = 0; i < this.resumos.length; i++) {
            if (this.resumos[i] != null && tema.equals(this.resumos[i].getTema())) {
                return;
            }
        }

        this.resumos[proximo] = new Resumo(tema, conteudo);

        if (qtdResumos < resumos.length) {
            qtdResumos++;
        }

        proximo++;

        if (proximo == resumos.length) {
            proximo = 0;
        }
    }

    // metodo conta
    public int conta() {
        return qtdResumos;
    }

    // metodo pegaResumos
    public String[] pegaResumos() {
        String[] resumosRetorno = new String[resumos.length];

        for (int i = 0; i < resumos.length; i++) {
            if (this.resumos[i] != null) {
                resumosRetorno[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
            }
        }

        return resumosRetorno;
    }

    // metodo imprimeResumos
    public String imprimeResumos() {
        String retorno = "- " + qtdResumos + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < qtdResumos; i++) {
            retorno += this.resumos[i].getTema();

            if (i < qtdResumos - 1) {
                retorno += " | ";
            }
        }

        return retorno;
    }

    // metodo temResumo
    public boolean temResumo(String temaBusca) {
        for (int i = 0; i < resumos.length; i++) {
            if (this.resumos[i] != null && temaBusca.equals(resumos[i].getTema())) {
                return true;
            }
        }

        return false;
    }

    // metodo busca
    public String[] busca(String chaveDeBusca) {
        int qtTemas = 0;
        String[] listaTemas = new String[this.qtdResumos];

        for (int i = 0; i < this.qtdResumos; i++) {
            String[] splitResumo = this.resumos[i].getConteudo().split(" ");
            for (int j = 0; j < splitResumo.length; j++) {
                if (splitResumo[j].equalsIgnoreCase(chaveDeBusca)) {
                    listaTemas[qtTemas] = this.resumos[i].getTema();
                    qtTemas++;
                    break;
                }
            }
        }

        String[] temasRetorno = Arrays.copyOf(listaTemas, qtTemas);
        Arrays.sort(temasRetorno);
        return temasRetorno;
    }
}