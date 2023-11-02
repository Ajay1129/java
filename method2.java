class method2
{
public static void main(String arg[])
{         
      num obj=new num(); 
      obj.number2(int a);
}
}
class num
{  
public void number2()
{
         int num1=2
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
   