package cn.edu.ncut.lab.factorymethod;

import cn.edu.ncut.lab.product.IPublication;
import cn.edu.ncut.lab.product.Journal;

public class JournalFactory implements IFactory {
    public IPublication create(){
        return new Journal();
    }
}
