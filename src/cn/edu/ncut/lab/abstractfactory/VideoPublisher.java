package cn.edu.ncut.lab.abstractfactory;

public class VideoPublisher implements IPublisher {
    @Override
    public void publish() {
        System.out.println("印刷音像电子出版物");
    }
}
