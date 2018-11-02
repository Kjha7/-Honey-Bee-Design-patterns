import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Beehive {
	int locationx, locationy, count=0, capacity =100;
	String species;
	private List<Bees> beelist = new ArrayList<Bees>();
	
	private Beehive(Beehivebuilder builder){
		this.locationx = builder.locationx;
		this.locationy = builder.locationy;
		this.count = builder.count;
		this.capacity = builder.capacity;
		this.species = builder.species;
		this.beelist = builder.beelist;
	}
	
	int locationx(){return locationx;}
	int locationy(){return locationy;}
	int count(){return count;}
	int capacity(){return capacity;}
	String species(){return species;}
	List beelist(){return beelist;}
	
	public static class Beehivebuilder{
		int locationx, locationy, count=0, capacity =100;
		String species;
		private List<Bees> beelist = new ArrayList<Bees>();
		
		Beehivebuilder(int locationx,int locationy,int count,int capacity, String species){
			this.locationx = locationx;
			this.locationy = locationy;
			this.count = count;
			this.capacity = capacity;
			this.species = species;
			this.beelist = beelist;
		}
		
		void createBees(){
				while(count>0){
					Bees b1 = new Queenbee();
					beelist.add(b1);	
					Random rand = new Random();
					int max = 2;
					int r = rand.nextInt(max);
					if(r == 0)
					{
						Bees bees1 = new Dronebee();
						beelist.add(bees1);
					}
					else
					{
						Bees bees2 = new Warriorbee();
						beelist.add(bees2);
					}
				}
				System.out.println("created in beehive "+this.locationx+" "+ this.locationy);
			}
		
		Beehive build(){
			return new Beehive(this);
		}
	}
}
