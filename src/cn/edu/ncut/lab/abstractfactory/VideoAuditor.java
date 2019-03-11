package cn.edu.ncut.lab.abstractfactory;

public class VideoAuditor implements IAuditor {
    @Override
    public void audit() {
        System.out.println("审核音像电子");
    }
}
