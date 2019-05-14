package demo;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;

public class Producer {
    private JmsTemplate template;
    private Destination destination;

    public void produce(MyMessage message){
        template.convertAndSend(destination, message);
    }

    public JmsTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JmsTemplate template) {
        this.template = template;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}