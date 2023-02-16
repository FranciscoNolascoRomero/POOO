package ClasesInternas;

import java.time.LocalDate;

public class Contacto {
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
        return String.format("NOMBRE : %s,%s%nTELF : %s%nCUMPLEAÑOS : %d del %d",nombreContacto,apellidos,telefono,fechaNacimiento.getDayOfMonth(),fechaNacimiento.getMonthValue());
    }

//    public static void main(String[] args) {
//        String nombre = "Gabriel";
//        String apellido = "Mendez";
//        String telefono = "898181881";
//        LocalDate fechaNac = LocalDate.of(2000,04,21);
//        Contacto  contacto= new Contacto(nombre,apellido,telefono,fechaNac);
//        System.out.println(contacto);
//    }
}
