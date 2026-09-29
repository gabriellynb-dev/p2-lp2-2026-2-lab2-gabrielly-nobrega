package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoEsperado;
    private static final int DOBRO = 2;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoEsperado = 0;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoEsperado = tempoEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnline * DOBRO >= this.tempoEsperado) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina + " " +
                this.tempoOnline + "/" + this.tempoEsperado;
    }
}
