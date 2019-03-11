package cn.edu.ncut.lab.abstractfactory;

public class BookPublisher implements IPublisher {
    @Override
    public void publish() {
        System.out.println("印刷图书");
    }
}
