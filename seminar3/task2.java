package seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями
// Вывести название каждой планеты и количество его повторений в списке

public class task2 {
    public static void main(String[] args) {

        // Общее для всех решений

        String[] planets = { "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };

        ArrayList<String> planetsArray = new ArrayList<String>();

        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(planets.length);
            planetsArray.add(planets[index]);
        }
        // Второй вариант for
        // for (int i = 0; i < planets.length; i++){
        //     planetsArray.add(planets[rnd.nextInt(0,7)]);
        // }
        System.out.println(planetsArray);

        // Первое решение

        // int[] counts = new int[9];

        // for (String name : planetsArray) {
        //     for (int j = 0; j < planets.length; j++) {
        //         if (name.equals(planets[j])) {
        //             counts[j]++;
        //             break;
        //         }
        //     }
        // }

        // for (int j = 0; j < planets.length; j++) {
        //     System.out.println(planets[j] + ": " + counts[j]);
        // }
    

    // Через Map

        // Map<String, Integer> planetCounts = new HashMap<>();
        // for (String planet : planetsArray) {
        //     Integer count = planetCounts.get(planet);
        //     if (count == null) {
        //         planetCounts.put(planet, 1);
        //     } else {
        //         planetCounts.put(planet, count + 1);
        //     }
        // }

        // for (String planet : planetCounts.keySet()) {
        //     int count = planetCounts.get(planet);
        //     System.out.println(planet + ": " + count);
        // }


    // Через Collection

        // for (int i = 0; i < planets.length; i++) {
        //     System.out.printf("%s встречается %d раз \n", planets[i], Collections.frequency(planetsArray, planets[i]));
        // }
    




// Решение второго зала
        planetsArray.sort(Comparator.naturalOrder());
        System.out.println(planetsArray);
        
        int count = 1;
        for (int i = planetsArray.size() - 1; i > 0; i--){
            if (planetsArray.get(i).equals(planetsArray.get(i-1))){
                count++;
            } else {
                System.out.println(planetsArray.get(i) + " повторяется " + count + " раз");
                count = 1;
            }
        }
        System.out.println(planetsArray.get(0) + " повторяется " + count + " раз");
    }
}

