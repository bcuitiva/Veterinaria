import java.sql.SQLOutput;
import java.util.*;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mascota m1 = new Mascota();
        ConsultaMedica con = new ConsultaMedica();

        Map <Integer,Mascota> masc = new HashMap<>();
        Map <Integer,ConsultaMedica> consulMasc = new HashMap<>();

        boolean val = true;
        int id = 0;
        int numConsulta = 0;

        while (val){
            System.out.println("\nBienvenido a la veterinaria ''");
            System.out.println("Que desea hacer?\n1. Agregar una mascota\n2. Actualizar datos de una mascota\n3. Realizar consulta medica" +
                    "\n4. Revisar historial de consultas\n5. Calcular costo total de consultas\n6. Salir");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    m1.agregarMascota();
                    masc.put(m1.getClave(),new Mascota(m1.getNombre(),m1.getEspecie(),m1.getEdad(),m1.getPeso(),m1.getClave()));
                    break;
                case 2:
                    System.out.println("Ingrese la id de la mascota a la que le desea actualizar datos:");
                    id = sc.nextInt();
                    if (masc.containsKey(id)) {
                        m1 = masc.get(id);
                        System.out.println("La id " + id + " pertenece a la mascota de nombre: " + m1.getNombre());
                        m1.cambioInformacion();
                        masc.replace(id,new Mascota(m1.getNombre(),m1.getEspecie(),m1.getEdad(),m1.getPeso(),m1.getClave()));
                    } else{
                        System.out.println("La id que ingreso no corresponde a ninguna mascota.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la id de la mascota a la que le desea realizar una consulta:");
                    id = sc.nextInt();
                    if (masc.containsKey(id)) {
                        m1 = masc.get(id);
                        con.setMascota(m1);
                        System.out.println("La id " + id + " pertenece a la mascota de nombre: " + m1.getNombre());
                        con.agregarConsulta();
                        con.calcularCosto();
                        numConsulta++;
                        consulMasc.put(numConsulta, new ConsultaMedica(m1, con.getDiagnosticoMedico(), con.getCostoConsulta(), con.getTotalConsulta(),con.getContConsulta()));
                    } else{
                        System.out.println("La id que ingreso no corresponde a ninguna mascota.");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la id de la mascota a la que desea revisar el historia de consultas");
                    id = sc.nextInt();
                    for (Integer consulta: consulMasc.keySet()){
                        con = consulMasc.get(consulta);
                        if (id == con.getMascota().getClave()){
                            System.out.println("Nombre: " + con.getMascota().getNombre() + "\tDiagnostico: " + con.getDiagnosticoMedico() + "\tCosto consultas: " + con.getCostoConsulta());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese la id de la mascota a la que le desea revisar el costo total de las consultas:");
                    id = sc.nextInt();
                    if (masc.containsKey(id)) {
                        m1 = masc.get(id);
                        for (Integer consulta: consulMasc.keySet()){
                            con = consulMasc.get(consulta);
                            con.setMascota(m1);
                            if (id == con.getMascota().getClave()){
                                con.setTotalConsulta(con.getTotalConsulta());
                            }
                        }
                        System.out.println("\nLa id " + id + " pertenece a " + masc.get(id));
                        System.out.println("El costo total de las consultas de la mascota fue de $" + con.getTotalConsulta());
                    } else{
                        System.out.println("La id que ingreso no corresponde a ninguna mascota.");
                    }
                    break;
                case 6:
                    val = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta.");
            }
        }
    }
}