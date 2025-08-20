class Emprestimo{
    /*
    INSTRUÇÕES DA ATIVIDADE
    A classe Emprestimo deve representar a ação de um usuário pegando um livro emprestado, 
    com atributos que referenciam o livro e o usuário envolvidos no empréstimo, e 
    métodos para realizar o empréstimo (marcando o 
    livro como indisponível) e para devolver o livro 
    (marcando-o novamente como disponível).


    */
   Usuario u_emp;
   Livro l_emp;
   Boolean empAtivo;

    Emprestimo(Usuario uemp, Livro lemp){
       this.u_emp=uemp;
       this.l_emp=lemp;
       empAtivo=true;

       //!!!função para indicar que o livro não está disponível
       //l_emp.realizarEmp(uemp.mat, lemp.cod);
    }

    void downEmp(){
        if(empAtivo){
            // impl: o acervo da biblioteca deve diminuir
        }

        // talvez seja útil ver totalAcervo aqui
    }

    void upEmp(){
        // impl: função que vai fazer o oposto de
        // downEmp
    }

    void devolver(){
        this.empAtivo=false;
        //ver como chamar devolver aqui
    }

   
}