class Biblioteca{
    int totalAlunosB; //total de alunos com emp.
    //Livro[] acv; //acervo de livros
    Usuario lista_u;
    Livro lista_l;
    Emprestimo var;
    
    void InsListadeLivros(int c, int q, String t, String a){
        Livro novol=new Livro(c,q,t,a);
        novol.prox=lista_l;
        lista_l=novol;
        //novol.qtd++;
    }


    boolean rmvEmp(int c, int q, String t, String a){
        
        //função que vai mostra que houve emp. de um título
        //remove o livro da lista
        if(q!=1){
            System.err.println("Não foi possível remover o livro\n");
            return false;
        }
        
        Livro livro2Rmv=new Livro(c, q, t, a);
        Livro ant=null;

        while(livro2Rmv!=null){
            if(livro2Rmv.titulo.equals(t) && 
            livro2Rmv.cod==c && livro2Rmv.equals(a)){
                if(ant==null){
                    //como inserir o início da lista aqui?
                }
            }
        }
    }


    void InsListadeAlunos(String n, int m){
        Usuario novou=new Usuario(n, m);
        novou.prox=lista_u;
        lista_u=novou;
        //novou.qtd++;
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


    void exibir(){
        Livro at=lista_l;

        System.out.println("CATÁLOGO DE LIVROS\n");
        System.out.println("LEGENDA: S/E='SEM EMPRÉSTIMO\n"+
        "C/E='COM EMPRÉSTIMO ATIVO'\n");

        while(at!=null){ //ver que alteração deve ser feita em at!
            System.out.println("' "+at.titulo+" '"+" por "+at.autor);
           
           
           if(at.qtd>0){
            System.out.println(" ::: DISPONÍVEL (S/E)\n");
            System.out.println(" ::: Há alguns livros que não foram emprestados.\n");

           }else{
            System.out.println(" ::: C/E");
           }
             at=at.prox;
          //mostrar que livros foram emprestados
        }
          System.out.println();
    }


    boolean realizarEmp(String n, int mat, int cod){
        Usuario uEmp=new Usuario(n, mat);
        Livro lEmp=new Livro(cod); //ajustar para receber só o código

        if(uEmp==null || lEmp==null){
            System.err.println("Usuário/Código não informado(s)\n");
            return false;
        }

        boolean empEfetivado=lEmp.regDev;

        if(empEfetivado){
            Emprestimo novoEmp=new Emprestimo(uEmp, lEmp);
            return true;
        }

        return false;
    }

}