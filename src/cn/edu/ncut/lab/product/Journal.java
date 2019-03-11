package cn.edu.ncut.lab.product;

public class Journal implements IPublication {
    @Override
    public void publish() {
        System.out.println("出版期刊！");
    }

    @Override
    public void audit() {
        System.out.println("审核期刊");
    }
}
