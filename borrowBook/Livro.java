class Livro{
    int cod, qtd;
    String titulo, autor;
    Livro prox;
    Livro ini;

    Livro(int c, int q, String t, String a){
        this.cod=c;
        this.qtd=q;
        this.titulo=t;
        this.autor=a;
        this.prox=null;
        this.ini=null;
    }


    //classes a seguir devem ir para Biblioteca (nova classe)

    void InsListadeLivros(int c, int q, String t, String a){
        Livro novo=new Livro(c,q,t,a);
        novo.prox=ini;
        ini=novo;
    }

    void exibir(){
        Livro at=ini;
        while(at!=null){
            System.out.println(at.titulo+"-->");
            at=at.prox;
        }
        System.out.println();
    }


}
