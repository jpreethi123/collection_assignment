package com.vnrvjiet.Preethi.collection_assignment; 
import java.util.ArrayList; 
import java.util.*;
class CustomArrayList 
{   
	static ArrayList<Data> list=new ArrayList<Data>(); 
	class Data 
	{ 
		int num;  
		Data(int num) 
		{ 
			this.num = num; 
		} 
	} 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		CustomArrayList custom = new CustomArrayList(); 
		int Selection=0;
		while(Selection==0)
		{
			System.out.println("choose option");
			System.out.println("1.add 2.remove 3.print");
			int Option=sc.nextInt();
			if(!(Option>=1 && Option<=3))
				System.out.println("Entered wrong option");
			else
			{
				switch(Option)
				{
				case 1:System.out.println("enter number you want to add");
				int num=sc.nextInt();
				custom.addValues(num);
				System.out.println("Element added");
				break;
				case 2:System.out.println("enter index of the element you want to remove");
				int num1=sc.nextInt();
				custom.removeValues(num1);
				break;
				case 3:printValues(list);
				break;
				}
			}
			System.out.println("To continue press 0");
			Selection=sc.nextInt();
			
		}
	} 
	public void addValues(int num) 
	{ 
 	list.add(new Data(num));  
	} 

	public static void printValues(ArrayList<Data> list)
	{ 
		System.out.println("elements in list are:");
		int s=list.size();
		for (int i = 0; i <s ; i++) 
		{ 
			Data data = list.get(i); 	
			System.out.println(data.num); 
		} 
	} 
	public void removeValues(int num)
	{
		if(list.size()==0)
			System.out.println("list size is 0...can't remove");
		else if(num>list.size())
			System.out.println("can't remove element check the index");
		else
		{
			list.remove(num);
			System.out.println("Element removed");
		}		
	}
} 

