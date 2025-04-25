public class EmpleadoSalarioFijo extends Empleado{

    // atributos de clase constantes
    private final double DOS_A_CINCO_ANIOS = 0.05;
    private final double MAS_DE_CINCO_ANIOS = 0.10;

    // Atributos de clase
    private double sueldo;
    private double porcentajeAntiguedad = 0;

    // constructores

    public EmpleadoSalarioFijo() {}

    public EmpleadoSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, double sueldo) {
        super(dni, nombre, apellido, anioIngreso);
        this.sueldo = sueldo;
    }

    // sobrescribir metodo abstracto
    @Override
    public double getSalario() {
        if (super.getAnioIngreso() <= 2020){
            porcentajeAntiguedad = MAS_DE_CINCO_ANIOS;
        } else if (super.getAnioIngreso() >= 2021 && super.getAnioIngreso() <= 2023){
            porcentajeAntiguedad = DOS_A_CINCO_ANIOS;
        }
        return sueldo + (sueldo * porcentajeAntiguedad);
    }

}
