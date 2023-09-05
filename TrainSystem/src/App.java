import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolhaMenu = -1;
        
        System.out.println("Bem vindo ao aplicativo.");

        do{
            System.out.println("\n");
            System.out.println("         Menu         ");
            System.out.println("   1. Criar trem      ");
            System.out.println("   2. Editar trem     ");
            System.out.println("   3. Listar trens    ");
            System.out.println("   4. Desfazer trem   ");
            System.out.println("   5. Sair do programa");
            System.out.println("\n");
            System.out.print("Digite o número da opção desejada: ");
            escolhaMenu = scanner.nextInt();
                if(escolhaMenu < 1 || escolhaMenu > 5){
                System.out.println("Opção inválida. Digite novamente.");
                }
            if(escolhaMenu == 1){
                System.out.println("Opção 1 foi selecionada.");
            }
        }while(escolhaMenu != 5);
    }
}