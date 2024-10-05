package Ejer1.Estructura;

import Ejer1.Anotacion.Empleado;
import Ejer1.Util.CargadorContexto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println ("BIENVENIDO A LA EMPRESA");
        System.out.println ("CARGANDO EMPLEADOS...");
        List<Ejer1.Estructura.Empleado> empleados = CargadorContexto.cargaContextoEmpresa ();
        for(Ejer1.Estructura.Empleado empleado : empleados){
            System.out.println (empleado);
        }
    }
}
