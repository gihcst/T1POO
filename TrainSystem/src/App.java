import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Patio patio = new Patio();
        Scanner scanner = new Scanner(System.in);
        GaragemLocomotivas garagemL = new GaragemLocomotivas();
        GaragemVagoes garagemV = new GaragemVagoes();
        int escolhaMenu = -1;
        int tremId, locoId;
        
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
                System.out.println("Opção inválida. Digite novamente: ");
            }
            if(escolhaMenu == 1){
                System.out.println("Qual o identificador do trem? ");
                tremId = scanner.nextInt();
                while(Patio.verificaIdTrem(tremId) == true){
                    System.out.println("Já existe um trem com esse identificador. Digite novamente: ");
                    tremId = scanner.nextInt();
                }
                    System.out.println("Qual o identificador da primeira locomotiva? ");
                    locoId = scanner.nextInt();
                    while(GaragemLocomotivas.verificaIdLocomotiva(locoId) == false){
                        System.out.println("Essa locomotiva não está disponível. Digite novamente: ");
                        locoId = scanner.nextInt();
                    } 
                        Locomotiva locoadd = GaragemLocomotivas.getLocomotiva(locoId);
                        patio.criaTrem(tremId,locoadd);
                        System.out.println("Trem criado com sucesso! =)");
            }
            if(escolhaMenu == 3){
                System.out.println(patio.toString());
            }
            if (escolhaMenu == 4){
                System.out.println("Qual o identificador do trem que será removido? ");
                tremId = scanner.nextInt();
                while(Patio.verificaIdTrem(tremId) == false){
                    System.out.println("Não existe um trem com esse identificador. Digite novamente: ");
                    tremId = scanner.nextInt();
                }
                patio.desfazTrem(tremId);
                System.out.println("Trem removido com sucesso! =)");
            }
        }while(escolhaMenu != 5);
    }
}