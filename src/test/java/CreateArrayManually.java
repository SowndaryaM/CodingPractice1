import java.util.*;

public class CreateArrayManually {
	
	int size;
	int[] arr;
	int top;
	
	CreateArrayManually(int size)
	{
		
		this.size=size;
		this.arr=new int[size];//we should provide the size or else it will give error
		this.top=-1;
		
	}
	
	//time complexity is O(1)
	public boolean isEmpty()
	{
		
		return(top == -1);
//		if(top == -1)
//		{
//			System.out.println("the size of the array is zero");
//		}
		
	}
	
	public boolean isFull()
	{//i need to check just full or not so checking true or false
		return(size-1 == top);
		
	}
	
	public int Peek()
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public void push(int element )
	{
		if(!isFull())
		{
			top++;
			arr[top] = element;
			System.out.println("pushed element: "+ element);
		}
		
		else
		{
			System.out.println("stack is full now");
		}
	}
	
	public int pop()
	{
	 
		if(!isEmpty())
		{
			int returnedtop = top;
			top--;
			System.out.println("poped element: "+arr[returnedtop]);
			return arr[returnedtop];
		}
		
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	

	public static void main(String[] args) {
		CreateArrayManually stack = new CreateArrayManually(10);
		stack.pop();
		
		System.out.println("********************");

		
		stack.isEmpty();
	    System.out.println(stack.isEmpty());
	    
		System.out.println("********************");

	    
		stack.isFull();
		System.out.println(stack.isFull());
		
		System.out.println("********************");
		
		stack.push(200);
		stack.push(300);
		stack.push(700);
		stack.push(500);
		stack.push(7);
		
		System.out.println("********************");

		stack.pop();//LIFO
		stack.pop();//LAST 2ND ELEMENT WILL BE REMOVED
		
		System.out.println("********************");

		System.out.println(stack.Peek());
		
		
		
	}

}
