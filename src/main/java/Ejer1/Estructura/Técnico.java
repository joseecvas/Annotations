package Ejer1.Estructura;

public class Técnico extends Operario{
    private String perfil;

    public Técnico(String nombre, String apellidos, String dni, String direccion, String telefono, String clase, String codigoTaller, String perfil) {
        super ( nombre, apellidos, dni, direccion, telefono, clase, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    @Override
    public String toString() {
        return super.toString ();
    }
}
