
public class Bread extends Product{

	private float volume;
	
	public Bread(String name, int netto, int taxkey, float volume) {
		super(name, netto, taxkey);
		this.volume=volume;
		// TODO Auto-generated constructor stub
	}
	
	
	public float getVolume(){
		return volume;
	}
	
	public int getWeightPrice()
	{
		return (int) (Brutto()/volume);
	}

	public String toString() {
		return "Bread " + volume + ", toString()=" + super.toString()+ "]";
	}
	
	
	public static boolean isBiggerInVolume(Bread bread1, Bread bread2)
	{
		if(bread1.getWeightPrice()>bread2.getWeightPrice()){
			return true;
		}
		return false;
	}
	
	
	
	
	
	


}
