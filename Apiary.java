
public class Apiary {
	
	static Apiary apiary = new Apiary();
	
	Beehive apiaryarr[][] = new Beehive[10][10];
	
	/*for(int i = 0;i<10;i++)
		for(int j = 0;j < 10; j++)
			apiaryapp[i][j] = null;*/

	private Apiary(){}
	
	void addBeehive(int x,int y, Beehive bh){
		if(apiaryarr[x][y] == null)
			apiaryarr[x][y] = bh;
		else
			System.out.println("Bees are at work. choose different location.");
	}
	
}
