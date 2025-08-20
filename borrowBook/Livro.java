class Livro{
    int cod, qtd;
    String titulo, autor;
    Boolean regDev; //registro de devolução
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

    Boolean realizarEmp(Livro l){
         //impl: mostrar que o livro saiu do acervo
        //metodo para adicionar na lista   
        if(this.qtd>0){ this.qtd--; return regDev=true;}
        else{
            System.out.println("Livro não disponível\n");
            return regDev=false;
        }
    }   


}