package cn.edu.ncut.lab.simplefactory;

import cn.edu.ncut.lab.product.IPublication;

public class SimplePublicationFactory {
    public IPublication create(Class clazz) {
        try {
            if (null != clazz)
                return (IPublication) clazz.newInstance();
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
