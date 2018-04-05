
public class Product {
	String name;
	int netto;
	int taxkey;
	
	public Product(String name, int netto, int taxkey) {
		super();
		this.name = name;
		this.taxkey = taxkey;
	}
	
	public double Brutto()
	{
		return netto+(netto*taxkey*100);
	}
	
	
	public int Increase(int num){
		return netto+(netto*num/100);
	}

	public String toString() {
		return "Product [name=" + name + ", Brutto()=" + Brutto() + "]";
	}
	
	public int Bruttoss(Product product)
	{
		int i=0;
		if(this.Brutto()>product.Brutto())
		{
			i=1;
		}
		if(this.Brutto()<product.Brutto())
		{
			i=-1;
		}
		return i;
	}
	
	
	
}
