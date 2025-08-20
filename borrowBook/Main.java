/*
 * INSTRUÇÕES DA ATIVIDADE
 * 
 * Adicione 2 ou 3 livros e 1 ou 2 usuários,
 *  realize um empréstimo de livro para 
 * um usuário, e mostrar o status do livro
 *  antes e depois do empréstimo, 
 * evidenciando a mudança de disponibilidade.
 * 
 */
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("SISTEMA DE EMPRÉSTIMOS DA BIBLIOTECA\n");
        Scanner s=new Scanner(System.in);
        int op=0;
        boolean rnn=true; //controle do laço de operação do programa


        Biblioteca emUso;
        Emprestimo realEmp;
        Usuario alunoEmp/*("Nome", "0000000")*/;

        while(rnn){
        System.out.println("1. cadastrar usuário\n 2. realizar empréstimo\n"+
         "3. realizar devolução\n 4. mostrar status do livro\n 5. Sair do programa\n");
        System.out.println("Selecione uma opção: ");
        op=s.nextInt();

       boolean uOpt=false;

       if(op>5 || op<1){
        System.err.println("Solicite um valor de opção entre 1 e 4\n");
       }else{
        uOpt=true;
       }

        if(uOpt){
          switch(op){
            case 1:{
              System.out.println("Insira a matrícula: \n");
              alunoEmp.mat=s.nextInt();
              System.out.println("Insira o nome do aluno: \n");
              alunoEmp.nome=s.nextLine();


              break;
            }
            
            case 2:{

              break;
            }

            case 3:{

              break;
            }

            case 4:{

              break;
            }

            case 5:{
              rnn=false;
              System.out.println("Saindo do programa...\n");
              break;
            }

            default:{
                break;
            }
          }

        }

        }

        s.close();
  /* ::::: VARIÁVEIS QUE VÃO SER USADAS AINDA  :::::
        int mat, cod;
        emUso.sqUSearch(mat);
        emUso.sqLSearch(cod);

        */

        //criar um objeto do tipo Emprestimo
      //  para notificar que o emprestimo aconteceu
    }
}