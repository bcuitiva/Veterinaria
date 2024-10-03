import java.util.*;
public class ConsultaMedica {
    private Mascota mascota;
    private String diagnosticoMedico;
    private double costoConsulta;
    private double totalConsulta;
    private int contConsulta;

    Scanner sc = new Scanner(System.in);

    public ConsultaMedica() {
    }
    public ConsultaMedica(Mascota mascota, String diagnosticoMedico, double costoConsulta,double totalConsulta, int contConsulta) {
        this.mascota = mascota;
        this.diagnosticoMedico = diagnosticoMedico;
        this.costoConsulta = costoConsulta;
        this.totalConsulta = totalConsulta;
        this.contConsulta = contConsulta;
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
    public int getContConsulta() {
        return contConsulta;
    }
    public void setContConsulta(int contConsulta) {
        this.contConsulta = contConsulta;
    }

    public double getTotalConsulta() {
        return totalConsulta;
    }

    public void setTotalConsulta(double totalConsulta) {
        this.totalConsulta = totalConsulta;
    }

    @Override
    public String toString() {
        return "ConsultaMedica:" +
                "\n\t" + mascota +
                "\n\t- Diagnostico Medico: " + diagnosticoMedico +
                "\n\t- Numero de consultas: " + contConsulta +
                "\n\t- Costo total de Consultas: " + totalConsulta;
    }

    public void calcularCosto(){
        System.out.println("Recibio algun tipo de medicamento?\n1. Si\n2. No");
        int op = sc.nextInt();
        switch (op){
            case 1 :
                this.totalConsulta = totalConsulta + ((costoConsulta * 0.15) + costoConsulta);
                break;
            case 2 :
                this.totalConsulta = totalConsulta + costoConsulta;
                break;
        }
    }
    public void costoTotalConsultas(){
        int id;
        System.out.println("El costo final de las consultas de la mascota fue de $" + this.totalConsulta + " con cualquier tipo de medicamento recibido.");
    }

    public void agregarConsulta(){
        System.out.println("Ingrese el diagnostico de la consulta medica:");
        this.diagnosticoMedico = sc.nextLine();
        //sc.next();
        System.out.println("Ingrese el costo de la consulta:");
        costoConsulta = sc.nextDouble();
        this.contConsulta++;
    }
}
