# S3_custom_partitioner

설정 방법 
다음 내용을 커넥터 설정에 추가
- partitioner.class : 사용하고자 하는 파티셔너 클래스
- partitioner.topic.postfix : 토픽명 뒤에 붙이고 싶은 postfix
- partitioner.remove.databasename : 토픽명에서 데이터베이스명을 삭제하고 싶은 경우 'true'로 설정. 토픽명 내의 데이터베이스명과 테이블명은 '.'을 이용해 구성되어 있어야 함. (예시) database1.table1 

```
"partitioner.class": "com.shaunpark.kafka.connect.TopicPostfixPartitioner"
"partitioner.topic.postfix": "_inc"
"partitioner.remove.databasename": "true"
```