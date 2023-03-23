
public class CompileTimePoly {
    public static int multiply(int a, int b) {
        return a * b;}
    public static double multiply(double a, double b, double c) {
        return a * b * c;}

    public static void main(String args[])
    {
        System.out.println(multiply(5, 7));
        System.out.println(multiply(5.1, 6.2, 7.8));
    }
}
