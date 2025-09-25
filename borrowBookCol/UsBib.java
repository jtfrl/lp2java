public class UsBib{
    String nome;
    Integer mat; //torna como Wrapper: agora consegue usar hash

    public UsBib(String nome, Integer mat) {
        this.nome=nome;
        this.mat=mat.hashCode();
    }

    void verNomeMat(UsBib u){
        System.out.println("USUÁRIO: "+u.nome+
        " \t | MATRÍCULA: "+u.mat);
    }
    
}