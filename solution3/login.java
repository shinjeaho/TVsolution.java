package solution3;

import java.sql.SQLException;
import java.util.Scanner;

public class login
{

    Scanner scan = new Scanner(System.in);
    //---------------------------------------------------
public void cheak()
{
    boolean cheak = true;

    while(cheak)
    {
        System.out.printf("ID입력 : ");
        String ID = scan.nextLine();
        System.out.printf("Password 입력 :");
        String Password = scan.nextLine();
        if (ID.equals("admin"))
        {
            if (Password.equals("1234"))
            {
                System.out.println("로그인 성공");
                break;
            } else
            {
                System.out.println("Password를 확인하세요");
            }
        } else
        {
            System.out.println("ID를 확인하세요");
        }
    }
}
}
