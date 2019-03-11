package cn.edu.ncut.lab.abstractfactory;

public class JournalAuditor implements IAuditor {
    @Override
    public void audit() {
        System.out.println("期刊审核");
    }
}
