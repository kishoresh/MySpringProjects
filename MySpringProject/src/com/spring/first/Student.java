package com.spring.first;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
    private Integer id;    
    private Address add;    
    private List<String> books;    //List with simple String objects    
    private List<Class> classes;   //List with Class objects. Student can have multiple classes linked.
    private Map<String, Integer> examMarks;          //Subject=Marks
    
    public Student() {
    	System.out.println("Construtor without parametres");
    	// TODO Auto-generated constructor stub
	}
    
    public Student(int id, String name, Address ad, List books, List classs, Map<String, Integer> marks) {
		System.out.println("Construtor with all the parameters is called..");
    	this.id = id;
		this.name = name;		
		this.add = ad;
		this.books = books;
		this.classes = classs;
		this.examMarks = marks;
	}
    
    public void show(){    //used for Constructor setter injection demo
    	System.out.println("Hello " + name + " Your ID="+ getId() +".   My first spring - Testing Constructor Injection.");
    	System.out.println("Äddress : " + add.toString());
    	Iterator<String> itr = books.iterator();    //For Books
    	while (itr.hasNext())
    		System.out.println("Book : " + itr.next());
    	
    	Iterator<Class> itr2 = classes.iterator();   //For Classes
    	while(itr2.hasNext())
    		System.out.println("Class Details : " + itr2.next());
    	
//    	Iterator<Map.Entry<String, Integer>> itr3 = examMarks.entrySet().iterator();
//    	while(itr3.hasNext()){
//    		Map.Entry<String, Integer> e = itr3.next();
//    		System.out.println(e.getKey() + " = " + e.getValue());
//    	}                  //2nd way to traverse a Map
    	
    	System.out.println("Exam Marks of this student :");
    	for (Map.Entry<String, Integer> me : examMarks.entrySet()){
    		String str = String.format("%s = %d", me.getKey(), me.getValue());
    		System.out.println(str);
    	}
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//System.out.println("Setter name.");
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public List<Class> getclasses() {
		return classes;
	}

	public void setclasses(List<Class> classes) {
		this.classes = classes;
	}

	public void displayInfo(){
		System.out.println("Hello " + name + " Your ID="+ getId() +" My first spring.");
		System.out.println("Äddress : " + add.toString());
	    Iterator<String> itr = books.iterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());	
	    
	    System.out.println("Class details :");
	    Class cl;
	    Iterator<Class> itrClass = classes.iterator();
	    while (itrClass.hasNext()){
	    	cl = itrClass.next();
	    	System.out.println(cl.getTeacher());
	    	//System.out.println(itrClass.next());    //this calls .toString of the object.
	    }
	    
	    System.out.println("Exam Marks of this student :");
	    for(Map.Entry<String, Integer> me : examMarks.entrySet()){
	    	String str = String.format("%s = %d", me.getKey(), me.getValue());
	    	System.out.println(str);
	    }
	}

	public Map<String, Integer> getExamMarks() {
		return examMarks;
	}

	public void setExamMarks(Map<String, Integer> examMarks) {
		this.examMarks = examMarks;
	}

}
