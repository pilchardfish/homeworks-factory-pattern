package cn.edu.ncut.lab.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 10:47
 * To change this template use File | Settings | File Templates.
 */
public class VideoFactory implements AbstractFactory{
    @Override
    public IAuditor createAudit() {
        return new VideoAuditor();
    }

    @Override
    public IPublisher createPublish() {
        return new VideoPublisher();
    }
}
