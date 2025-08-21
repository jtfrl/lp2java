class ContaBanc{
    String nome; //
	double saldo;
    int conta;

    ContaBanc(String n, double v, int c){ 
        this.nome=n; 
        this.saldo=v; //caso não houvesse, seria null
        this.conta=c;
        if(v<1){
            throw new RuntimeException("Valor não pode ser menor que 1\n");
        }
	}

}