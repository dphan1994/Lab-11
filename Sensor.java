package lab11;

public class Sensor implements Runnable  {
	boolean RUN = true;
	//Thread t = new Thread(new EventThread());
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(RUN) {
			
			try {
				
				Thread.sleep(5000);
			}
			
			catch(InterruptedException e) {
				//Thread.
				System.out.println(this.toString());
				System.out.println(System.nanoTime());
			}
		}
	}
}
