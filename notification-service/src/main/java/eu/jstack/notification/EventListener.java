package eu.jstack.notification;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class EventListener {
    public static Logger logger = LoggerFactory.getLogger(EventListener.class);

    @Autowired
    private SocketHandler socketHandler;


    @KafkaListener(topics = "inventory")
    public InventoryUpdated listen(ConsumerRecord<String, String> cr) throws Exception {
        InventoryUpdated iu = InventoryUpdated.fromString(cr.value());
        logger.info("Got something...." + iu.getMealId() + ", " + iu.getInventory());
        socketHandler.sendMessage();
        return iu;
    }
}
