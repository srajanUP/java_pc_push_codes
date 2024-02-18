package DSA_In_java.Sorting;
import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.PriorityQueue;

public class externalSort {
    public static void externalSort(String inputFilePath, String outputFilePath, int chunkSize) throws IOException {
        // Step 1: Divide - Create sorted runs
        List<String> runs = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                List<String> chunk = new ArrayList<>();
                for (int i = 0; i < chunkSize && line != null; i++) {
                    chunk.add(line);
                    line = reader.readLine();
                }
                chunk.sort(null); // In-memory sorting
                String runFileName = "run" + runs.size() + ".txt";
                runs.add(runFileName);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(runFileName))) {
                    for (String item : chunk) {
                        writer.write(item);
                        writer.newLine();
                    }
                }
            }
        }

        // Step 2: Merge - Merge sorted runs
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            PriorityQueue<RunWrapper> minHeap = new PriorityQueue<>();
            List<BufferedReader> readers = new ArrayList<>();

            // Initialize the min heap with the first element from each run
            for (int i = 0; i < runs.size(); i++) {
                BufferedReader reader = new BufferedReader(new FileReader(runs.get(i)));
                readers.add(reader);
                String line = reader.readLine();
                if (line != null) {
                    minHeap.offer(new RunWrapper(line, i));
                }
            }

            while (!minHeap.isEmpty()) {
                RunWrapper min = minHeap.poll();
                writer.write(min.line);
                writer.newLine();

                BufferedReader reader = readers.get(min.runIndex);
                String nextLine = reader.readLine();
                if (nextLine != null) {
                    minHeap.offer(new RunWrapper(nextLine, min.runIndex));
                } else {
                    reader.close();
                }
            }
        }

        // Cleanup temporary files
        for (String run : runs) {
            File file = new File(run);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    private static class RunWrapper implements Comparable<RunWrapper> {
        String line;
        int runIndex;

        public RunWrapper(String line, int runIndex) {
            this.line = line;
            this.runIndex = runIndex;
        }

        @Override
        public int compareTo(RunWrapper other) {
            return this.line.compareTo(other.line);
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "D:\\PROGRAMING\\PROGRAMING_CODES\\java\\DSA_In_java\\Sorting\\unsorted_data.txt";
        String outputFilePath = "D:\\PROGRAMING\\PROGRAMING_CODES\\java\\DSA_In_java\\Sorting\\sorted_data.txt";
        int chunkSize = 1000;

        try {
            externalSort(inputFilePath, outputFilePath, chunkSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
