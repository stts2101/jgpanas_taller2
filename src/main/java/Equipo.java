import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Atleta> listAtleta;
    private ArrayList<Disciplina> listaDisciplina;
    public Equipo(){
        this.nombreEquipo = nombreEquipo;
        this.listAtleta  = new ArrayList<>();
        this.listaDisciplina = new ArrayList<>();
    }
    public void agregarEquipo(String nombreEquipo){
        setNombreEquipo(nombreEquipo);
    }





    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Atleta> getListAtleta() {
        return listAtleta;
    }

    public void setListAtleta(ArrayList<Atleta> listAtleta) {
        this.listAtleta = listAtleta;
    }

    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }
}
