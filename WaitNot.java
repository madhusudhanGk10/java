class evnodd implements Runnable{
	static int count=1;
	Object ob;
	public evnodd(Object ob) {
		super();
		this.ob=ob;
	}
		
	public void run() {
			while(count<=10) {
				if(count%2==0 && Thread.currentThread().getName().equals("even")) {
					synchronized(ob) {
						System.out.println("Thread name "+Thread.currentThread().getName()+"value :"+count);
						try {
						Thread.sleep(2000);
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
						count++;
						try {
						ob.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				if(count%2==1 && Thread.currentThread().getName().equals("odd")) {
						synchronized(ob) {
							System.out.println("Thread name "+Thread.currentThread().getName()+"value :"+count);
							try {
								Thread.sleep(2000);
								}catch(InterruptedException e) {
									e.printStackTrace();
								}
								count++;
								try {
								ob.notify();
								}catch(Exception e) {
									e.printStackTrace();
								}
						}
					}
				}
		}
}
public class WaitNot {
public static void main(String[] args) {
	Object lock=new Object();
	evnodd t1=new evnodd(lock);
	evnodd t2=new evnodd(lock);
	Thread e1=new Thread(t1);
	Thread e2=new Thread(t2);
	e1.setName("even");
	e2.setName("odd");
	e1.start();
	e2.start();
	//new Thread(t1,"even").start();
	//new Thread(t2,"even").start();
}
}