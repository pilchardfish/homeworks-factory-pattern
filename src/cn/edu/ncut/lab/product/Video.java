package cn.edu.ncut.lab.product;

public class Video implements IPublication {
    @Override
    public void publish() {
        System.out.println("出版音像电子！");
    }

    @Override
    public void audit() {
        System.out.println("审核音像电子");
    }
}
