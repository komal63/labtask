//se20f045
package assignment1;

public class starvation extends Thread {
	    static int threadcount = 1;
	    public void run()
	    {
	        System.out.println(threadcount + "st Child" +
	                            " thread executing ");
	        System.out.println("execution completes");
	        threadcount++;
	    }
	    public static void main(String[] args)
	               throws InterruptedException
	    {
	        System.out.println("Main thread execution starts");
	 
	       
	        starvation thread1 = new starvation ();
	        thread1.setPriority(10);
	        starvation thread2 = new starvation ();
	        thread2.setPriority(9);
	        starvation thread3 = new starvation();
	        thread3.setPriority(8);
	        starvation thread4 = new starvation();
	        thread4.setPriority(7);
	        starvation thread5 = new starvation();
	        thread5.setPriority(6);
	 
	        thread1.start();
	        thread2.start();
	        thread3.start();
	        thread4.start();
	 
	       
	        thread5.start();
	 
	        System.out.println("Main thread execution completes");
	    }
	}

