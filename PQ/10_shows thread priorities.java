class Test{
public static void main(String args[]){
Thread t1 = new Thread();
Thread t2 = new Thread();
Thread t3 = new Thread();
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.NORM_PRIORITY);
System.out.println("Thread Priority of t1="+t1.getPriority());
System.out.println("Thread Priority of t2="+t2.getPriority());
System.out.println("Thread Priority of t3="+t3.getPriority());
}
}
