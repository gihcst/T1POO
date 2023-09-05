import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        scanner scanner = new scanner(System.in);
        
        System.out.println("Bem vindo ao aplicativo.");

            do{
                System.out.println("         Menu         ");
                System.out.println("   1. Criar trem      ");
                System.out.println("   2. Editar trem     ");
                System.out.println("   3. Listar trens    ");
                System.out.println("   4. Desfazer trem   ");
                System.out.println("   5. Sair do programa");
                System.out.println("\n");
                System.out.print(" Digite o número da opção desejada: ");
                escolhaMenu = in.nextInt();
                    if(escolhaMenu < 1 || escolhaMenu > 5){
                        System.out.println("Opção inválida. Digite novamente.");
            }while(escolhaMenu > 0 || escolhaMenu < 5);
            switch(escolhaMenu) {
                case 1:
                System.out.println("Você escolheu a opção 1.");
                break;
    }
}
