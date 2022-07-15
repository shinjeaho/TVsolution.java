package solution3;

public class Kim extends prologue
{
    String Name = "Kim";
    prologue pro = new prologue();

    public void SelectChannel()
    {
        System.out.println("Kim의 채널입력");
        pro.channels(Name);
    }

    public void favorite()
    {
        pro.favoriteCH(Name);
    }
}
