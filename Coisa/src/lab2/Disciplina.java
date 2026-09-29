package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nome;
    private int horasEstudo;
    private Double[] notas;
    private double media;

    public Disciplina(String nome) {
        this.nome = nome;
        this.horasEstudo = 0;
        this.notas = new Double[4];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0.0;
        }
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    public boolean aprovado() {
        double soma = 0;

        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media = soma / notas.length;

        if (media >= 7.0) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.nome + " " +
                this.horasEstudo + " " +
                this.media + " " + Arrays.toString(notas);
    }
}
