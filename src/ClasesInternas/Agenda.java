package ClasesInternas;

import dates.DateHelper;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public NombreAgenda getNombreAgenda() {
        return nombreAgenda;
    }

    public void setNombreAgenda(NombreAgenda nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Agenda(NombreAgenda nombreAgenda) {
        this.nombreAgenda = nombreAgenda;
        contactos = new ArrayList<>();
    }

    public Agenda(NombreAgenda nombreAgenda, List<Contacto> contactos) {
        this.nombreAgenda = nombreAgenda;
        this.contactos = contactos;
    }

    private NombreAgenda nombreAgenda;
    List<Contacto> contactos;

    //getters //



    public boolean getContactos(Contacto contacto){
       return contactos.add(contacto);
    }
    public boolean eliminarContacto(Contacto contacto){
        return contactos.remove(contacto);
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
//    public static int calcularEdad(LocalDate fecha){
//        LocalDate fechaActual = LocalDate.now();
//        Period period = Period.between(fechaActual,fecha);
//        return period.getYears();
//    }
    public List<Contacto> getCOntactosMayoresDeEdas(){
        List<Contacto> mayoresEdasd =new ArrayList<>();
        for (Contacto contacto:contactos) {
            if (DateHelper.calcularEdad(contacto.getFechaNacimiento()) >=18)
                mayoresEdasd.add(contacto);
        }
        return mayoresEdasd;
    }
}