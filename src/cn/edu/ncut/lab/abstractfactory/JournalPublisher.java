package cn.edu.ncut.lab.abstractfactory;

public class JournalPublisher implements IPublisher {
    @Override
    public void publish() {
        System.out.println("印刷期刊");
    }
}
