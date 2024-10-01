import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Mascota> masc = new ArrayList<>();
        Mascota m1 = new Mascota();
        boolean val = true;
        while (val){
            System.out.println("Bienvenido a la veterinaria");
            System.out.println("Que desea hacer?\n1. Agregar una mascota\n2. Realizar consulta medica\n3. Revisar diagnostico medico\n4. Calcular costo total de consultas\n5. Salir");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    m1.agregarMascota();
                    masc.add(new Mascota(m1.getNombre(),m1.getEspecie(),m1.getEdad(),m1.getPeso()));

                    break;
                case 2:
                    for(Mascota m: masc){
                        System.out.println(m);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    val = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");
            }
        }
    }
}