package net.foreach.data.pipeline.utils;

import java.util.UUID;

/**
 * Created by aitor on 2/7/17.
 */
public abstract class PipelineHelpers {

    public static String generateStageUUID()    {
        return generateCommonUUID();
    }

    public static String generatePipelineUUID()    {
        return generateCommonUUID();
    }

    private static String generateCommonUUID() {
        return UUID.randomUUID().toString();
    }
}
