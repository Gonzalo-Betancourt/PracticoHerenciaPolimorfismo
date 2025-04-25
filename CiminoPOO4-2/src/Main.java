public class Main {

    public static void main(String[] args) {

        // Instanciar una clase empresa
        Empresa empresaConstructora = new Empresa();

        // Añadir los empleados a la clase empresaConstructora (2 sueldo fijo y 3 a comision)
        empresaConstructora.addEmpleado(new EmpleadoSalarioFijo(33412339, "Federico", "Mendoza", 2012,10000));
        empresaConstructora.addEmpleado(new EmpleadoSalarioFijo(38223417, "Lucas", "Pérez", 2022,7000));
        empresaConstructora.addEmpleado(new EmpleadoComision(29423130, "Rosa", "Montiel", 2016, 3500, 21, 250));
        empresaConstructora.addEmpleado(new EmpleadoComision(40328001, "Martín", "Tarzia", 2023, 3500, 8, 250));
        empresaConstructora.addEmpleado(new EmpleadoComision(24010946, "Walter", "Molina", 2009, 3500, 33, 250));

        // metodo mostrar salarios
        empresaConstructora.mostrarSalarios();

        // empleado mas clientes
        System.out.println("El empleado con más clientes es: " + empresaConstructora.empleadoMasClientes().getNombre());

    }

}