package Ejer1.Estructura;

import Ejer1.Anotacion.Empleado;
import Ejer1.Anotacion.Empleados;

import java.util.ArrayList;
import java.util.List;

        @Empleado(nombre = "Jose",
        apellidos = "Cuevas",
        dni = "77960323H",
        direccion = "Calle Biznaga 6",
        telefono = "612206027",
        clase = "Directivo",
        codigoDespacho = "A-113")
        @Empleado(nombre = "Alex",
                apellidos = "Vidal",
                dni = "77960443H",
                direccion = "Calle San Pedro 3",
                telefono = "617122556",
                clase = "Oficial",
                codigoDespacho = "B-452")
        @Empleado ( nombre = "Dani",
            apellidos = "Clavijo",
        dni = "87793993F",
        direccion = "calle Ronda 2",
        telefono = "654756482",
        clase = "Técnico",
        codigoDespacho = "D-532")
public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
