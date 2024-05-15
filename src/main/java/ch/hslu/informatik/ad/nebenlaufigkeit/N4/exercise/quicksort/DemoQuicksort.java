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
package ch.hslu.informatik.ad.nebenlaufigkeit.N4.exercise.quicksort;

import ch.hslu.informatik.ad.nebenlaufigkeit.N4.n41.array.init.RandomInitTask;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

/**
 * Vergleich von verschiedenen Quicksort-Implementationen.
 */
public final class DemoQuicksort {

    private static final Logger LOG = LoggerFactory.getLogger(DemoQuicksort.class);

    /**
     * Privater Konstruktor.
     */
    private DemoQuicksort() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {

        StringBuilder table = new StringBuilder();
        table.append("| Methode | Threshold | Time (sec) |\n");
        table.append("|---------|-----------|------------|\n");

        final int size = 1_000_000;
        final int[] arrayOriginal = new int[size];
        try (final ForkJoinPool pool = new ForkJoinPool()) {
            RandomInitTask initTask = new RandomInitTask(arrayOriginal, 100);
            pool.invoke(initTask);

            int threshold = 10_000_000;

            int[] arrayTask = Arrays.copyOf(arrayOriginal, size);
            final QuicksortTask sortTask = new QuicksortTask(arrayTask);

            long start = System.currentTimeMillis();
            pool.invoke(sortTask);
            long end = System.currentTimeMillis();
            final ch.hslu.ad.n41.array.sort.check.SortCheckTask check = new ch.hslu.ad.n41.array.sort.check.SortCheckTask(arrayTask);
            boolean ok = pool.invoke(check);
            LOG.info("Sort Check OK? : {}", ok);

            double time = (end - start) / 1E3;
            table.append("| QuicksortTask ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");
            LOG.info("QuicksortTask  : {} sec.", time);

            int[] arrayRec = Arrays.copyOf(arrayOriginal, size);

            start = System.currentTimeMillis();
            //QuicksortRecursive.quicksort(arrayRec);
            end = System.currentTimeMillis();

            time = (end - start) / 1E3;
            table.append("| QuicksortRec. ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");
            LOG.info("QuicksortRec.  : {} sec.", time);

            int[] arraySort = Arrays.copyOf(arrayOriginal, size);

            start = System.currentTimeMillis();
            Arrays.sort(arraySort);
            end = System.currentTimeMillis();

            time = (end - start) / 1E3;
            table.append("| Arrays.sort ").append(" | ").append(threshold).append(" | ").append(time).append(" |\n");
            LOG.info("Arrays.sort    : {} sec.", time);

            System.out.println(table.toString());
        } finally {
            // Executor shutdown
        }
    }
}
