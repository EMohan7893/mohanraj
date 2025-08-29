public class calculator
{
public int add(int a,int b)
  {
    return a+b;
  }
public int substract (int a,int b)
  {
    return a-b;
  }
public int multiply(int a,int b)
  {
    return a*b;
  }
public int divide(int a,int b)
  {
    if(b==0)
      throw new
Arithmetic Expection("cannot divide by zero")
        return a/b;
  }
public Static void main(String[]args)
{
calculator calc= new calculator();
System.out.println("Addition"+calc.add(10,5));
System.out.println("subtraction"+calc.substract(10,5));
System.out.println("multiplication:"+calc.multiply(10,5));
System.out.println("Division:"+calc.divide(10,5))




