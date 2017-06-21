package factorymethod;

public class Phone extends Product implements IPhone{
	@Override
	public void printName() {
		System.out.println("Phone");
	}

	@Override
	public void call() {
		
	}
}
