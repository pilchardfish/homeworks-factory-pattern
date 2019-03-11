package cn.edu.ncut.lab.factorymethod;

import cn.edu.ncut.lab.product.Book;
import cn.edu.ncut.lab.product.IPublication;

public class BookFactory implements IFactory {
    @Override
    public IPublication create() {
        return new Book();
    }
}
