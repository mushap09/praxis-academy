package LatihanAnnotation;

class Derived extends Base
{
     @Override
     public void display()
     {
         System.out.println("Derived display(int )");
     }
     public static void main(String args[])
     {
         Derived obj = new Derived();
         obj.display();
     }
}