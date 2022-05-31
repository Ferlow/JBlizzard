package online.ferlow.jblizzard.entity.wowr.data;

import com.google.gson.annotations.SerializedName;

public class Asset {

    private String key, value;
    @SerializedName("file_data_id")
    private int fileDataId;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getFileDataId() {
        return fileDataId;
    }

    public void setFileDataId(int fileDataId) {
        this.fileDataId = fileDataId;
    }

    @Override
    public String toString() {
        return "Assets{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", fileDataId=" + fileDataId +
                '}';
    }
}
