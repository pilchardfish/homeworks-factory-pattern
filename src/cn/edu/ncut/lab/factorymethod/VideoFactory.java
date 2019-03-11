package cn.edu.ncut.lab.factorymethod;

import cn.edu.ncut.lab.product.IPublication;
import cn.edu.ncut.lab.product.Video;

public class VideoFactory implements IFactory {
    @Override
    public IPublication create() {
        return new Video();
    }
}
