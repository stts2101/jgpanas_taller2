import java.util.ArrayList;
public class Atleta {
    private String nombreAtleta;
    private String paisAtleta;
    ArrayList<Disciplina> listaDisciplina;
    public Atleta(){
        this.nombreAtleta = nombreAtleta;
        this.paisAtleta = paisAtleta;
        this.listaDisciplina = new ArrayList<>();
    }
    public void agregarAtleta(String nombreAtleta, String paisAtleta){
        setNombreAtleta(nombreAtleta);
        setPaisAtleta(paisAtleta);
    }





    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public String getPaisAtleta() {
        return paisAtleta;
    }

    public void setPaisAtleta(String paisAtleta) {
        this.paisAtleta = paisAtleta;
    }

    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
}
