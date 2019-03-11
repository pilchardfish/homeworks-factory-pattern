package cn.edu.ncut.lab.factorymethod;

import cn.edu.ncut.lab.product.IPublication;

public interface IFactory {
    public IPublication create();
}
