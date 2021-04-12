package com.edureka;

public class NoInvoke {
	NoInvoke(){
		this("Annie");
		System.out.println("invokes automatically");
	}
	NoInvoke(String name){
		System.out.println(name);
	}

	public static void main(String[] args) {
		NoInvoke h= new NoInvoke();
		
	}
}
