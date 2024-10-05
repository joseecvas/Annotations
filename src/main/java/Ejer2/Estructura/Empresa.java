package Ejer2.Estructura;

import Ejer1.Anotacion.Empleado;
import Ejer1.Anotacion.Empleados;
import Ejer2.Anotacion.Directivo;
import Ejer2.Anotacion.Oficial;
import Ejer2.Anotacion.Técnico;

import java.util.ArrayList;
import java.util.List;

        @Directivo (nombre = "Jose",
        apellidos = "Cuevas",
        dni = "77960323H",
        direccion = "Calle Biznaga 6",
        telefono = "612206027",
        codigoDespacho = "A-113")
        @Oficial (nombre = "Alex",
                apellidos = "Vidal",
                dni = "77960443H",
                direccion = "Calle San Pedro 3",
                telefono = "617122556",
                codigoTaller = "O-452",
                categoria = "categoria"
        )
        @Técnico ( nombre = "Dani",
            apellidos = "Clavijo",
        dni = "87793993F",
        direccion = "calle Ronda 2",
        telefono = "654756482",
        codigoTaller = "T-532",
        perfil = "perfil")
public class Empresa {
    private List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

}
