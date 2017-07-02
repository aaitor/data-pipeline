package net.foreach.data.pipeline.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by aitor on 2/7/17.
 */
public class PipelineConf {

    private Set<PipelineParam> pipelineParams= new HashSet<>();

    public PipelineConf() {
    }

    public PipelineConf(Set<PipelineParam> pipelineParams) {
        this.pipelineParams = pipelineParams;
    }

    public Set<PipelineParam> getPipelineParams() {
        return pipelineParams;
    }

    public PipelineConf setPipelineParams(Set<PipelineParam> pipelineParams) {
        this.pipelineParams = pipelineParams;
        return this;
    }

}
