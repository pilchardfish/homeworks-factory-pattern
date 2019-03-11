package cn.edu.ncut.lab.abstractfactory;

public class BookAuditor implements IAuditor {
    @Override
    public void audit() {
        System.out.println("图书审核");
    }
}
