/**
 * cada funcionário recebe 
 * um ID único 
 * gerado automaticamente
 *  usando um atributo estático.
 * /
*/
public class wID{
    static int hID;

    public wID() {
        
    }

    public static int hashCode(){
        return hashCode(hID);
    }
    
}