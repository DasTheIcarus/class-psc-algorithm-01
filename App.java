import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        //parte das amizades
        Scanner scanner = new Scanner(System.in);
        int quantidadeAmizade = 0;
        String sociavel = "s";
        int alegria = 0, tristeza = 0;
        System.out.println("Iniciando relatório das emoções de Riley");
        System.out.println("\n Riley fez novas amizades? (S/N)");
        String fezAmizade = scanner.nextLine();
        
        if(sociavel.equals(fezAmizade)){
            System.out.println("\n Quantas amizades Riley fez?");
            quantidadeAmizade = scanner.nextInt();
            alegria += quantidadeAmizade * 10;
        }else{
            tristeza += 30;
        }
        
        //parte das provas
        int A1,A2,A3;
        System.out.println("Qual a nota da Riley na A1?\n");
        A1 = scanner.nextInt();
        System.out.println("Qual a nota da Riley na A2?\n");
        A2 = scanner.nextInt();
        System.out.println("Qual a nota da Riley na A3?\n");
        A3 = scanner.nextInt();
        double mediaNota = (A1+A2+A3)/3;
        if(mediaNota >= 7){
            alegria += 50;

        }else{
            tristeza += 50;
        }
        
        //parte da programação
        System.out.println("\nQuantos exercícios da lista do Daniel ela conseguiu fazer?\n");
        int quantidadeExercicios = scanner.nextInt();
        alegria += quantidadeExercicios * 10;
        tristeza += (10 - quantidadeExercicios) * 10;

        //comparação
        if(alegria>tristeza){
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.\nAlegria tem " + alegria + " pontos!");
        }else{
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.\nTristeza tem " + tristeza + "pontos!");
        }
        scanner.close();

        
    }
}