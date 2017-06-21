package observer;
/**
 * ������
 * @author pc
 *
 */
public class Subscriber implements Observer{
	Publisher publisher;
	String name;
	
	public Subscriber(String name, Publisher publisher){
		this.name = name;
		this.publisher = publisher;
		publisher.addObserver(this);
	}

	@Override
	public void alarm() {
		showEvent();
	}
	
	private void showEvent(){
		System.out.println(name+" : ��������� �ֽ��ϴ�.");
	}
	
	private void finish(){
		publisher.removeObserver(this);
	}
}
