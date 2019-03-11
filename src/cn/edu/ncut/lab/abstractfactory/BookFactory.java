package cn.edu.ncut.lab.abstractfactory;

public class BookFactory implements AbstractFactory {
    @Override
    public IAuditor createAudit() {
        return new BookAuditor();
    }

    @Override
    public IPublisher createPublish() {
        return new BookPublisher();
    }
}
