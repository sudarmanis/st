import java.util.*;
class clp
{
public static void main(String argS[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
a=sc.nextInt();
 if((a%400==0)||(a%4==0))
{
System.out.println("leap year");
}
else{
System.out.println("not leap year");
}
}}
