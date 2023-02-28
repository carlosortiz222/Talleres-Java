package EscuelaAutomovilistica;

public class Usuarios {

    private String nombre;
    private int cedula;
    private String aprobacion;

    public Usuarios() {
        this.nombre = this.nombre;
        this.cedula = this.cedula;
    }
    public Usuarios(String aprobacion){
        this.aprobacion = aprobacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }
    public String getAprobacion() {
        return aprobacion;
    }



    @Override
    public String toString() {
        return "   nombre= " + nombre +
                " ,cedula= " + cedula +
                " ,aprobacion= " + aprobacion;
    }
}
