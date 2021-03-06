package observer;
/**
 * 구독자
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
		System.out.println(name+" : 변경사항이 있습니다.");
	}
	
	private void finish(){
		publisher.removeObserver(this);
	}
}
