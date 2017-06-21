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
		// ���� ������ ����
		IProxy mailProxy = new Proxy();
		// ������ �ۼ�
		Mail mail = new Mail();
		// �����ڸ� ���� ���� �߼�
		mailProxy.sender(mail);
		
		// ���� �Ǽ�
		FactoryMethod factory = new TVFactory();
		Product product = factory.make();
		
		// ������ ����
		Publisher publisher = new Publisher();
		
		new Subscriber("ȫ�浿", publisher);
		new Subscriber("�̼���", publisher);
		new Subscriber("�ƹ���", publisher);
		
		publisher.process();
	}

}
