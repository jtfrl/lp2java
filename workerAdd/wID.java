/**
 * cada funcionário recebe 
 * um ID único 
 * gerado automaticamente
 *  usando um atributo estático.
 * /
*/
public class wID{
    static int hID;

    public wID(int id) {
        this.hID=id;
        
    }

    public static int hashCodeID(wID idd){
        //int val=idd.hID;
        return idd.hashCode();
    }


}