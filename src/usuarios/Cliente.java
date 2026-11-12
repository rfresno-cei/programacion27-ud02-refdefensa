package usuarios;

import vehiculos.Vehiculo;

public class Cliente extends Usuario {
    private Vehiculo vehiculo;
    private int numeroSocio;

    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Vehiculo vehiculo, int numeroSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.vehiculo = vehiculo;
        this.numeroSocio = numeroSocio;
    }

    public Cliente() {
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public double calcularPrecio(int numVehiculos, int dias) {
        return this.vehiculo.calcularPrecio(numVehiculos, dias);
    }

    public String toString() {
        return "Cliente " + super.toString();
    }
}
