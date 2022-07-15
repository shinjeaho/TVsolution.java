package solution3;

public class Lee extends prologue
{
    String Name = "Lee";
    prologue pro = new prologue();

    public void SelectChannel()
    {
        System.out.println("Lee의 채널입력");
        pro.channels(Name);
    }

    public void favorite()
    {
        pro.favoriteCH(Name);
    }
}
