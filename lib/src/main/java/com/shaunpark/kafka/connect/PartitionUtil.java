package com.shaunpark.kafka.connect;


public class PartitionUtil {

    static String DOT = ".";

    public static String removeDBName(String topic) {
        String topicName = new String(topic);

        if( topic != null ) {
            int index = topic.indexOf(DOT);
            if( index > 0 && index < topic.length() -1 ) {
                topicName = topic.substring(index + 1);
            }
        } 
        return topicName;
    }
}
