
public class Main {
	public static void main(String[] args) {
		Product product= new Product("Kakao", 200, 27);
		Bread bread=new Bread("Rozs", 250, 14, 1);
		System.out.println(product+ " " + bread);
		
		Product prod2= new Bread("feher", 200, 14, 1);
		System.out.println(prod2);
		
		
		Bread bread2 = new Bread("ll", 600, 14, 2);
		
		//if(Bread.isBiggerInVolume(bread, bread2))
		
		
		
	}
}
