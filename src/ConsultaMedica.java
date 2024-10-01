import java.util.*;
public class ConsultaMedica {
    private Mascota mascota;
    private String diagnosticoMedico;
    private double costoConsulta;

    Scanner sc = new Scanner(System.in);

    public ConsultaMedica() {
    }
    public ConsultaMedica(Mascota mascota, String diagnosticoMedico, double costoConsulta) {
        this.mascota = mascota;
        this.diagnosticoMedico = diagnosticoMedico;
        this.costoConsulta = costoConsulta;
    }

    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public String getDiagnosticoMedico() {
        return diagnosticoMedico;
    }
    public void setDiagnosticoMedico(String diagnosticoMedico) {
        this.diagnosticoMedico = diagnosticoMedico;
    }
    public double getCostoConsulta() {
        return costoConsulta;
    }
    public void setCostoConsulta(double costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    @Override
    public String toString() {
        return "ConsultaMedica{" +
                "mascota=" + mascota +
                ", diagnosticoMedico='" + diagnosticoMedico + '\'' +
                ", costoConsulta='" + costoConsulta + '\'' +
                '}';
    }

    public void calcularCosto(int numConsultas){
        System.out.println("Recibio algun tipo de medicamento?\n1. Si\n2. No");
        int op = sc.nextInt();
        switch (op){
            case 1 :
                this.costoConsulta = (costoConsulta * 0.15) + (costoConsulta * numConsultas);
                System.out.println("El costo final de las " + numConsultas + " consultas de su mascota fue de $" + costoConsulta);
                break;
            case 2 :
                this.costoConsulta = costoConsulta * numConsultas;
                System.out.println("El costo final de las " + numConsultas + " consultas de su mascota fue de $" + costoConsulta);
                break;

        }
    }
    public void agregarConsulta(){
        int numConsultas = 0;
        numConsultas = numConsultas++;
    }
}
