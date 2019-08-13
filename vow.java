import java.util.*;
class vow
{
public static void main(String argS[])
{
char a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the char");
a=sc.next().charAt(0);
if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
{
System.out.println("vowel");
}
else if((a>='a')&&(a<='z'))
{
System.out.println("cononant");
}
else{
System.out.println("invalid");
}
}}
