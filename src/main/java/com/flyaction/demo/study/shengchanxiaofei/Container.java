package com.flyaction.demo.study.shengchanxiaofei;

public class Container {

    public Hamburger[] array = new Hamburger[6];
    public int index = 0;

    /**
     * 向容器中添加汉堡
     * @param hamburger
     */
    public synchronized void push(Hamburger hamburger){

        while (index == array.length -1){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();

       array[index] = hamburger;
       index++;
        System.out.println("生产类一个汉堡"+hamburger);
    }

    /**
     * 从容器中取出汉堡
     * @return
     */
    public synchronized Hamburger pop(){
        while (index == 0){
            //当前线程暂停
            //让正在访问当前资源的线程暂停
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒之前暂停的资源
        this.notify();
        index--;
        System.out.println("消费了一个汉堡"+array[index]);
        return array[index];
    }

}
