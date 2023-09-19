# S3_custom_partitioner

설정 방법 
다음 내용을 커넥터 설정에 추가

```
"partitioner.class": "com.shaunpark.kafka.connect.TopicPostfixPartitioner"
"partitioner.topic.postfix": "_inc"
```