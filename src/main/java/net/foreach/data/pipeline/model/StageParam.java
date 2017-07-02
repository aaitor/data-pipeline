package net.foreach.data.pipeline.model;

/**
 * Created by aitor on 2/7/17.
 */
public class StageParam {

    private String key;

    private String value;

    public StageParam(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StageParam that = (StageParam) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StageParam{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
