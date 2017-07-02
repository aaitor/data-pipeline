package net.foreach.data.pipeline.model;


import java.util.List;

/**
 * Created by aitor on 1/7/17.
 */
public class Pipeline {

    private String id;

    private String name;

    private PipelineConf pipelineConf;

    private List<Stage> stages;

    private PipelineSerializers serializers;

    private PipelineDeserializers deserializers;

    public Pipeline() {
    }

    public String getId() {
        return id;
    }

    public Pipeline setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pipeline setName(String name) {
        this.name = name;
        return this;
    }

    public PipelineConf getPipelineConf() {
        return pipelineConf;
    }

    public Pipeline setPipelineConf(PipelineConf pipelineConf) {
        this.pipelineConf = pipelineConf;
        return this;
    }

    public List<Stage> getStages() {
        return stages;
    }

    public Pipeline setStages(List<Stage> stages) {
        this.stages = stages;
        return this;
    }

    public PipelineSerializers getSerializers() {
        return serializers;
    }

    public Pipeline setSerializers(PipelineSerializers serializers) {
        this.serializers = serializers;
        return this;
    }

    public PipelineDeserializers getDeserializers() {
        return deserializers;
    }

    public Pipeline setDeserializers(PipelineDeserializers deserializers) {
        this.deserializers = deserializers;
        return this;
    }

    @Override
    public String toString() {
        return "Pipeline{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pipelineConf=" + pipelineConf +
                ", stages=" + stages +
                ", serializers=" + serializers +
                ", deserializers=" + deserializers +
                '}';
    }
}
