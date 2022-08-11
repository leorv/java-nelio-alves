
public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return (nota1 * 0.30 + 0.35 * (nota2 + nota3));
    }

}
