
package mainconta;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
           System.out.println("Novo por aqui né!? Vamos criar ma conta pra você"
                   + "\nQual tipo você prefere?\n(1)-Conta Corrente"
                + "\n(2)-Conta Poupança\n(3)-Conta Especial\n(4)-Conta Universitária ");
            Scanner tipo = new Scanner(System.in);
                       
            switch(tipo.nextInt()){                
                case 1:
                    System.out.println("Me diz qual seu nome: ");
                    Scanner nome = new Scanner(System.in);
                    String n1 = nome.nextLine();
                    System.out.println("Agora preciso saber seu cpf: ");
                    Scanner cpf = new Scanner(System.in);
                    String cp1 = cpf.nextLine();                    
                    ContaCc(n1, cp1);                        
                    break;
                case 2:
                    System.out.println("Me diz qual seu nome: ");
                    Scanner nome1 = new Scanner(System.in);
                    String n2 = nome1.nextLine();
                    System.out.println("Agora preciso saber seu cpf: ");
                    Scanner cpf1 = new Scanner(System.in);
                    String cp2 = cpf1.nextLine();              
                    ContaPoupanca(n2, cp2);                    
                    break;
                case 3:
                    System.out.println("Você selecionou uma Conta Especial");
                    System.out.println("Me diz qual seu nome: ");
                    Scanner nome2 = new Scanner(System.in);
                    String n3 = nome2.nextLine();
                    System.out.println("Agora preciso saber seu cpf: ");
                    Scanner cpf2 = new Scanner(System.in);
                    String cp3 = cpf2.nextLine();                    
                    ContaEspecial(n3, cp3, 1000);                  
                    break;
                case 4:
                    System.out.println("Cansado dessas taxas absurtas né? se preocupa não, aqui não cobramos taxas ;)"
                            + "\nSó me fala qual curso você está fazendo. :)");
                    Scanner curso = new Scanner(System.in);
                    String c = curso.nextLine();
                    System.out.println("Me diz qual seu nome: ");
                    Scanner nome3 = new Scanner(System.in);
                    String n = nome3.nextLine();
                    System.out.println("Agora preciso saber seu cpf: ");
                    Scanner cpf3 = new Scanner(System.in);
                    String cp = cpf3.nextLine();                    
                    ContaUni(n, cp, c);
                    
                    break;            
            }
            
            
        
        
        
        
    }
    private static void ContaEspecial(String nome, String cpf, double limite){
        int i=0;
        double setSaldo;
        ContaEspecial es = new ContaEspecial(nome, cpf,limite);
        while(i != 1){        
        System.out.println("Selecione qual das opções abaixo você deseja realizar"
                            + "\n(1)-Deposito\n(2)-Saque");
        Scanner op = new Scanner(System.in);
        //op.nextInt();
        
        switch (op.nextInt()) {
            case 1:                
                es.depositar(valor());
                es.status();
                break;
            case 2:
                //System.out.println(es.getSaldo());
                System.out.println(es.sacar(valor()));
                es.status();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Deseja finalizar?\nSe sim (1)\nSe não (2)");
                        Scanner test = new Scanner(System.in);
                        i = test.nextInt();
                    }
    }
    
    
    private static void ContaPoupanca(String nome, String cpf){        
        int i=0;
        double setSaldo;
        ContaPoupanca pou = new ContaPoupanca(nome, cpf);
        while(i != 1){
        System.out.println("Selecione qual das opções abaixo você deseja realizar"
                            + "\n(1)-Deposito\n(2)-Saque");
        Scanner op = new Scanner(System.in);
        //op.nextInt();
        switch (op.nextInt()) {
            case 1:                
                pou.depositar(valor());
                pou.status();
                break;
            case 2:
                System.out.println(pou.sacar(valor()));
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        System.out.println("Deseja finalizar?\nSe sim (1)\nSe não (2)");
                        Scanner test = new Scanner(System.in);
                        i = test.nextInt();
                    }
        
        
        
    }
    
    
    private static void ContaCc(String nome, String cpf){        
        int i=0;
        double setSaldo;
        Conta Cc = new Conta(nome, cpf);
        while(i != 1){
        System.out.println("Selecione qual das opções abaixo você deseja realizar"
                            + "\n(1)-Deposito\n(2)-Saque");
        Scanner op = new Scanner(System.in);
        //op.nextInt();
        switch (op.nextInt()) {
            case 1:                
                Cc.depositar(valor());
                Cc.status();
                break;
            case 2:
                System.out.println(Cc.sacar(valor()));
                //Cc.status();
                        
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        
        System.out.println("Deseja finalizar?\nSe sim (1)\nSe não (2)");
                        Scanner test = new Scanner(System.in);
                        i = test.nextInt();
                    }
    }
    
    private static void ContaUni(String nome, String cpf, String curso){                                                
        int i=0;
        double setSaldo;
        ContaUni uni = new ContaUni(nome, cpf, curso);
        while(i != 1){        
        System.out.println("Selecione qual das opções abaixo você deseja realizar"
                            + "\n(1)-Deposito\n(2)-Saque");
        Scanner op = new Scanner(System.in);
        //op.nextInt();
        switch (op.nextInt()) {
            case 1:                
                uni.depositar(valor());
                uni.status();
                break;
            case 2:
                System.out.println(uni.sacar(valor()));
                //2
                uni.status();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
         System.out.println("Deseja finalizar?\nSe sim (1)\nSe não (2)");
                        Scanner test = new Scanner(System.in);
                        i = test.nextInt();
                       
                    }                   
                         
    }    
       
     
       private static double valor(){
           System.out.println("Infome o valor: ");
           Scanner v = new Scanner(System.in);
           return v.nextDouble();
       }
        
    }



