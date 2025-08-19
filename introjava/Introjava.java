
class Introjava{
    public static void main(String args[]){
        System.out.println("Testando java\n");

        String[] v=new String [5];
        v[0]="+";

        String[] w={"*", "³", "Ö", "a", "Ø"};
        //não é possível algo como v={"a", "b"...};

        for(String letra:w){
            System.out.print(letra+" ");
        }
        System.out.print("\n\n\n");
       
     
        //outras implementações com vetor
        int[][]s= new int[3][];
        s[0]=new int[1];
        s[0][0]=5;

        s[1]=new int[3];
        s[1][0]=7;
        s[1][1]=1;

        s[2]=new int[1];
        s[2][0]=19;

       for(int i=0;i<s.length;i++){
         System.out.print("Row "+i+": \n");
            for(int j=0;j<s[i].length;j++){
                System.out.print(s[i][j]+" \n");
        }
       }

       
    }
}
