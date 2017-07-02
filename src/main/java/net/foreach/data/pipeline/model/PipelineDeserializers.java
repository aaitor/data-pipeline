package net.foreach.data.pipeline.model;

/**
 * Created by aitor on 2/7/17.
 */
public class PipelineDeserializers {

    private String keyDeserializerDefault= "org.apache.kafka.common.serialization.StringSerializer";

    private String messageDeserializerDefault= "io.confluent.kafka.serializers.KafkaAvroSerializer";

    private Class<?> keyDeserializer;

    private Class<?> messageDeserializer;


    public PipelineDeserializers(String keySerializerName, String messageSerializerName) throws ClassNotFoundException {
        try {
            this.keyDeserializer = Class.forName(keySerializerName);
        } catch (ClassNotFoundException ex) {
            this.keyDeserializer= Class.forName(keyDeserializerDefault);
        }

        try {
            this.messageDeserializer = Class.forName(messageSerializerName);
        } catch (ClassNotFoundException ex) {
            this.messageDeserializer= Class.forName(messageDeserializerDefault);
        }
    }

    public Class<?> getKeySerializer() {
        return keyDeserializer;
    }

    public PipelineDeserializers setKeySerializer(Class<?> keySerializer) {
        this.keyDeserializer = keySerializer;
        return this;
    }

    public Class<?> getMessageSerializer() {
        return messageDeserializer;
    }

    public PipelineDeserializers setMessageSerializer(Class<?> messageSerializer) {
        this.messageDeserializer = messageSerializer;
        return this;
    }

    @Override
    public String toString() {
        return "PipelineDeserializers{" +
                "keyDeserializer=" + keyDeserializer +
                ", messageDeserializer=" + messageDeserializer +
                '}';
    }
}
