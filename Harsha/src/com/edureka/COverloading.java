package com.edureka;

public class COverloading {
	COverloading(){
		System.out.print("unparametrized constructor");
	}
	COverloading(int x){
		System.out.print("\nparametrized constructor");
	}
	public static void main(String[] args) {
		COverloading co=new COverloading();
		COverloading co1=new COverloading(5);
	}
}
