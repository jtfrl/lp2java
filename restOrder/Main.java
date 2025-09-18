import java.util.Scanner;
    /*

    Funções:

    acompanhar status: seeStatus()
    cancelar o pedido: canc()
    
    criar pedido
    - nome do pedido, status
    - pendente de status, não especificado
    - só o nome
    */

class Main{
    public static void main(String[] args){

    Pedido pedidoCliente=new Pedido();
    Scanner s=new Scanner(System.in);

    int op;
    boolean rnn=true;

    while(rnn){
        System.out.println("############################## \n");
        System.out.println("SISTEMA DE GERENCIAMENTO DE PEDIDOS\n ");
        System.out.println("##############################\n ");

        System.out.println("Informe a opção que você deseja: \n");

        System.out.println("1. ver status \n 2. cancelar pedido"+
         "\n 3. criar pedido \n 4. sair do programa\n");    
         op=s.nextInt();

         boolean uOptMenu=false;

          if(op<1||op>5){
            IllegalArgumentException e=new IllegalArgumentException("Valor inválido\n");
            throw new IllegalArgumentException("Selecione uma opção válida.\n", e);
        }else{
            uOptMenu=true;
        }

        if(uOptMenu){
            
        }





    }



        
    }
}