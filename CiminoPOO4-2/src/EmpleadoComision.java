public class EmpleadoComision extends Empleado{

    // atributos de clase
    private double salarioMinimo;
    private int clientesCaptados;
    private int cobroPorCliente;

    // constructores

    public EmpleadoComision(){}

    public EmpleadoComision(int dni, String nombre, String apellido, int anioIngreso,
                            double salarioMinimo, int clientesCaptados, int cobroPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.clientesCaptados = clientesCaptados;
        this.cobroPorCliente = cobroPorCliente;
    }

    // getters y setters

    public int getClientesCaptados() {
        return clientesCaptados;
    }

    public void setClientesCaptados(int clientesCaptados) {
        this.clientesCaptados = clientesCaptados;
    }

    // sobrescribir metodo abstracto
    @Override
    public double getSalario() {
        double salarioFinal = clientesCaptados * cobroPorCliente;
        if (salarioFinal < salarioMinimo) salarioFinal = salarioMinimo;
        return salarioFinal;
    }

}
