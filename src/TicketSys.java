import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketSys {
    String[] ticketBox;//票箱
    String alreadGetTicket;//已经取得的票
    private int alreadGetNo;//已经取得的票号

    public String getAlreadGeTicket() {
        return alreadGetTicket;
    }

    public void setAlreadGeTicket(String alreadGeTicket) {
        this.alreadGetTicket = alreadGeTicket;
    }

    public int getAlreadGetNo() {
        return alreadGetNo;
    }

    public void setAlreadGetNo(int alreadGetNo) {
        this.alreadGetNo = alreadGetNo;
    }

    /**
     * 票务系统 初始化每一张票, 即为座位号
     * @param ticketNo 总计票号
     */
    public void TicketSys(int ticketNo) {
        ticketBox = new String[ticketNo];
        for (int i = 0; i < ticketNo; i++) {
            ticketBox[i] = "座位号" + (i + 1) + "的票";
        }
    }

    /**
     * 从票箱中取出票给售票员
     * @return
     */
    public String getTicketBox(List<Integer> ids) {
        for (int i = 0; i < ticketBox.length; i++) {
            try {
                Random r = new Random();
                int secs= r.nextInt(100);
                Thread.sleep(100*secs);//等待1s
            } catch (Exception e) {
            }
            if(ids.contains(i+1)){
                System.out.println(i+1+"号票已经售出了");
                continue;
            }
            if (ticketBox[i] != null) {//找到未被售出的票
                String t = ticketBox[i];//将被售出的票(上面有座位号)
                ticketBox[i] = null;
                TicketSys.this.setAlreadGeTicket(ticketBox[i]);
                TicketSys.this.setAlreadGetNo(i+1);
                try {
                    Thread.sleep(1000);//等待1s
                } catch (Exception e) {
                }
                return t;
            }
        }
        return null;
    }


}
