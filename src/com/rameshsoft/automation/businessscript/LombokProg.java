package com.rameshsoft.automation.businessscript;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
public class LombokProg {

	@Setter @Getter private int practiceHrs;
	@Setter @Getter private double sal;
	@Setter @Getter private float hike;
	@Setter @Getter private String res;
	@Setter @Getter private static String sub;
	

//	public int getPracticeHrs() {
//		return practiceHrs;
//	}
//
//
//	public void setPracticeHrs(int practiceHrs) {
//		this.practiceHrs = practiceHrs;
//	}
//
//
//	public double getSal() {
//		return sal;
//	}
//
//
//	public void setSal(double sal) {
//		this.sal = sal;
//	}
//
//
//	public float getHike() {
//		return hike;
//	}
//
//
//	public void setHike(float hike) {
//		this.hike = hike;
//	}
//
//
//	public String getRes() {
//		return res;
//	}
//
//
//	public void setRes(String res) {
//		this.res = res;
//	}


	public static void main(String[] args) {
		
		LombokProg prog=new LombokProg();
		prog.setHike(1200);
		prog.setPracticeHrs(9);
		prog.setRes("job");
		prog.setSal(14500);
		prog.setSub("job");
		
		System.out.println(prog.getHike());
		System.out.println(prog.getPracticeHrs());
		System.out.println(prog.getRes());
		System.out.println(prog.getSal());
		System.out.println(prog.getSub());
	}
	
	

}
