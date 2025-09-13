
/*
Antes de tentar
 entregar um pedido, o 
 sistema deve verificar 
 se ele está pronto para ser entregue. 
 Somente pedidos que estejam "prontos" poderão ser entregues.
*/

import java.util.Scanner;


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
   

   public void changeStatus(rOrder novoSts){
    this.pedidostts=novoSts;
    }
  

   public Pedido(String nome){
    this();
    this.nome_pedido=nome;
   }

   public void changeInfo(){
    int op;
    System.out.println("Informe a opção que você deseja: ");
    Scanner s=new Scanner(System.in);
    op=s.nextInt();
    /*
    if(s<1||s>2){
        throw new 
    }
    */

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