public class Principal {
    public static void main(String[] args) throws Exception {

        System.out.println("Informações do Paciente.");
        Pessoa paciente = new Paciente("1234", "Sulamerica", "Ricardo", 25, "1234567890");
        paciente.imprimirInfo();

        System.out.println("Informações do Enfermeiro.");

       Pessoa enfermeiro = new Enfermeiro(12, "UTI", "123456", "Fernanda", 20, "455756757575");
       enfermeiro.imprimirInfo();
    }

}
