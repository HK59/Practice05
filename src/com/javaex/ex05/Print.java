package com.javaex.ex05;

public class Print {
	
	//field
	
	int number01;
	boolean status; 
	double number02;
	String name;
	
	//constructor 
	public Print(int number01, boolean status, double number02, String name) {
		super();
		this.number01 = number01;
		this.status = status;
		this.number02 = number02;
		this.name = name;}
	
	public Print() {
		super();
		
	}
	//getter-setter
	public int getNumber01() {
		return number01;
	}

	public void setNumber01(int number01) {
		this.number01 = number01;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getNumber02() {
		return number02;
	}

	public void setNumber02(double number02) {
		this.number02 = number02;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//method-general 
	 public void printer(int val){
	        System.out.println(val);
	    }
	 
	 public void printer(boolean status){
		 System.out.println(status);
	 }
	 
	 public void printer(double number02){
		 System.out.println(number02);
	 }
	 
	 public void printer(String name) {
		 System.out.println(name);
	 }

	@Override
	public String toString() {
		return "Print [number01=" + number01 + ", status=" + status + ", number02=" + number02 + ", name=" + name
				+ ", getNumber01()=" + getNumber01() + ", isStatus()=" + isStatus() + ", getNumber02()=" + getNumber02()
				+ ", getName()=" + getName() + "]";
	}
	
	
}
    

	
	
   