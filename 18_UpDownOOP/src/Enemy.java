import java.util.Random;

public class Enemy extends Random{

	public int chooseN() {
		return super.nextInt(100)+1;
	}
	
}
