public class ProgramaTriangulo
{
    public static void main(String[] args)
}
    {
        double a,b,c,p;

        a = Entrada.leiaDouble("Digite o valor do lado A");
        b = Entrada.leiaDouble("Digite o valor do lado B");
        c = Entrada.leiaDouble("Digite o valor do lado C");

        p = a+b+c;

        System.out.print("O perímetro é: ");
        System.out.println(p);
    }