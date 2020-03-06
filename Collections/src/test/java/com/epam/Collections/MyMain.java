package com.epam.Collections;
import java.util.Scanner;

public class MyMain {
	public static void main(String[] args) {
		MyList<Integer> list=new MyList<Integer>();
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println("The elements in list are:");
        list.print();
	
	while(true)
	{
		System.out.println("\nFor any changes:");
		System.out.println("Enter :\n 1 -> Add Element\n 2 -> getElement\n 3 -> removeElement ");
	System.out.println("Enter 1 or 2 or 3:");
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	switch(num)
		{
		case 1:
			System.out.println("Enter the number of elements:");
			int number=sc.nextInt();
			System.out.println("Enter the elements:");
			for(int i=0;i<number;i++)
			{
			int num1=sc.nextInt();
			list.add(num1);
			System.out.println("After Addition");
		     list.print();
		     System.out.println( );
			}
		     break;
		case 2:
			System.out.println("Enter the index to get element");
			int i=sc.nextInt();
			Object o=list.get(i);
			System.out.println("The element is: " +o);
			System.out.println( );
			break;
		case 3:
			System.out.println("Enter index  to remove element :");
			int num2=sc.nextInt();
			list.remove(num2);
			System.out.println();
			System.out.println("Elements afer removing:");
			list.print();
			System.out.println( );
			break;
		default:
			System.out.println("Wrong number");
		}
	}
}
}

	


	
	
	


