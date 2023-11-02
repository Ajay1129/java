class reverse_number
{
public static void main(String arg[])
{
         
      num obj=new num(); 
      obj.number1();



}
}
class num
{
int num1=579;
  
public void number1()
{
      int rem,rev=0;
        while(num1!=0)
       {
           rem=num1%10;
           rev=rev*10+rem;
           num1=num1/10;
          }
         System.out.println(rev);
}
}

 