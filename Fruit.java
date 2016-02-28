class FruitSize{
	enum Fruitsize{ small, large}
	Fruitsize value;
}

public class Fruit{
	public static void main(String arge[]){
		FruitSize obj = new FruitSize();
		obj.value = FruitSize.Fruitsize.small;
		System.out.println(""+ obj.value);
}
}
