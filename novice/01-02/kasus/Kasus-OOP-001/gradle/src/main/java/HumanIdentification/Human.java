package HumanIdentification;


public class Human {

	public String name ;
	public int age ;
	public int heightInInch;
	public String eyeColor;

public void speak () {
	System.out.println("Hello, My name is" + name);
	System.out.println("I am " + heightInInch + "inch tall");
	System.out.println("I am " + age + "year old");
	System.out.println("my eye color is " + eyeColor);

    }


public void eat (){
	 System.out.println("eating");
}

public void drink (){
	 System.out.println("dringking");
}

public void cook (){
	 System.out.println("cooking");
}

}