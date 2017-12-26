package com.scp.basicOOP;

import java.io.Serializable;
import java.util.Comparator;

public class GetData implements Serializable
{
	private String name;
	private int age;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public GetData(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public GetData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GetData [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	Comparator<GetData> comparebyId= new Comparator<GetData>() 
	{
 		@Override
		public int compare(GetData o1, GetData o2)
		{
		
			return o1.getAge()-o2.getAge();
		}
	};
	
	
	
}
