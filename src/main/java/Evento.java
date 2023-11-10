import java.util.ArrayList;
import java.util.Date;

public class Evento {
    ArrayList<Disciplina> listaDisciplina;
    ArrayList<Equipo> listaEquipo;
    private Date fechaEvento;
    public Evento(){
        this.listaDisciplina = new ArrayList<>();
        this.listaEquipo = new ArrayList<>();
        this.fechaEvento = fechaEvento;
    }
    public void agregarEvento(Date fechaEvento){
        setFechaEvento(fechaEvento);
    }





    public ArrayList<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(ArrayList<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public ArrayList<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
}
