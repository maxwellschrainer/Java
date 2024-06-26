
public class questionario12 {

    public static void main(String[] args) {

        String x1 = "andorinha";
        String x2 = "";

        int i = x1.length() - 1;
        while (i >= 0) {
            x2 = x2 + x1.charAt(i);
            i--;
        }

        if (x1 == x2) {
            System.out.println("A string x1 pode ser lida de trás para frente");
        }
    }
}
