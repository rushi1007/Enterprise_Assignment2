// KafkaProducerService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "order-placed";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderPlacedEvent(String message) {
        kafkaTemplate.send(TOPIC, message);
    }
}
