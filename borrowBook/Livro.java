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

    boolean devolver(){ 
        this.qtd++;
        System.out.println("Devolução realizada: "+this.titulo);
        return regDev=true;
    }

    boolean posRealizarEmp(){
         //mostra se o livro saiu com emprestimo realizado
        //colocado como para Emprestimo, mas ta aqui 
        if(this.qtd>0){ 
            this.qtd--; 
            System.out.println("Empréstimo realizado.\n"); 
            return regDev=true;
        }
        else{
            System.out.println("Livro não disponível\n");
            return regDev=false;
        }
    }   


}