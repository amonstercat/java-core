package Thread.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    public static void main(String[] args) {
        //内部类形式获得读写锁
        ReentrantReadWriteLock  reentrantReadWriteLock=new ReentrantReadWriteLock();
        //获取内部类对象需要借助其外部类对象
        ReentrantReadWriteLock.ReadLock readLock1=reentrantReadWriteLock.readLock();
        ReentrantReadWriteLock.WriteLock writeLock1=reentrantReadWriteLock.writeLock();

        //使用多态表示形式获得读写锁
        ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        Lock readLock2=readWriteLock.readLock();
        Lock writeLock2=readWriteLock.writeLock();
    }
}
