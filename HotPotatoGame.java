package com.javacollections;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame 
{
    public static void main(String[] args)
    {
        Queue<String> playersQueue = new LinkedList<>();
        String[] playerNames = {"vaishu", "rakshu", "kushi", "shreya", "keerthi"};

        
        // Enqueue player names to create the initial circle
        for (String playerName : playerNames)
        {
            playersQueue.offer(playerName);
        }

        int passes = 1; // Simulate passing the potato 3 times
        while (playersQueue.size() > 1) 
        {
            for (int i = 0; i < passes - 1; i++)
            {
                // Dequeue and enqueue to simulate passing the potato
                playersQueue.offer(playersQueue.poll());
            }
            System.out.println("\nMusic is playing...");
            
            System.out.println("Music Stops!");
            
            // The player holding the potato is eliminated
            System.out.println(playersQueue.poll() + " is out! ");
        }

        // The last player remaining wins
        System.out.println("\n Winner: " + playersQueue.poll());
    }
}