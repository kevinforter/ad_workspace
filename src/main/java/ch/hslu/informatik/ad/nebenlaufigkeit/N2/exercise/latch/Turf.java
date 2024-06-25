/*
 * Copyright 2024 Hochschule Luzern - Informatik.
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
package ch.hslu.informatik.ad.nebenlaufigkeit.N2.exercise.latch;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Eine Rennbahn für das Pferderennen.
 */
public final class Turf {

    private static final Logger LOG = LoggerFactory.getLogger(Turf.class);
    private static final int HORSES = 5;

    /**
     * Privater Konstruktor.
     */
    private Turf() {
    }

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) throws InterruptedException {
        final CountDownLatch starterBox = new CountDownLatch(1);

        for (int i = 1; i <= HORSES; i++) {
            new Thread(new RaceHorse(starterBox, "Horse " + i)) .start();
        }
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000)); // Kurze Pause vor dem Start des Rennens
            LOG.info("Start...");
            starterBox.countDown(); // Startsignal geben
        } catch (InterruptedException e) {
            LOG.info("Hauptthread wurde unterbrochen.");
        }
    }
}
