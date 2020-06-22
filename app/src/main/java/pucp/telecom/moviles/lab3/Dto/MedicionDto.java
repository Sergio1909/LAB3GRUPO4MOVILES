package pucp.telecom.moviles.lab3.Dto;

public class MedicionDto {

    private int tiempo;
    private Medicion[] mediciones;

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Medicion[] getMediciones() {
        return mediciones;
    }

    public void setMediciones(Medicion[] mediciones) {
        this.mediciones = mediciones;
    }
}
