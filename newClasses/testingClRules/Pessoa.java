class Pessoa{
	String nome;
	int idade;
	String EstadoCivil;

	
	Pessoa(){} //padrão

	Pessoa(String n){
		this(n, 0); //por padrão, idade assume zero
	}

	Pessoa(String n, int i, String eCivil){ 
		this.nome=n; 
		this.idade=i; //caso não houvesse, seria null
		this.EstadoCivil=eCivil;
	}

	Pessoa(String n, int i){
		this(n, i, "Não informado");
	}
}