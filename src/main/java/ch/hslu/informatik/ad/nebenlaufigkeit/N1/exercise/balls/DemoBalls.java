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
package ch.hslu.informatik.ad.nebenlaufigkeit.N1.exercise.balls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Demonstration von Bällen.
 */
public class DemoBalls {

    private static final Logger LOG = LoggerFactory.getLogger(DemoBalls.class);

    /**
     * Main-Demo.
     *
     * @param args not used.
     */
    public static void main(final String[] args) {
        final String[] color = {"red", "black", "blue", "yellow", "green", "magenta"};

        Random random = new Random();

        int max = 100;
        int min = 40;
        int range = max - min + 1;

        int diameter = (int) (Math.random() * range) + min;
        LOG.info("R: " + diameter);
        int x = random.nextInt(1000);
        LOG.info("X: " + x);
        int y = random.nextInt(800 - diameter);
        LOG.info("Y: " + y);
        int randomColor = random.nextInt(5);

        Circle circle = new Circle(diameter, x, y, color[randomColor]);
        System.out.println(diameter);
        circle.makeVisible();

        for (int i = 0; i < 500; i++) {
            circle.fallAndBurst(Canvas.getCanvas().getHeight(), random.nextInt(20));
            LOG.info("Y: " + circle.getY());
        }
    }
}
