import java.util.Scanner;

class Main{
    public static void main(String[] args){
        System.out.println("SISTEMA DE EMPRÉSTIMOS DA BIBLIOTECA\n");
        Scanner s=new Scanner(System.in);
        int op=0;
        boolean rnn=true; //controle do laço de operação do programa


        Biblioteca emUso=new Biblioteca();
        //Emprestimo realEmp;
        Usuario alunoEmp=new Usuario("Nome", 0000000);
        Livro lvEmp=new Livro(999999, 999, "Titulo", "Autor");

        while(rnn){
              System.out.println("1. cadastrar usuário\n 2. realizar empréstimo\n"+
              "3. realizar devolução\n 4. mostrar status do livro\n"+"5. exibir lista de Livro-Aluno\n"+
              "6. adicionar livro\n"+"7. Sair do programa\n");
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

                        emUso.InsListadeAlunos(alunoEmp.nome, alunoEmp.mat);
                        if(emUso.sqUSearch(alunoEmp.mat)!=null){
                          System.out.println("Aluno cadastrado com sucesso. \n");
                        }else{
                          System.err.println("ATENÇÃO: Cadastro não efetuado. \n");
                        }

                        break;
                      }
                      
                      case 2:{
                        System.out.println("Insira a matrícula: \n");
                        alunoEmp.mat=s.nextInt();
                        System.out.println("Insira o nome do aluno: \n");
                        alunoEmp.nome=s.nextLine();
                        System.out.println("Insira o código do livro: \n");
                        lvEmp.cod=s.nextInt();

                        if(emUso.realizarEmp(alunoEmp.nome, alunoEmp.mat, lvEmp.cod)){
                          System.out.println("Empréstimo realizado. \n");
                        }else{
                          System.err.println("ATENÇÃO: Emprestimo não efetuado. \n");
                        }

                        break;
                      }

                      case 3:{
                        System.out.println("Insira o código do livro: \n");
                        lvEmp.cod=s.nextInt();
                        
                        if(emUso.devolverLivro(lvEmp.cod)){
                          System.out.println("Livro devolvido: "+lvEmp.titulo);
                        }

                        break;
                      }

                      case 4:{
                         System.out.println("Insira o título do livro: \n");
                          lvEmp.titulo=s.nextLine();
                          System.out.println("Insira o autor:\n");
                          lvEmp.autor=s.nextLine();

                          boolean status=lvEmp.posRealizarEmp();
                          if(status){
                            System.out.println("Livro disponível\n.");
                            System.out.println(lvEmp.titulo+" \t"+lvEmp.autor+"\t"+lvEmp.qtd+"\n");
                          }                         

                        break;
                      }

                      case 5:{
                        emUso.exibirLivroAluno();
                        break;
                      }

                       case 6:{
                        System.out.println("Insira o código do livro: \n");
                        lvEmp.cod=s.nextInt();
                        System.out.println("Insira a quantidade da(s) unidade(s) do(s) livro: \n");
                        lvEmp.qtd=s.nextInt();
                        System.out.println("Insira o autor:\n");
                        lvEmp.autor=s.nextLine();
                        System.out.println("Insira o título:\n");
                        lvEmp.titulo=s.nextLine();

                      
                        emUso.InsListadeLivros(lvEmp.cod, lvEmp.qtd, lvEmp.autor, lvEmp.titulo);
                        if(emUso.sqLSearch(lvEmp.cod)!=null){
                          System.out.println("Livro cadastrado com sucesso. \n");
                        }else{
                          System.err.println("ATENÇÃO: Cadastro não efetuado. \n");
                        }
                       
                        break;

                      }

                       case 7:{
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
    }
}