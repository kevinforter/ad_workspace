/*
 * Copyright 2024 Hochschule Luzern Informatik.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ch.hslu.informatik.ad.nebenlaufigkeit.N1.exercise.joins;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Demonstration von Join und Sleep - Aufgabe 3 - N1_EX_ThreadsSynch.
 */
public class JoinAndSleep {
    
    private static final Logger LOG = LoggerFactory.getLogger(JoinAndSleep.class);
    
    /**
     * Main-Demo.
     *
     * @param args not used.
     * @throws InterruptedException wenn Warten unterbrochen wird.
     */
    public static void main(String[] args) throws InterruptedException {
        final JoinAndSleepTask task3 = new JoinAndSleepTask("task3", 4000);
        final JoinAndSleepTask task2 = new JoinAndSleepTask("task2", 3000);
        final JoinAndSleepTask task1 = new JoinAndSleepTask("task1", 2000);

        final Thread thread3 = new Thread(task3, "Task3-Thread3");
        final Thread thread2 = new Thread(task2, "Task2-Thread2");
        final Thread thread1 = new Thread(task1, "Task1-Thread1");

        task2.setJoinFor(thread3);
        task1.setJoinFor(thread2);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
