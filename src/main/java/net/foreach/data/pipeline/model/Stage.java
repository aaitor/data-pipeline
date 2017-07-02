package net.foreach.data.pipeline.model;

import net.foreach.data.pipeline.utils.Constants;


import java.util.HashSet;
import java.util.Set;

import static net.foreach.data.pipeline.utils.PipelineHelpers.generateStageUUID;

/**
 * Created by aitor on 1/7/17.
 */
public class Stage {

    private String id= null;

    private String name= null;

    private String className= null;

    private Constants.Pipeline.inputType inputType= Constants.Pipeline.inputType.PIPELINE_STAGE;

    private String inputTopic= null;

    private Constants.Pipeline.inputType outputType= Constants.Pipeline.inputType.PIPELINE_STAGE;

    private String outputModelName= null;

    private Stage nextStage= null;

    private Set<StageParam> stageParams= new HashSet<>();


    public Stage(String name) {
        this.id= generateStageUUID();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public Stage setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Stage setName(String name) {
        this.name = name;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public Stage setClassName(String className) {
        this.className = className;
        return this;
    }

    public Constants.Pipeline.inputType getInputType() {
        return inputType;
    }

    public Stage setInputType(Constants.Pipeline.inputType inputType) {
        this.inputType = inputType;
        return this;
    }

    public String getInputTopic() {
        return inputTopic;
    }

    public Stage setInputTopic(String inputTopic) {
        this.inputTopic = inputTopic;
        return this;
    }

    public Constants.Pipeline.inputType getOutputType() {
        return outputType;
    }

    public Stage setOutputType(Constants.Pipeline.inputType outputType) {
        this.outputType = outputType;
        return this;
    }

    public String getOutputModelName() {
        return outputModelName;
    }

    public Stage setOutputModelName(String outputModelName) {
        this.outputModelName = outputModelName;
        return this;
    }

    public Stage getNextStage() {
        return nextStage;
    }

    public Stage setNextStage(Stage nextStage) {
        this.nextStage = nextStage;
        return this;
    }

    public Set<StageParam> getStageParams() {
        return stageParams;
    }

    public Stage setStageParams(Set<StageParam> stageParams) {
        this.stageParams = stageParams;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stage stage = (Stage) o;

        if (id != null ? !id.equals(stage.id) : stage.id != null) return false;
        if (name != null ? !name.equals(stage.name) : stage.name != null) return false;
        if (className != null ? !className.equals(stage.className) : stage.className != null) return false;
        if (inputType != stage.inputType) return false;
        if (inputTopic != null ? !inputTopic.equals(stage.inputTopic) : stage.inputTopic != null) return false;
        if (outputType != stage.outputType) return false;
        if (outputModelName != null ? !outputModelName.equals(stage.outputModelName) : stage.outputModelName != null)
            return false;
        return nextStage != null ? nextStage.equals(stage.nextStage) : stage.nextStage == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (inputType != null ? inputType.hashCode() : 0);
        result = 31 * result + (inputTopic != null ? inputTopic.hashCode() : 0);
        result = 31 * result + (outputType != null ? outputType.hashCode() : 0);
        result = 31 * result + (outputModelName != null ? outputModelName.hashCode() : 0);
        result = 31 * result + (nextStage != null ? nextStage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", inputType=" + inputType +
                ", inputTopic='" + inputTopic + '\'' +
                ", outputType=" + outputType +
                ", outputModelName='" + outputModelName + '\'' +
                ", nextStage=" + nextStage +
                '}';
    }

}
