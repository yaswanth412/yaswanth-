

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
Student1 st1  = new Student1();
  st1.setName("Yagneswar");
  st1.setRoll(2155);
  st1.setDept("ECE");
  Student1 st2 = new Student1();
  st2.setName("PAVAN SAI");
  st2.setRoll(2156);
  st2.setDept("ECE");
  Student1 st3 = new Student1();
  st3.setName("nithin");
  st3.setRoll(2157);
  st3.setDept("ECE");
  ArrayList<Student1>list = new ArrayList<>();
  list.add(st1);
  list.add(st2);
  list.add(st3);
  System.out.println(list);
	}

}
class Student1{
	private String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	private int roll;
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int  getRoll() {
		return roll;
	}
	private String dept;
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return name+" "+roll+" "+dept;
	}
}