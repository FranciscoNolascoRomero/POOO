package ClasesInternas;

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
    //metodo que añada un contacto
    //metodo que elimine contactos
    //metodo que actualize un contacto
    //metodo que muestre un contacto,dado el telefono
}
