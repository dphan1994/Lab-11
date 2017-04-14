package lab11;

public class SensorView {
	public static Thread[] sensors = new Thread[8];

	public static void main(String[] args) {
		
		Jbutton j = new Jbutton();
		
		for(int i = 0; i <= 7; ++i)
		{
			Thread t = new Thread(new Sensor());
			sensors[i] = t;
			if(i < 7)
			{
				t.start();
			}
		}
	}
}
