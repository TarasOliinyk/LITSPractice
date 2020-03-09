package homework.task1;

import java.util.UUID;

/**
 * Implementation of a custom request.
 */
public class MyRequest extends Thread {
    private UUID id;
    private String header;
    private String body;

    MyRequest() {
        id = UUID.randomUUID();
        header = "Header of request w/ id: " + id;
        body = "Body of request w/ id: " + id;
    }

    /**
     * Gets request id.
     *
     * @return {@code UUID}
     */
    public UUID getRequestId() {
        return id;
    }

    /**
     * Gets request header.
     *
     * @return {@code String}
     */
    public String getHeader() {
        return header;
    }

    /**
     * Gets request body.
     *
     * @return {@code String}
     */
    public String getBody() {
        return body;
    }

    /**
     * Executes specified code on thread invocation.
     */
    @Override
    public void run() {
//        System.out.println("Request body: " + this.getBody());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Request {" +
                "\nid=" + id +
                "\nheader='" + header +
                "\nbody='" + body +
                "\n}";
    }
}
