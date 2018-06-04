package com.company.exams;

import java.util.TreeMap;

public class GiftPriorityQueue {
    private TreeMap<Integer, String> giftsQueue;

    GiftPriorityQueue() {
        giftsQueue = new TreeMap<>();
    }

    public int addGift(String name, Integer priority) {
        giftsQueue.put(priority, name);
        return giftsQueue.size();
    }

    public String buyGift() {
        return giftsQueue.pollFirstEntry().getValue();
    }
}
