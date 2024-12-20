
class Warrior extends Thread{
	String res1="Ak47";
	String res2="M416";
	String res3="АwМ";
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
			}
			}
	
			}
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
			}
	
			}
	
			}
		} 
		catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class syncronization {
	public static void main(String[] args) {
		Warrior t1=new Warrior();
		Warrior t2= new Warrior();
		t1.setName("Student1");
		t2.setName("Student2");
		t1.start();
		t2.start();
}
}
