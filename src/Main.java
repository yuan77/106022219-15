import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int h1,m1,h2,m2;
        int diff,money;
        h1=in.nextInt();
        m1=in.nextInt();
        h2=in.nextInt();
        m2=in.nextInt();
        diff=(h2-h1)*60+m2-m1;
        if(diff<=120)
            money=30*(diff/30);
        else if(diff<=240)
        {
            diff = diff - 120;
            money = 120 + 40 * (diff / 30);
        }
        else
            {
            diff = diff - 240;
            money = 120 + 160 + 60 * (diff / 30);
        }
        System.out.println(money);
        }
    }
