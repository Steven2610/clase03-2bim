package paquete05;

public class EstudiantePresencial extends Estudiante {

    int numeroCreditos;
    double costoCredito;

    public EstudiantePresencial(int numeroCreditos, double costoCredito, String nombresEstudiante, String apellidosEstudiante, String identificacionEstudiante, int edadEstudiante) {
        super(nombresEstudiante, apellidosEstudiante, identificacionEstudiante, edadEstudiante);
        this.numeroCreditos = numeroCreditos;
        this.costoCredito = costoCredito;
    }

    //  Métodos establecer y calcular para los datos o atributos de la clase
    // 2.  Método establecerNumeroCreditos(numero: Real)
    public void establecerNumeroCreditos(int numero) {
        numeroCreditos = numero;
    }

    // 3.  Método establecerCostoCredito(valor: Real)
    public void establecerCostoCredito(double valor) {
        costoCredito = valor;
    }

    // 4.  
    // Se implementa el método abstracto declarado en la superclase,
    // bajo las condiciones propias de la subclase
    @Override
    public void calcularMatricula() {
        matricula = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroCreditos() : Entero
    public int obtenerNumeroCreditos() {
        return numeroCreditos;
    }

    // 6. Método obtenerCostoCredito() : Real
    public double obtenerCostoCredito() {
        return costoCredito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EstudiantePresencial{");
        sb.append(super.toString());
        sb.append("numeroCreditos=").append(numeroCreditos);
        sb.append(", costoCredito=").append(costoCredito);
        sb.append('}');
        return sb.toString();
    }

}