package com.kn.interface3;

public interface MyInterface {
   //Static variable   ------>Allowed
	  public static final int i=10;
//==================================================================================
   
	  
	 //Static block--.error---->not allowed
//	  static {
//		  System.out.println("Static block inside interface");
//	  }
//===================================================================================
	  
	 //Instance variable--error----->not allowed
	   // int j;
//====================================================================================
	  
	  //Abstract method--------->Allowed
	   public abstract void m1();
//=====================================================================================
	   
	   //Static method Allowed java 8 verson onwords---->Allowed
	     public static void m2() {
	    	 System.out.println("Static method frome interface");
	     }
//===================================================================================
	     
	   //instance method---error------->not allowed
//	     public void m3() {
//	    	 System.out.println("Instance method frome interface");
//	     }
//===================================================================================
	     
	   //Constractor----error---->not allowed
//	     public MyInterface() {
//	    	 System.out.println("constractor method frome interface");
//	     }
//==================================================================================
	     
	     //Instance block----error---->not allowed
//	     {
//	    	 System.out.println("instance block frome interface");
//	     }
//==================================================================================
	     
	     //main method---->allowed
	     public static void main(String[] args) {
	    	 System.out.println("main() method frome interface");
		}
//==================================================================================
	     
	     
	     //final method-----error--------->not allowed
//	     public static final void m4() {
//	    	 System.out.println("final method frome interface");
//	     }
//==================================================================================
	     
	     //privet method java varsion 9 onwards its allowed
	     private void m5() {
	    	 System.out.println("private method frome interface");
	     }
//==================================================================================
	     
	     //defoult method allowed java varsion 8 onwards
	     public default void m6() {
	    	 System.out.println("Default method frome interface");
	     }
}
