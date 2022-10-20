public class Main {
    public static void main(String[] args) {
        Cliente cliente= new Cliente();
        Trabajador trabajador=new Trabajador();

        trabajador.setEdad(3);
        trabajador.setNombre("Yumisai");
        trabajador.setNumeroTelefono("04145512273");

        cliente.setEdad(25);
        cliente.setNombre("Henry Puertas");
        cliente.setNumeroTelefono("0412551336");

        System.out.println("Datos del cliente");
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getNumeroTelefono());

        System.out.println("Datos del trabajador");
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getNumeroTelefono());
    }
}

abstract class Persona{
    int edad;
    String nombre;
    String numeroTelefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

}

class Cliente extends Persona{

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}

class Trabajador extends Persona{

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}