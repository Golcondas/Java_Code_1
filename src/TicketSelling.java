import java.util.ArrayList;
import java.util.List;

public class TicketSelling {
    /**
     * 票号
     */
    public static int ticketNo=5;
    public static List<Integer> id = new ArrayList<Integer>();
    public  static  void  main(String[] args){
        Seller seller1=new Seller("1号售票员");
        Seller seller2=new Seller("2号售票员");
        Seller seller3=new Seller("3号售票员");
        seller1.start();
        seller2.start();
        seller3.start();
    }
}
class  Seller extends Thread{
    String name;
    Seller(String name){
        this.name=name;
    }
    public  void  run(){
        TicketSys tSys=new TicketSys();
        tSys.TicketSys(TicketSelling.ticketNo);//

        System.out.println(name+"售出:"+tSys.getTicketBox(TicketSelling.id));
        int alreadyID=tSys.getAlreadGetNo();
        TicketSelling.id.add(alreadyID);
    }
}
