public class Emp{
    private UsBib uEmp;
    protected LivroBib lBib;
    protected Boolean EmpStatus;
    
    Emp(UsBib ue, LivroBib lb){
        this.uEmp=ue;
        this.lBib=lb;
        EmpStatus=lBib.posRealizarEmp();
    }

    void devolver(){
        if(this.EmpStatus){
            this.EmpStatus=false; //indica que não está em empréstimo
            this.lBib.devolver();
            System.out.print("Livro devolvido: "+this.lBib.titulo);
        }
    }
}