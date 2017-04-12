package lab11;

public class SensorView {
	
	public static void main(String[] args) {
		
		Sensor[] sensors = new Sensor[8];
		Jbutton b = new Jbutton();
		
		for(int i = 0; i <= 7; ++i)
		{
			Sensor t = new Sensor();
			sensors[i] = t;
			if(i < 7)
			{
				t.run();
			}
		}
	}
}
