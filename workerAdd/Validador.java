/*
Além disso, a classe utilitária Validador 
terá um método estático para validar
 o salário do novo funcionário e retorna
  true se válido e false se < 0.



*/

public class Validador{

    public static boolean isValid(double val){
        boolean verify=false;
        if(val<0.00 || val>5000.50){
            return verify;
        }else{
            verify=true;
        }
        return verify;
    }
    
}