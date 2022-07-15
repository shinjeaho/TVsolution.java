package solution3;

public class Shin extends prologue
{
    String Name = "Shin";
    prologue pro = new prologue();

    public void SelectChannel()
    {
        System.out.println("Shin의 채널입력");
        pro.channels(Name);
    }

    public void favorite()
    {
        pro.favoriteCH(Name);
    }
}
