class Usuario{
    String nome;
    Int mat; //matricula

    Usuario(String n, int m){
        this.nome=n;
        this.mat=m;
    }

    void verNomeMat(){
        System.out.println("USUÁRIO: "+nome+"\t | MATRÍCULA: "+mat);
    }

}