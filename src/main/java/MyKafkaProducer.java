import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class MyKafkaProducer {


    public static void main(String[] args) throws InterruptedException {
        Properties props = new Properties();
        props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ":9092");
        Producer producer = new KafkaProducer<String, String>(props);
        String topic = "bjug";
        producer.send(new ProducerRecord<String, String>(topic, "do brzegu"));
        Thread.sleep(5000);
    }
}
