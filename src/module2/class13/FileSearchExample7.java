package module2.class13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class KeywordSearchTask implements Callable<List<String>> {
    private String filePath;
    private String keyword;

    public KeywordSearchTask(String filePath, String keyword) {
        this.filePath = filePath;
        this.keyword = keyword;
    }

    @Override
    public List<String> call() throws Exception {
        return searchForKeyword(filePath, keyword);
    }

    private List<String> searchForKeyword(String filePath, String keyword) throws IOException {
        List<String> foundLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    foundLines.add("Found in " + filePath + " at line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        }
        return foundLines;
    }
}

public class FileSearchExample7 {
    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files.add("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\module2\\class13\\file1.txt");
        files.add("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\module2\\class13\\file2.txt");
        files.add("C:\\Users\\pares\\IdeaProjects\\DeltaBatch\\src\\module2\\class13\\file3.txt");

        String keyword = "Java";

        ExecutorService executor = Executors.newFixedThreadPool(6); // Use 3 threads

        List<Future<List<String>>> futures = new ArrayList<>();

        for (String filePath : files) {
            Callable<List<String>> callable = new KeywordSearchTask(filePath, keyword);
            Future<List<String>> future = executor.submit(callable);
            futures.add(future);
        }

        List<String> foundLines = new ArrayList<>();

        for (Future<List<String>> future : futures) {
            try {
                foundLines.addAll(future.get()); // Wait and collect found lines
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Print the lines containing the keyword
        for (String line : foundLines) {
            System.out.println(line);
        }

        executor.shutdown();
    }
}
