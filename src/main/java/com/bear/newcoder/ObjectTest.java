package com.bear.newcoder;

public class ObjectTest {
	public static void main(String[] args) {
		User aUser=new User("1",1);
		User bUser=new User("2", 2);
		operater(aUser, bUser);
		System.out.println(aUser.getAge());
		System.out.println(bUser.getAge());
	}
	public static void operater(User aUser,User bUser) {
		aUser.setAge(6);
		System.out.println("operater:"+aUser);
		bUser.setAge(8);
		System.out.println("operater:"+bUser);
	}
}

class User{
	private String name;
	private int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
