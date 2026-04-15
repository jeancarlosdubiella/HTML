import java.util.scanner

public class Arquivo {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Insira um valor e eu direi se é positivo ou negativo: ");
    double valor = entrada.nextDouble();
    entrada.nextLine();

    if(valor > 0.0){
        System.out.println("Positivo");
    } else if (valor == 0.0){
        System.out.println("Zero");
    } else {
        System.out.println("Negativo");
    }

    entrada.close();



    System.out.println("valor final de x: " + x);

    }

}