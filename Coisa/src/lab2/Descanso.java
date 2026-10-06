package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso(int horasDescanso, int numeroSemanas) { // esse construtor ficou sem utilidade no código, pq não foi usado construtor com parâmetro nesse main
        this.horasDescanso = horasDescanso;
        this.numeroSemanas = numeroSemanas;
    }

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    public String getStatusGeral() {
        String status = "";
        if (horasDescanso != 0 && numeroSemanas != 0) {
            if (horasDescanso / numeroSemanas >= 26) {
                status = "descansado";
            } else {
                status = "cansado";
            }
        } else {
            status = "cansado";
        }

        return status;
    }


}

