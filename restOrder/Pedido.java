import java.util.Scanner;
/*
Antes de tentar
 entregar um pedido, o 
 sistema deve verificar 
 se ele está pronto para ser entregue. 
 Somente pedidos que estejam "prontos" poderão ser entregues.
*/


public class Pedido{
    static private String nome_pedido; //armazena o prato
    private rOrder pedidostts;
    private int id;

    //contagem para geração de identificador de pedidos
    private static int nextId=1; 

   

    public Pedido(String nPedido, rOrder status){
        this.nome_pedido=nPedido;
        this.pedidostts=status;
        this.id=nextId++;
    }

    public Pedido(){
        this.id=nextId++;
        this.nome_pedido="NÃO ESPECIFICADO";
        this.pedidostts=rOrder.PENDENTE;
    }

    /*
    Pedido pd
    void setPedido(String nome, rOrder pstts, int id){


    }
    */

   rOrder seeStatus(){
    return this.pedidostts;
   }

   int seeNOrdem(){
    return this.id;
   }
   

   public void changeStatus(rOrder novoSts){
    this.pedidostts=novoSts;
    }
  

   public Pedido(String nome){
    this();
    this.nome_pedido=nome;
   }

   public void changeInfo(){
    int op;
    boolean rnn=true;
            while(rnn){
                System.out.println("Informe a opção que você deseja: ");
                System.out.println("1. mudar status \n 2. sair do programa\n");
                Scanner s=new Scanner(System.in);
                op=s.nextInt();
                boolean uOpt=false;
                if(op<1||op>2){
                    IllegalArgumentException e=new IllegalArgumentException("Valor diferente de 1 e de 2\n");
                    throw new IllegalArgumentException("Selecione 1 ou 2.\n", e);
                }else{
                    uOpt=true;
                }
                if(uOpt){
                    switch (op) {
                        case 1:{        
                        // rOrder rNum=new rOrder();
                            System.out.println("Informe a opção correspondente ao status: ");

                            System.out.println( " PENDENTE(1), PREPARANDO(2), PRONTO(3),"+
                    "ENTREGUE(4), CANCELADO(5);");
                        int optRorder=s.nextInt();

                        if(optRorder<1||optRorder>5){
                            IllegalArgumentException e=new IllegalArgumentException("Valor inválido\n");
                            throw new IllegalArgumentException("Tente novamente\n", e);
                        }
                        rOrder newStatus=null;
                        
                        //converte o valor para o número da ordem 
                        for(rOrder orderStatus: rOrder.values()){
                            if(orderStatus.getR()==optRorder){
                                newStatus=orderStatus;
                                break;
                            }
                        }

                        if(newStatus!=null){
                            this.pedidostts=newStatus;
                             System.out.println("Status alterado para: " + newStatus);
                        }
                    
                            break;
                        }
                            
                        
                        case 2:{
                            rnn=false;
                            System.out.println("Saindo do programa\n");
                        break;
                        }
                            default:{
                            break;
                            }
                    }
                }

            }
    }

    public boolean comecarEntrega(){
        if(this.pedidostts==rOrder.PRONTO) return true;
        return false;
    }

 
  public void canc(){
    //this.pedidostts=rOrder.PENDENTE;
    if(this.pedidostts==rOrder.ENTREGUE){
        System.out.println("Pedido não pode ser cancelado | status: "+this.pedidostts);
    }else if (this.pedidostts==rOrder.PRONTO) {
        this.pedidostts=rOrder.CANCELADO;
            System.out.println("Pedido cancelado "+this.nome_pedido);
    }
            this.pedidostts=rOrder.CANCELADO;
    System.out.println("Pedido cancelado "+this.nome_pedido);
  }





}