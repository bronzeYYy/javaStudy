package thread.juc;

import java.util.concurrent.*;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + ": 获取");
                    cyclicBarrier.await(); // 等待另一个线程获取到一起执行，方便观察，CyclicBarrier设置为3，则永远等待
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                    System.out.println(Thread.currentThread().getName() + ": 释放");
                }
            });
        }
        service.shutdown();
    }
}
