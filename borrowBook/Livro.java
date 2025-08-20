class Livro{
    int cod, qtd;
    String titulo, autor;
    Boolean regDev;
    Livro prox;

    Livro(int c, int q, String t, String a){
        this.cod=c;
        this.qtd=q;
        this.titulo=t;
        this.autor=a;
        this.prox=null;
    }

    Boolean devolver(Livro l){ 
        //impl: mostrar que o livro voltou ao acervo
        this.qtd++;
        return regDev=true;


    }

    


}
