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
        Livro at;
        while(at!=null){ //ver que alteração deve ser feita em at!
            System.out.println(at.titulo+"-->");
            at=at.prox; //mostrar que livros foram emprestados
        }
        System.out.println();

        if(var.empAtivo==true){
            //impl: mostra a lista com o nome do usuário associado
        }else{
            //o livro não emprestado deve vir com 'S/E'
            // S/E -> sem empréstimo atual
        }
    }



}