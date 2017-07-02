package net.foreach.data.pipeline.model;

/**
 * Created by aitor on 2/7/17.
 */
public class PipelineSerializers {

    private String keySerializerDefault= "org.apache.kafka.common.serialization.StringSerializer";

    private String messageSerializerDefault= "io.confluent.kafka.serializers.KafkaAvroSerializer";

    private Class<?> keySerializer;

    private Class<?> messageSerializer;


    public PipelineSerializers(String keySerializerName, String messageSerializerName) throws ClassNotFoundException {
        try {
            this.keySerializer = Class.forName(keySerializerName);
        } catch (ClassNotFoundException ex) {
            this.keySerializer= Class.forName(keySerializerDefault);
        }

        try {
            this.messageSerializer = Class.forName(messageSerializerName);
        } catch (ClassNotFoundException ex) {
            this.messageSerializer= Class.forName(messageSerializerDefault);
        }
    }

    public Class<?> getKeySerializer() {
        return keySerializer;
    }

    public PipelineSerializers setKeySerializer(Class<?> keySerializer) {
        this.keySerializer = keySerializer;
        return this;
    }

    public Class<?> getMessageSerializer() {
        return messageSerializer;
    }

    public PipelineSerializers setMessageSerializer(Class<?> messageSerializer) {
        this.messageSerializer = messageSerializer;
        return this;
    }

    @Override
    public String toString() {
        return "PipelineSerializers{" +
                "keySerializer=" + keySerializer +
                ", messageSerializer=" + messageSerializer +
                '}';
    }
}
