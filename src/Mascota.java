import java.util.*;
public class Mascota {
    protected String nombre;
    protected String especie;
    protected int edad;
    protected double peso;
    protected int clave;

    Scanner sc = new Scanner(System.in);

    public Mascota() {
    }
    public Mascota(String nombre, String especie, int edad, double peso, int clave) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.clave = clave;
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
    public int getClave() {
        return clave;
    }
    public void setClave(int clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Mascota: " +
                "\n\t- Clave Mascota: " + clave +
                "\n\t- Nombre: " + nombre +
                "\n\t- Especie: " + especie +
                "\n\t- Edad: " + edad + " anios" +
                "\n\t- Peso: " + peso + "Kg";
    }

    public void agregarMascota(){
        System.out.println("Para agregar una mascota...");
        System.out.println("Ingrese un identificador numerico (id) para su mascota:");
        this.clave = sc.nextInt();
        System.out.println("Ingrese el nombre de la mascota:");
        this.nombre = sc.next();
        System.out.println("Ingrese la especie de la mascota:");
        this.especie = sc.next();
        System.out.println("Ingrese la edad de la mascota:");
        this.edad = sc.nextInt();
        System.out.println("Ingrese el peso de la mascota:");
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
        boolean val = true;
        while(val) {
            System.out.println("Que datos desea actualizar?\n1. Peso\n2. Edad\n3. Peso y Edad");
            int op = sc.nextInt();
            if (op == 1) {
                System.out.println("Ingrese el peso de la mascota:");
                this.peso = sc.nextDouble();
                val = false;
            } else if (op == 2) {
                System.out.println("Ingrese la edad de la mascota:");
                this.edad = sc.nextInt();
                val = false;
            } else if (op == 3){
                System.out.println("Ingrese el peso de la mascota:");
                this.peso = sc.nextDouble();
                System.out.println("Ingrese la edad de la mascota:");
                this.edad = sc.nextInt();
                val = false;
            } else {
                System.out.println("Ingrese una opcion valida.");
            }
        }
        System.out.println("----- Informacion Actualizada con exito ------");
    }
}
