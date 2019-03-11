package cn.edu.ncut.lab.product;

public class Book implements IPublication {
    @Override
    public void publish() {
        System.out.println("出版图书！");
    }

    @Override
    public void audit() {
        System.out.println("审核图书");
    }
}
