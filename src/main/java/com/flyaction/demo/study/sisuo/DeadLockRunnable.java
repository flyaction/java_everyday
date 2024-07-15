package com.flyaction.demo.study.sisuo;

public class DeadLockRunnable  implements Runnable{

    //编号
    public int num;
    //资源
    private static Chopsticks chopsticks1 = new Chopsticks();
    private static Chopsticks chopsticks2 = new Chopsticks();

    /**
     * num = 1，拿到chopsticks1，等待chopsticks2
     * num = 2，拿到chopsticks2，等待chopsticks1
     */
    @Override
    public void run() {

        if(num == 1){
            System.out.println(Thread.currentThread().getName()+"拿到了chopsticks1,等待获取chopsticks2");
            synchronized (chopsticks1){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (chopsticks2){
                    System.out.println(Thread.currentThread().getName()+"用餐完毕");
                }
            }
        }

        if(num == 2){
            System.out.println(Thread.currentThread().getName()+"拿到了chopsticks2,等待获取chopsticks1");
            synchronized (chopsticks2){
                synchronized (chopsticks1){
                    System.out.println(Thread.currentThread().getName()+"用餐完毕");
                }
            }
        }


    }

}
