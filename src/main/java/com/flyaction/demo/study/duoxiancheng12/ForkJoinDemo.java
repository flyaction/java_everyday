package com.flyaction.demo.study.duoxiancheng12;

import java.util.concurrent.RecursiveTask;


/**
 * 十亿求和
 */
public class ForkJoinDemo extends RecursiveTask<Long> {

    private Long start;
    private Long end;
    private Long temp = 100_0000L;

    public ForkJoinDemo(Long start, Long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if((end-start)<temp){
            Long sum = 0L;
            for(Long i = start;i <= end; i++){
                sum += i;
            }
            return sum;
        }else{
            Long avg = (start+end)/2;
            ForkJoinDemo task1 = new ForkJoinDemo(start,avg);
            task1.fork();
            ForkJoinDemo task2 = new ForkJoinDemo(avg+1,end);
            task2.fork();
            return task1.join()+task2.join();

        }
    }
}
