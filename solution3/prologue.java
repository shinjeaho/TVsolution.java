package solution3;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public  class prologue
{
    int[] manychanel = {0,0,0,0};                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
    String Name = "";
    int tenNumber = 0;
    int twoNumber = 0;
    int threeNumber = 0;
    int fourNumber = 0;
    private int channel;
    Scanner Scan = new Scanner(System.in);
    ArrayList<Integer> history = new ArrayList<>();
               
    public void channels(String Name)
    {
        boolean check = true;
        int count = 0;
        while (check)
        {
            System.out.println("????????? ????????? ?????????.");
            int channels = Scan.nextInt();
            history.add(setChannel(channels));
            count++;
            if (count >= 5)
            {
                System.out.println("---------------------------------");
                System.out.println(Name+"??? ?????? ??????");
                System.out.println(history);
                System.out.println("---------------------------------");
                count = 0;
                check = false;
                break;
            }
        }
    }

    public int setChannel(int channels){

        if ( channels <15 ) {
            this.channel = 10;
            manychanel[0] += 1;
            System.out.println(this.channel+" ??? ????????? ???????????????.");
        } else if ( 15 <= channels && channels <23) {
            this.channel = 20;
            manychanel[1] += 1;
            System.out.println(this.channel+" ??? ????????? ???????????????.");
        } else if ( 23 <= channels && channels <80) {
            this.channel = 25;
            manychanel[2] += 1;
            System.out.println(this.channel+" ??? ????????? ???????????????.");
        } else if ( 80 <= channels && channels <150) {
            this.channel = 120;
            manychanel[3] += 1;
            System.out.println(this.channel+" ??? ????????? ???????????????.");
        } else {
            this.channel = 120;
            manychanel[3] += 1;
            System.out.println(this.channel+" ??? ????????? ???????????????.");
        }
        return (this.channel);
    }

    public void favoriteCH(String Name)
    {
        int Max = manychanel[0];
        for(int i = 0; i < manychanel.length; i++)
        {
            if(Max < manychanel[i])
            {
                Max = manychanel[i];
            }
        }

        if(Max == manychanel[0])
        {
            System.out.println(Name+"??? ?????? ???????????? ????????? 10??? ?????????.");
        }
        else if(Max == manychanel[1])
        {
            System.out.println(Name+"??? ?????? ???????????? ????????? 20??? ?????????.");
        }
        else if(Max == manychanel[2])
        {
            System.out.println(Name+"??? ?????? ???????????? ????????? 25??? ?????????.");
        }
        else if(Max == manychanel[3])
        {
            System.out.println(Name+"??? ?????? ???????????? ????????? 120??? ?????????.");
        }
        else {
            System.out.println("???????????? ????????? ????????????.");
        }
    }
}
