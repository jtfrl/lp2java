//Programa 1 - aula 13-14
import java.time.LocalDate;

public class Produto{
    String nome;
    Double preco;

    Produto(){}

    Produto(String nome, Double preco){
        this.nome=nome;
        this.preco=preco;
    }
}

public class ProdLimp extends Produto{
    //criar enum com tipoUso: 
    /*
     * doméstico, hospitalar ou industrial.
     */
}

public class ProdAlmt extends Produto{ //alimentício
    Datetime val;
    //metodos aqui
}

public class ProdElt extends Produto{
    Double wVolt;
    Datetime garantia;

    //metodos
}

/*
 * DEMAIS REQUISITOS
 * 
 * 
 * Permitir o usuário inserir 
 * cada tipo de produto e o 
 * sistema deve manter a lista 
 * de produtos cadastrados.

Ao selecionar a opção de 
exibir produtos, deve ser 
exibidos os dados da classe 
produto (via método
 da classe Pai)
 * 
 * 
 * 
 * 
 */