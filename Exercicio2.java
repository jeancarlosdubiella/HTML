public class Exercicio2 {
    public static void main(String[] args) {
        double a = 80000;
        double b = 200000;
        int i = 0;
            while (a < b) {
                a += a * 0.03;
                b += b * 0.015;
                i++;
            }
            System.out.println("Anos: " + i);
    }
}