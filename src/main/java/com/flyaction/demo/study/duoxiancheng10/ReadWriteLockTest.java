package com.flyaction.demo.study.duoxiancheng10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author action
 */
public class ReadWriteLockTest {
    public static void main(String[] args) {
        Cache cache = new Cache();
        for(int i = 0;i<5;i++){
            final int temp = i;
            new Thread(()->{
                cache.write(temp,String.valueOf(temp));
            }).start();
        }

        for(int i = 0;i<5;i++){
            final int temp = i;
            new Thread(()->{
                cache.read(temp);
            }).start();
        }
    }
}

class Cache{
    private Map<Integer,String> map = new HashMap<>();
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    /**
     * 写操作
     * @param key
     * @param value
     */
    public void write(Integer key,String value){
        readWriteLock.writeLock().lock();
        System.out.println(key+"开始写入");
        map.put(key,value);
        System.out.println(key+"写入完毕");
        readWriteLock.writeLock().unlock();
    }

    /**
     * 读操作
     * @param key
     */
    public void read(Integer key){
        readWriteLock.readLock().lock();
        System.out.println(key+"开始读取");
        map.get(key);
        System.out.println(key+"读取完毕");
        readWriteLock.readLock().unlock();
    }

}

