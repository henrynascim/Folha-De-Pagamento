import java.util.Scanner;

public class FolhaDePagamento {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = entrada.nextLine();

        System.out.println("Valor por hora:");
        double valorH = entrada.nextDouble();

        System.out.println("Horas Trabalhadas:");
        int horaT = entrada.nextInt();

        System.out.println("Valor dos descontos:");
        double valorD = entrada.nextDouble();

        double pay1 = (valorH * horaT);
        double pay = (valorH * horaT) - valorD;


        System.out.printf("Folha de Pagamento %s:%n" , nome);
        System.out.printf("%d horas x R$ %.2f = %.2f %n" , horaT , valorH , pay1);
        System.out.printf("Descontos %s:%n" , valorD);
        System.out.printf("Saldo Final %.2f:%n" , pay);
    }


}
