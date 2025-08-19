class main{
    public static void main(String[] args) {
        personagem p01=new personagem();
        habilidade h01=new habilidade();

        h01.nome="Hab. 01";

        p01.atualizarNome("Teste");

        p01.habilidade[0]=h01;


    }
}