package Assignment_1.part_5;

import Assignment_1.part_3.Stack;

import java.util.ArrayList;
import java.util.Arrays;

public class Towers_of_Hanoi {
    ArrayList<Stack> rod_1;
    ArrayList<Stack> rod_2;
    ArrayList<Stack> rod_3;
    ArrayList<ArrayList> rods;
    Integer size;

    public Towers_of_Hanoi() {
        rod_1 = new ArrayList<>();
        rod_2 = new ArrayList<>();
        rod_3 = new ArrayList<>();
        rods = new ArrayList<>(
                Arrays.asList(rod_1, rod_2, rod_3)
        );
        size = 0;
    }

    private void moveDisk(Integer startingRod, Integer destinationRod) {
        rods.get(destinationRod).add(rods.get(startingRod).remove(0));
    }

    private ArrayList<Disk> disksAtRod(Integer rodIndex) {
        ArrayList<Stack> queue = new ArrayList<>();
        for (ArrayList<Stack> i : rods.get(rodIndex)) {
            queue.add(i);
        }
    }
}
