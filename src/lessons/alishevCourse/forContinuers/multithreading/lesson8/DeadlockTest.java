package lessons.alishevCourse.forContinuers.multithreading.lesson7.lesson8;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockTest {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThread();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        runner.finished();
    }
}


class Runner{
    private Account account1 = new Account();
    private Account account2 = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    private void takeLock(Lock lock1, Lock lock2){
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;
        while(true) {
            try {
                firstLockTaken = lock1.tryLock();
                secondLockTaken = lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken) {
                    return;
                }
                if (firstLockTaken) {
                    lock1.unlock();
                }
                if (secondLockTaken) {
                    lock2.unlock();
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    private void returnLock (Lock lock1, Lock lock2){
        lock1.unlock();
        lock2.unlock();
    }

    public void firstThread(){
        Random random = new Random();
        for (int i=0; i < 10000; i++){
            takeLock(lock1, lock2);
            try {
                Account.transfer(account1, account2, random.nextInt(100));
            } finally {
                returnLock(lock1, lock2);
            }

        }
    }

    public void secondThread(){
        Random random = new Random();
        for (int i=0; i < 10000; i++){
            takeLock(lock2, lock1);
            try {
            Account.transfer(account2, account1, random.nextInt(100));
            } finally {
                returnLock(lock1, lock2);
            }
        }
    }

    public void finished(){
        System.out.println(account1.getBalanced());
        System.out.println(account2.getBalanced());
        System.out.println("Total balance " +(account1.getBalanced() + account2.getBalanced()));
    }
}

class Account{
    private int balance = 10000;
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalanced(){
        return balance;
    }

    public static void transfer(Account acc1, Account acc2, int amount) {
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }
}
