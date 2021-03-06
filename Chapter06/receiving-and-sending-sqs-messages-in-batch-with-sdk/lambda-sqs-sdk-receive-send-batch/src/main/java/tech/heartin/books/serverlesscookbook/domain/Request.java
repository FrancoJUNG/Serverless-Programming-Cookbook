package tech.heartin.books.serverlesscookbook.domain;

import lombok.Data;

/**
 * Request POJO.
 */
@Data
public class Request {
    private String inputQueueURL;
    private String outputQueueURL;
    private int maxMessagesToReceive;
    private int delay;
}
