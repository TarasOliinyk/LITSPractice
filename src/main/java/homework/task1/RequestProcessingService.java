package homework.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Implementation og a service for custom requests processing.
 */
public class RequestProcessingService {

    public static void main(String[] args) {
        processRequests(5);
    }

    /**
     * Processes custom requests in separate threads (the request is represented by an object of the MyRequest type).
     *
     * @param numberOfRequests - Specifies number of requests intended to be processed
     */
    private static void processRequests(int numberOfRequests) {
        Set<MyRequest> requests = new HashSet<>();

        for (int i = 0; i < numberOfRequests; i++) {
            requests.add(new MyRequest());
        }
        ExecutorService service = Executors.newFixedThreadPool(numberOfRequests);
        requests.forEach(service::submit);
        service.shutdown();
    }
}
