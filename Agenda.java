// Adriano Assis
// Diogo Faria
// Jessica de Marchi
// Lavinia Miranda
// Victor Furtado
package agenda;

import java.util.Scanner;
public class Agenda {

    public static void menu() {
        // println do Menu
        System.out.println("\tMENU DA AGENDA");
        System.out.println("\t1 - Novo Cadastro");
        System.out.println("\t2 - Excluir um amigo");
        System.out.println("\t3 - Alterar dia ou mês");
        System.out.println("\t4 - Consultar dia e mês");
        System.out.println("\t5 - Consultar aniversariantes do mês");
        System.out.println("\t6 - Consultar aniversariantes");
        System.out.println("\t7 - Mostrar agenda");
        System.out.println("\t8 - Sair");
        System.out.print("Opção: ");
    }

    public static void novocadastro() {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        
        int n = 15;
        String nome [] = new String[n];
        int dia [] = new int[n];
        int mes [] = new int[n];
        char snC;
        int i;
       
        for (i = 0; i < n; i++){
            
        System.out.print("Digite o nome: ");
        nome [0]= entradaS.nextLine();
        
        System.out.print("Digite o mês: ");
        mes [0]= entrada.nextInt();
        do{
        if (mes[0] < 1 || mes[0] > 12){
        System.out.print("Mês inválido, digite novamente: ");
        mes [0]= entrada.nextInt();
        }
        } while(mes[0] < 1 || mes[0] > 12);
        
        
        switch(mes[0]){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Digite o dia: ");
                dia[0] = entrada.nextInt();
                do{
                if (dia[0] < 1 || dia[0] > 31){
                    System.out.print("Esse mês só tem 31 dias, "
                            + "digite novamente: ");
                    dia[0] = entrada.nextInt();
                }
                else {
                    System.out.println(" ");
                }
                } while(dia[0] < 1 || dia[0] > 31);
                System.out.println("Cadastro concluído!");
                System.out.println(" ");
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Digite o dia: ");
                dia[0] = entrada.nextInt();
                do{
                if (dia[0] < 1 || dia[0] > 30){
                    System.out.print("Esse mês só tem 30 dias, "
                            + "digite novamente: ");
                    dia[0] = entrada.nextInt();
                }
                else {
                    System.out.println(" ");
                }
                } while(dia[0] < 1 || dia[0] > 30);
                System.out.println("Cadastro concluído!");
                System.out.println(" ");
                break;
                
            case 2:
                System.out.print("Digite o dia: ");
                dia[0] = entrada.nextInt();
                do{
                if (dia[0] < 1 || dia[0] > 29){
                    System.out.print("Esse mês só tem 29 dias, "
                            + "digite novamente: ");
                    dia[0] = entrada.nextInt();
                }
                else {
                    System.out.println(" ");
                }
                } while(dia[0] < 1 || dia[0] > 29);
                System.out.println("Cadastro concluído!");
                System.out.println(" ");
                break;                
                
            default: 
                menu();
        }
                nome [0] = nome[0] + 1;
                mes [0] = mes[0] + 1;
                dia [0] = dia[0] + 1;
                
                break;
        }
    }                                
        
        
    
    public static void excluir() {
        System.out.println("Excluir um amigo");
    }
    public static void alterar() {
        System.out.println("3 - Alterar dia ou mês");
    }
    public static void consuldm() {
        System.out.println("4 - Consultar dia e mês");
    }
    public static void anivermes() {
        System.out.println("5 - Consultar aniversariantes do mês");
    }
    public static void aniversariantes() {
        System.out.println("6 - Consultar aniversariantes");
    }
    public static void agenda() {
        System.out.println("7 - Mostrar agenda");
    }
    
     
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //entradas
        String opcao;       
        
        do{
            menu();
            opcao = entrada.nextLine();

             switch (opcao){
                 case "1":
                    novocadastro();
                    break;
                 case "2":
                    excluir();
                    break;
                 case "3":
                    alterar();
                    break;
                 case "4":
                    consuldm();
                    break;    
                 case "5":
                    anivermes();
                    break;    
                 case "6":
                    aniversariantes();
                    break;
                 case "7":
                    agenda();
                    break;   
                 case "8": 
                    System.out.println("Programa encerrado. "
                             + "Obrigado por utilizar a agenda!");
                    System.exit(0);
                    break;
                 default:
                    System.out.println("");
                    System.out.println("Opção inválida. As opções vão de"
                            + " 1 a 8");
                    System.out.println("");
                    System.out.print("Digite a opção novamente: ");
                    System.out.println(" ");
                }
         } while (opcao != "8");       
    } 
}