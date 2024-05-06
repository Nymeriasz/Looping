import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean looping = true;

        while (looping){
            System.out.println("\n1 - Fazer login\n2 - Criar conta\n3 - Encerrar sistema");

            try {
                int opcao = Integer.parseInt(sc.nextLine());

                if (opcao == 1 | opcao == 2){
                    System.out.println("Tela de cadastro");
                } else if (opcao == 3){
                    System.out.println("Sistema encerrado");
                    looping = false;
                } else {
                    System.out.println("Opção inválida");
                }
            } catch (Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
