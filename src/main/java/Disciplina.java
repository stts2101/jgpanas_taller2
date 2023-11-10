public class Disciplina {
    private String nombreDisciplina;
    private int nroParticipantes;
    private double recordMundial;
    public Disciplina(){
        this.nombreDisciplina = nombreDisciplina;
        this.nroParticipantes = nroParticipantes;
        this.recordMundial = recordMundial;
    }
    public void agregarDisciplina(String nombreDisciplina, int nroParticipantes, double recordMundial){
        setNombreDisciplina(nombreDisciplina);
        setNroParticipantes(nroParticipantes);
        setRecordMundial(recordMundial);
    }





    public String getNombreDisciplina() {
        return nombreDisciplina;
    }

    public void setNombreDisciplina(String nombreDisciplina) {
        this.nombreDisciplina = nombreDisciplina;
    }

    public int getNroParticipantes() {
        return nroParticipantes;
    }

    public void setNroParticipantes(int nroParticipantes) {
        this.nroParticipantes = nroParticipantes;
    }

    public double getRecordMundial() {
        return recordMundial;
    }

    public void setRecordMundial(double recordMundial) {
        this.recordMundial = recordMundial;
    }
}
