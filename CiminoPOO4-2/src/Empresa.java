import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // atributo de relacion
    private List<Empleado> empleados;

    // metodo add
    public void addEmpleado(Empleado empleado){
        if (empleados == null) empleados = new ArrayList<>();
        empleados.add(empleado);
    }

    // metodos

    public void mostrarSalarios(){
        for (Empleado e : empleados){
            System.out.println(e.getNombre() + " " + e.getApellido() + " - " + e.getSalario() + "$");
        }
    }

    public Empleado empleadoMasClientes(){
        EmpleadoComision empleadoConMasClientes = new EmpleadoComision();
        for (Empleado e : empleados){
            if(e instanceof EmpleadoComision){
                EmpleadoComision empleadoComision = (EmpleadoComision) e;
                if(empleadoComision.getClientesCaptados() > empleadoConMasClientes.getClientesCaptados())
                    empleadoConMasClientes = empleadoComision;
            }
        }
        return empleadoConMasClientes;
    }

}
