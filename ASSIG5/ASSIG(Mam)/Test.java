package org.example.demo4;


class Animal {
	String name;
	
	public Animal(String name) {
		this.name=name;
		
	}
	public void eat() {
	//	System.out.println("Dog eat  roti and biscuits");
	}
	public void sleep() {
	//	System.out.println("Dog sleep ");
	}
}
class Dog extends Animal{
	              
	   public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		   super.eat();
		   System.out.println("Dog eat a Bicuits ");
	   }
	   public  void sleep() {
		   super.sleep();
		   System.out.println("Dog has a sleep well ");
	   }
		
		public void bark() {
			System.out.println("The dog was Barking Bow -Bow");
		}
}
class Test{
   public static void main(String[] args) {
			 Dog d = new Dog("puppy");
			 d.eat();
			 d.sleep();
			 d.bark();
			
		}
}

	

	