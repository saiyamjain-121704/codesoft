import java.util.Scanner;
// Author : Saiyam jain
// Date : 30/07/25
// Time of completion : 18:57
class studentinfo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of maths");
        int maths=sc.nextInt();
        System.out.println("enter the marks of physics");
        int phy=sc.nextInt();
        System.out.println("enter the marks of chemistry");
        int che=sc.nextInt();
        float percentage_student=((maths+phy+che)*100)/300;
        char ch='X';// initiallay the grade have not been assigned; therefore ch=X
        if(percentage_student>=95 && percentage_student<=100)
        {
            ch='A';
        }
        else if(percentage_student>=90 && percentage_student<95)
        {
            ch='B';
        }
        else if(percentage_student>=85 && percentage_student<90)
        {
            ch='C';
        }
        else if(percentage_student>=80 && percentage_student<85)
        {
            ch='D';
        }
        else if (percentage_student>=75 && percentage_student<80)
        {
            ch='E';
        }
         else if(percentage_student>=35 && percentage_student<75){
            ch='F';
         }
         else{
            System.out.println("you are failed ");
        
         }
         System.out.println(" Your percentage is "+percentage_student); 
         System.out.println(" your Grade is "+ch);  
        }
    }
        