package ClasesInternas;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {
    //nombre, apellidos, .teléfono, edad
    private String nombreContacto;
    private String apellidos;
    private String telefono;
    private LocalDate fechaNacimiento;

    public Contacto() {
    }

    public Contacto(String nombreContacto, String apellidos, String telefono, LocalDate fechaNacimiento) {
        this.nombreContacto = nombreContacto;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("NOBRE: %s, %s%nTELF: %s%nCUMPLEAÑOS: %d del %d%nEDAD %d",
                apellidos, nombreContacto, telefono,
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),calcularEdad(fechaNacimiento));
        //DateHelper.calcularEdad(fechaNacimiento) * -1);
    }
    public static int calcularEdad(LocalDate fecha) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        return periodo.getYears();
    }

   /* public static void main(String[] args) {
        String nombre = "Gabriel";
        String apellidos = "García Méndez";
        String telefono = "953222324";
        LocalDate fecha = LocalDate.of(2000, 3, 21);
        Contacto contacto = new Contacto(nombre, apellidos, telefono, fecha);
        System.out.println(contacto);
    }*/
}
