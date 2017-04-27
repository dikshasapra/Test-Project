package com.test.learn.mySmallLearnings;
public class Learning1 {
   int a;
   static int b;
   String c;
	
   
   
   public void add(){
		a=5;
		b=6;
	}
   
   
   public static void main(String[] args) {
		Learning1 t= new Learning1();
		t.a= 2;
		b=3;
//		c="3";
		
//learning 1: Inside Static block you can only use static variable
		// or non-static variable via object only
		// you cannot refer non static variable directly as above c
	}

}
