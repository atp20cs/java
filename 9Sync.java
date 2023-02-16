class Display{
	public synchronized void print(String msg)
	{
		System.out.print("["+msg);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("]");
	}
}
class SyncExample extends Thread
{
	private Display d;
	private String msg;
	public SyncExample(Display d,String msg)
	{
		this.d=d;
		this.msg=msg;
	}
	public void run()
	{
		d.print(msg);
	}
}
class Test
{
	public static void main(String args[])
	{
		Display d=new Display();
		SyncExample t1=new SyncExample(d,"HARIKRISHNAN K C");
		SyncExample t2=new SyncExample(d,"AFRIDI AL RAYAAN");
		t1.start();
		t2.start();
	}
}
