package solution3;


public class TVmain
{
    public static void main(String[] args)
    {
        Kim Kim = new Kim();
        Lee Lee = new Lee();
        Shin Shin = new Shin();
       login login = new login();

        login.cheak();
        Kim.SelectChannel();
        Kim.favorite();
        System.out.println("---------------------------");
        Lee.SelectChannel();
        Lee.favorite();
        System.out.println("---------------------------");
        Shin.SelectChannel();
        Shin.favorite();



    }
}
