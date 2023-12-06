package com.solvd.solvdexercise.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class ConnectionPool {

    private static volatile BlockingQueue<Connection> pool;
    private static final int poolSize = 5;
    private static final Semaphore semaphore = new Semaphore(poolSize);

    private ConnectionPool() {
    }

    public static synchronized BlockingQueue<Connection> getPool() {
        if (pool == null) {
            pool = new ArrayBlockingQueue<>(poolSize);
            for (int i = 0; i < poolSize; i++) {
                pool.add(new Connection());
            }
        }
        return pool;
    }

    public static Connection acquireConnection() throws InterruptedException {
        semaphore.acquire();
        return pool.poll();
    }

    public static void releaseConnection(Connection connection) {
        pool.offer(connection);
        semaphore.release();
    }
}

