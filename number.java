
import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("generate a random number");
        int my_num=sc.nextInt();
        System.out.println("please enter your choice");
        int choice =sc.nextInt();
        while(my_num>0 && my_num<=100)
        {
        if(choice==my_num)
        {
            count++;
            System.out.println("you have guessed a right number");
        }
        else if(choice>my_num){
            if(choice>(my_num+40))
            {
                System.out.println("you have guessed much larger number");
            }
            else
            {
                System.out.println("your choice is closer");
            }
        }
        else if(choice<my_num)
        {
            if(choice<(my_num-40))
            {
              System.out.println("you have guessed much smaller number");
            }
            else{
                System.out.println("your choice is closer");
            }
        }
        else{
            if(choice>100)
            {
            System.out.println("guessed number is out of range");
        }
    }
    break;           
}
        System.out.Println("no. of attempts are"+count);
}
}
