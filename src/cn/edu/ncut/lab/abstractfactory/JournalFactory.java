package cn.edu.ncut.lab.abstractfactory;


public class JournalFactory implements AbstractFactory{
    @Override
    public IAuditor createAudit() {
        return new JournalAuditor();
    }

    @Override
    public IPublisher createPublish() {
        return new JournalPublisher();
    }
}
