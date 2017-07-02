package net.foreach.data.pipeline.utils;

/**
 * Created by aitor on 1/7/17.
 */
public abstract class Constants {

    public abstract static class Pipeline {

        public enum inputType {KAFKA_TOPIC, PIPELINE_STAGE}

        public enum outputType {KAFKA_TOPIC, PIPELINE_STAGE}

    }

}
