package module2.class13;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class WebsiteScraper implements Callable<String> {
    private String url;

    public WebsiteScraper(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        return fetchAndProcessData(url);
    }

    private String fetchAndProcessData(String url) throws IOException {
        // Simulate fetching and processing data from the website
        // In a real application, you would use libraries like Jsoup for web scraping
        return "Data from " + url;
    }
}

public class WebScrapingExample6 {
    public static void main(String[] args) {
        List<String> websites = new ArrayList<>();
        websites.add("https://www.example.com");
        websites.add("https://www.sample.com");
        websites.add("https://www.demo.com");

        ExecutorService executor = Executors.newFixedThreadPool(3); // Use 3 threads

        List<Future<String>> futures = new ArrayList<>();

        for (String website : websites) {
            Callable<String> callable = new WebsiteScraper(website);
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }

        List<String> scrapedData = new ArrayList<>();

        for (Future<String> future : futures) {
            try {
                scrapedData.add(future.get()); // Wait and collect scraped data
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Process and analyze the scraped data
        for (String data : scrapedData) {
            System.out.println("Processed data: " + data);
        }

        executor.shutdown();
    }
}
