package Multithreading;

public class InterruptThreadinterruptMethod extends Thread
{
    public void run()
    {
    	try
    	{
    		for (int j = 1; j <5; j++) 
    		{
			  System.out.println(j);
    	      Thread.sleep(1000);
    	    }
         }
    	catch (Exception e) 
    	{
          System.out.println(e);
    	}
    }
	public static void main(String[] args)
	{
       InterruptThreadinterruptMethod it= new InterruptThreadinterruptMethod();
       it.start();
       it.interrupt();
	}

}
