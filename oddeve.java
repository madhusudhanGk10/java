class EvenorOdd1 implements Runnable{
	static int count=1;
	Object obj=new Object();
	public void run(){
		try{
			while(count<=10) {
				if(count%2==0 && Thread.currentThread().getName().equals("Even")) {
					synchronized(obj) {
						System.out.println("Thread Name: "+Thread.currentThread().getName()+", Value: "+count);
						Thread.sleep(2000);
						count++;
						obj.wait();
						
					}
				}
				if(count%2!=0 && Thread.currentThread().getName().equals("Odd")){
					synchronized(obj) {
						System.out.println("Thread Name: "+Thread.currentThread().getName()+",  Value: "+count);
						Thread.sleep(2000);
					}
				}
				count++;
				obj.notify();
			}
		}
		catch(IllegalMonitorStateException e) {
			System.out.println(e);
		}
	}

}
class oddeve{
	public static void main(String[] args) {
		EvenorOdd1 eo1=new EvenorOdd1();
		EvenorOdd1 eo2=new EvenorOdd1();
		Thread t1=new Thread(eo1);
		Thread t2=new Thread(eo2);
		t1.setName("Even");
		t2.setName("Odd");
		t1.start();
		t2.start();
	}
}