import java.util.*;
public class Mascota {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected double peso;

    Scanner sc = new Scanner(System.in);

    public Mascota() {
    }
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", edad='" + edad + '\'' +
                ", peso=" + peso +
                '}';
    }

    public void agregarMascota(){
        System.out.println("Para agregar una mascota...");
        System.out.println("Ingrese el nombre de la mascota:");
        this.nombre = sc.next();
        System.out.println("Ingrese la especie de la mascota:");
        this.especie = sc.next();
        System.out.println("Ingrese la edad de la mascota:");
        this.edad = sc.nextInt();
        System.out.println("Ingrese el peso de la mascota:");
        this.peso = sc.nextDouble();
    }
    public void actualizarPeso(){
        System.out.println("Ingrese el peso actual de la mascota:");
        this.peso = sc.nextDouble();
    }
    public int incrementarEdad(){
        return this.edad++;
    }
    public void describirMascota(){
        System.out.println("Mascota: \nNombre: " + this.nombre + "\nEspecie: " + this.especie
                + "\nPeso: " + this.peso + "\nEdad: " + this.edad);
    }
    public void cambioInformacion(){
        System.out.println("Ingrese la actual de la mascota:");
        this.edad = sc.nextInt();
    }
}
