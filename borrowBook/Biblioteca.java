class Biblioteca{
    Livro ini;
    Livro prox;
    //int totalAcervo;
    int totalAlunosB; //total de alunos com emp.
    //Livro[] acv; //acervo de livros
    Usuario lista_u;
    Livro lista_l;
    Emprestimo var;
    
    void InsListadeLivros(int c, int q, String t, String a){
        Livro novo=new Livro(c,q,t,a);
        novo.prox=ini;
        ini=novo;
    }

    void exibir(){
        Livro at=ini;
        while(at!=null){
            System.out.println(at.titulo+"-->");
            at=at.prox; //mostrar que livros foram emprestados
        }
        System.out.println();

        if(var.emp==true){
            //impl: mostra a lista com o nome do usuário associado
        }else{
            //o livro não emprestado deve vir com 'S/E'
            // S/E -> sem empréstimo atual
        }
    }



}