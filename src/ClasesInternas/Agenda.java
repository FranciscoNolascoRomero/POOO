package ClasesInternas;

import teoria.Ejemplos.Persona;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nombreAgenda;
    List<Contacto> contactos;

    public Agenda(String nombreAgenda, List<Contacto> contactos) {
        this.nombreAgenda = nombreAgenda;
        this.contactos = contactos;
    }

    public Agenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
        contactos = new ArrayList<>();
    }

    //getters //

    public String getNombreAgenda() {
        return nombreAgenda;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }
    public boolean annadirContacto(Contacto contacto){
       return contactos.add(contacto);
    }
    public boolean eliminarContacto(Contacto contacto){
        return contactos.remove(contacto);
    }

    public void setNombreAgenda(String nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public Contacto mostrarlo(String telefono){
        for (Contacto contacto:contactos) {
            if (contacto.getTelefono().equals(telefono))
                return contacto;
        }
        return null;
    }

    public boolean actualizarContacto(Contacto oldContacto,Contacto newContacto){

        for (Contacto contacto:contactos) {
            if (!oldContacto.equals(newContacto))
              oldContacto = newContacto;
            return true;

        }
        return false;
    }

    //metodo que devuelva una lista de objetos
    public static int calcularEdad(LocalDate fecha){
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaActual,fecha);
        return period.getYears();
    }
}