public class questionario02 {

    public static void main(String[] args) {

        boolean sensorAguaOK = true;
        boolean sensorCapsulaOK = false;

        if (sensorAguaOK) {
            System.out.println("A água está na temperatura correta.");
        } else {
            System.out.println("Aguarde a água chegar na temperatura correta.");
        }

        if (sensorCapsulaOK) {
            System.out.println("Você já pode fazer seu café");
        } else {
            System.out.println("Coloque uma cápsula de café na máquina.");
        }
    }

}
