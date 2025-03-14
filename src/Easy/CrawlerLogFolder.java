package Easy;

import java.util.Stack;

public class CrawlerLogFolder {

    public int minOperations(String[] logs) {
        String[] indexOfCommands = new String[] {"./", "../"};
        Stack<String> stackOfLogs = new Stack<>();

        for(String el : logs) {
            if(!el.equals(indexOfCommands[0]) && !el.equals(indexOfCommands[1])) {
                stackOfLogs.push(el);
            }
            else if(el.equals(indexOfCommands[1]) && !stackOfLogs.isEmpty()) {
                stackOfLogs.pop();
            }
        }

        return stackOfLogs.size();
    }
}
