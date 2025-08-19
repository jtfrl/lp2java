class Usuario{
    String nome;
    int mat; //matricula

    Usuario(String n, int m){
        this.nome=n;
        this.mat=m;
    }

    void cadastrarUs(String n, int m){
        //busca na base para ver se o usuário já está lá

    }

    void exibirUs(){
        //basear na impl feita para Biblioteca
    }

    void verNomeMat(Usuario u){
        System.out.println("USUÁRIO: "+u.nome+"\t | MATRÍCULA: "+u.mat);
    }

    void verMat(Usuario u){
        System.out.println("MATRÍCULA: "+u.mat);
    }

}