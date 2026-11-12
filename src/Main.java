import usuarios.Administrador;
import usuarios.Cliente;
import vehiculos.Coche;
import vehiculos.Furgoneta;
import vehiculos.Moto;
import vehiculos.Patinete;

public class Main {
    public static void main(String[] args) {
        Coche c1 = new Coche("Fabia", 5, 20.5, "Skoda", 95, Coche.Motor.GASOLINA);
        Coche c2 = new Coche("Focus", 5, 18.5, "Ford", 80, Coche.Motor.DIESEL);
        Moto m1 = new Moto("Primavera", 2, 10.5, "Vespa", 125);
        Moto m2 = new Moto("Ninja", 2, 18.75, "Kawasaki", 650);
        Patinete p1 = new Patinete("Scooter 5", 1, 6.5, "Xiaomi", 477, false);
        Patinete p2 = new Patinete("Ninebot", 1, 8.5, "Segway", 750, true);
        Furgoneta f1 = new Furgoneta("Citan", 7, 30.5, "Mercedes", 3660.75);
        Furgoneta f2 = new Furgoneta("Berlingo", 5, 23.5, "Citroën", 1050.50);

        Cliente cl1 = new Cliente("Pepito Pérez", "1234", 123, 1985, p1, 748364);
        Cliente cl2 = new Cliente("Laurita Martínez", "4321", 321, 1996, f1, 192731);
        Administrador a1 = new Administrador("Paquito Gómez", "elpaqui", 1, 1970, Administrador.Rol.JEFE);

        a1.asignarVehiculo(cl1, m1);
    }
}