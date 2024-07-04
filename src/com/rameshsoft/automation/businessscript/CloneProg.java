package com.rameshsoft.automation.businessscript;

public class CloneProg implements Cloneable{

	//String str=new String("java");
	int practiceHrs;
	String res;
	public void hardwork() {
		System.out.println(practiceHrs+"***"+res);

	}
	public static void main(String[] args) throws CloneNotSupportedException {
	CloneProg prog= new CloneProg();
	
	Object obj=prog.clone();
	CloneProg clone=(CloneProg) obj;
	clone.practiceHrs=9;
	clone.res="job";
	prog.hardwork();
	clone.hardwork();
	System.out.println(prog.hashCode());
	System.out.println(clone.hashCode());
	
	
}
}
