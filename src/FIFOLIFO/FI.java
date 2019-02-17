package FIFOLIFO;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
  
public class FI {
	static int i = 0;
	static int j=0;
	static int [] a = new int[10];
	//LIFO
	static void push(int n) {
		a[i]=n;
		i++;
	}
	static void pop() {
	i--;	
	}
	
	//FIFO
	/*static void push(int n) {
		a[i]=n;
		i++;
	}
	static void pop() {
	j++;
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(5);
		push(6);
		push(7);
		push(8);
		push(9);
		
		pop();
		
		//fifo
		for(int j =0;j<i;j++)
		System.out.println(a[j]);
		
		/*//lifo
		for (int k=j; k<i;k++)
			System.out.println(a[k]);*/
		
		
		
		/*	Stack s = new Stack();
		for(int i =1;i<=5;i++)
		s.push(i);
		
		s.pop();
		System.out.println(s); */
		
		
	/*Queue<Integer> s = new LinkedList<>();
	for(int i =1;i<5;i++)
		s.add(i);
		s.remove();
		System.out.println(s);*/
	}

}
