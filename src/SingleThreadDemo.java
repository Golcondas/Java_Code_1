
public class SingleThreadDemo {
    public static void  main(String[] args)
    {
        GreedyBoy boy=new GreedyBoy("xxxxxx");
        GreedyBoy b2 = new GreedyBoy("晓明");
        GreedyBoy b3 = new GreedyBoy("小龙人");

        boy.hasFood();
        b2.hasFood();
        b3.hasFood();
    }
}

class GreedyBoy {
    String name;
    public GreedyBoy(String name){
        this.name=name;
    }

    public  void  hasFood() {
        for (int i=0;i<3;i++){
            System.out.println(name+"第"+(i+1)+"次取食....");
            try{
                Thread.sleep((1000));
            }catch(Exception ex) {

            }
        }
        System.out.println(name+"吃完了。");
    }
}