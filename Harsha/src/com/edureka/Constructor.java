package com.edureka;

class Constructor {
	String name;
	int marks;
	Constructor() 
	{
		this("meghan");	
	}
	Constructor(String name) {
		this(name,70);
	}
	Constructor(String name, int marks) {
		this.name=name;
		this.marks=marks;
	}
	void add(Constructor c) {
		System.out.println("happy......!");
	}
	void display() {
		System.out.println("Student name:" +name);
		System.out.println("Student marks:" +marks);
		add(this);
	}

	public static void main(String[] args) {
		Constructor can = new Constructor();
		can.display();
		
	}
}
