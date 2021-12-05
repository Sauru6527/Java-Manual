class MyNumber
{
	private int num;
	
	MyNumber()
	{
		num = 0;
	}
	
	MyNumber(int num)
	{
		this.num = num;
	}
	
	boolean isnegative()
	{
		if(num<0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean ispositive()
	{
		if(num>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	boolean iszero()
	{
		if(num==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	boolean isodd()
	{
		if(num%2==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);                //you can take here no also
		boolean ret;
		
		MyNumber obj = new MyNumber(num);                   //you can take here no also
		
		ret = obj.ispositive();
		if(ret==true)
		{
			System.out.println("NUMBER IS POSITIVE");
		}
		
		ret = obj.isnegative();
		if(ret==true)
		{
			System.out.println("NUMBER IS NEGATIVE");
		}
		
		ret = obj.isodd();
		if(ret == true)
		{
			System.out.println("NUMBER IS ODD");
		}
		
		ret = obj.iszero();
		if(ret == true)
		{
			System.out.println("NUMBER IS ZER0 ");
		}
	}
}
		
		
		