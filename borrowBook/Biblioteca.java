class Biblioteca{
    Usuario lista_u;
    Livro lista_l;
    Emprestimo lista_emp;
    
    void InsListadeLivros(int c, int q, String t, String a){
        Livro novol=new Livro(c,q,t,a);
        novol.prox=lista_l;
        lista_l=novol;
    }


    void InsListadeAlunos(String n, int m){
        Usuario novou=new Usuario(n, m);
        novou.prox=lista_u;
        lista_u=novou;
    }


    Usuario sqUSearch(int mat){
        Usuario atual=lista_u;
       while(atual!=null){
        if(atual.mat==mat){
            return atual;
        }
        atual=atual.prox;
       }

        System.out.println(mat+": Usuário não encontrado!\n");
        return null;
    }


    Livro sqLSearch(int cod){
        Livro atual=lista_l;
        while(atual!=null){
            if(atual.cod==cod){
                return atual;
            }
            atual=atual.prox;
        }
        System.out.println(cod+": Livro não encontrado\n");
        return null;
        
    }


    void exibirLivroAluno(){
        Livro at=lista_l;
        Usuario us=lista_u;
        Emprestimo empAVer= new Emprestimo(us, at);

        System.out.println("CATÁLOGO DE LIVROS\n");
        System.out.println("LEGENDA: S/E='SEM EMPRÉSTIMO\n"+
        "C/E='COM EMPRÉSTIMO ATIVO'\n");

        while(at!=null){ //ver que alteração deve ser feita em at!
            System.out.println("' "+at.titulo+" '"+" por "+at.autor);
           
           
           if(at.qtd>0){
            System.out.println(" ::: DISPONÍVEL (S/E)\n");
                System.out.println(" ::: Há alguns livros que não foram emprestados.\n");

                Emprestimo empAtual=lista_emp;
                while(empAtual!=null){
                    if(empAtual.l_emp.cod==at.cod && empAtual.empAtivo){
                        System.out.println("EMPRÉSTIMO: "+empAtual.u_emp.nome);
                        break;
                    }
                    empAtual=empAtual.prox;
                }
                at=at.prox;

           }else{
            System.out.println(" ::: C/E");
            if(at.qtd==0){
                System.out.println(at.titulo+" ::: Todos os livros desse título foram emprestados\n ");
            }
           }
             at=at.prox;
        }
          System.out.println();
    }


    boolean realizarEmp(String n, int mat, int cod){
        Usuario uEmp=new Usuario(n, mat);
        Livro lEmp=sqLSearch(cod);

        if(uEmp==null || lEmp==null){
            System.err.println("Usuário/Código não informado(s)\n");
            return false;
        }

        if(lEmp.qtd<1){
            System.out.println("Livro não disponível.\n");
        }

        boolean empEfetivado=lEmp.regDev;


        if(empEfetivado){
            Emprestimo novoEmp=new Emprestimo(uEmp, lEmp);
            novoEmp.prox=lista_emp;
            lista_emp=novoEmp;
            return true;
        }

        return false;
    }


    boolean devolverLivro(int cod){
        Emprestimo empAtual=lista_emp;
        Emprestimo ant=null;

        while(empAtual!=null){
            if(empAtual.l_emp.cod==cod && empAtual.empAtivo){
                empAtual.devolver();
                return true;
            }

        ant=empAtual; //elemento atual da lista deve ser atualizado
        empAtual=empAtual.prox;
        }
        System.out.println("Nenhum empréstimo ativo foi encontrado.\n");
        return false;
       
    }

}