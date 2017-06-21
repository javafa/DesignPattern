import factorymethod.FactoryMethod;
import factorymethod.Product;
import factorymethod.TVFactory;
import mail.IProxy;
import mail.Mail;
import mail.Proxy;
import mail.Server;
import observer.Publisher;
import observer.Subscriber;

public class PatternMain {

	public static void main(String[] args) {
		// 메일 대행자 생성
		IProxy mailProxy = new Proxy();
		// 편지글 작성
		Mail mail = new Mail();
		// 대행자를 통한 메일 발송
		mailProxy.sender(mail);
		
		// 공장 건설
		FactoryMethod factory = new TVFactory();
		Product product = factory.make();
		
		// 발행자 생성
		Publisher publisher = new Publisher();
		
		new Subscriber("홍길동", publisher);
		new Subscriber("이순신", publisher);
		new Subscriber("아무개", publisher);
		
		publisher.process();
	}

}
