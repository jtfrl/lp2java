import java.util.Date;

public class timeCar{
    private Date enter;
    private Date leave;


    public timeCar(){
        this.enter=new Date(); //momento atual
        this.leave=null;
    }

    /* TEMPO INICIAL PRE-DEFINIDO
    public ParkingTime(Date customTime) {
        this.entryTime = customTime;
        this.exitTime = null;
    }
    >>>opicional<<<
    */

   public void setexit(){
    this.leave=new Date();
   }

   public void setexit(Date uDate){
    this.leave=uDate;
   }

   public Date seeEnter(){
    return enter;
   }

   public Date seeLeave(){
    return leave;
   }


   public long getDuration(){
    if(leave==null){
        return (new Date().getTime() - enter.getTime())/(60*1000);
    }
    //o primeiro se baseia no momento atual de entrada

    return (leave.getTime()-enter.getTime())/(60*1000);
   }


    @Override
    public String toString(){
        return "Entrada: "+enter+(enter!= null ? ", Saída: "+
        leave: ", Ainda no estacionamento");
    }
    
}