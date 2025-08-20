class Usuario{
    String nome;
    int mat; //matricula
    Usuario prox;

    Usuario(String n, int m){
        this.nome=n;
        this.mat=m;
        this.prox=null;
    }

    void verNomeMat(Usuario u){
        System.out.println("USUÁRIO: "+u.nome+"\t | MATRÍCULA: "+u.mat);
    }

    void verMat(Usuario u){
        System.out.println("MATRÍCULA: "+u.mat);
    }

}