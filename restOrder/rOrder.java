public enum rOrder{
    PENDENTE(1),
    PREPARANDO(2),
    PRONTO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private final int r;


    private rOrder(int r){
        this.r=r;
    }

    //uso em changeinfo()
    public int getR(){
        return r;
    }

    
}