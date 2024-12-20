class Warrior extends Thread{
	String res1="Ak47";
	String res2="M416";
	String res3="АМ";
	public void run(){
		if (Thread.currentThread().getName().equals("Student1")){
			Student1Acq();
			}
		else{
			Student2Acq();
		}
	}
	public void Student1Acq(){
		try{
			synchronized(res1) {
				System.out.println("Student1 Acquired the resource: "+res1);
				Thread.sleep(3000);
			synchronized(res2){
				System.out.println("Student1 Acquired the resource: "+res2);
				Thread.sleep(3000);
			synchronized(res3){
				System.out.println("Studenti Acquired the resource: "+res3);
				Thread.sleep(3000);
			}//Release of resource:3
	
			}//Release of resource:2
	
			}//Release of resource:1
		} 
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	public void Student2Acq(){
		try{
			synchronized(res1) {
				System.out.println("Student1 Acquired the resource: "+res1);
				Thread.sleep(3000);
			synchronized(res2){
				System.out.println("Student1 Acquired the resource: "+res2);
				Thread.sleep(3000);
			synchronized(res3){
				System.out.println("Studenti Acquired the resource: "+res3);
				Thread.sleep(3000);
			}//Release of resource:3
	
			}//Release of resource:2
	
			}//Release of resource:1
		} 
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class syncronization {
	public static void main(String[] args) {
		threads t1=new threads();
		threads t2= new threads();
		t1.setName("Student1");
		t2.setName("Student2");
		t1.start();
		t2.start();
}
}
