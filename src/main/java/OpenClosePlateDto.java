import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class OpenClosePlateDto implements Serializable {
    @ApiModelProperty("封板时间 HHmmss")
    private String sealPlateTime = "-";
    @ApiModelProperty("开板时间 HHmmss")
    private String openPlateTime = "-";
    @ApiModelProperty("持续时间 s")
    private String duration = "-";
    @ApiModelProperty("首次封单量")
    private float firstSealNum;
    @ApiModelProperty("首次封成比")
    private float firstSealRatio;
    @ApiModelProperty("最高封单量")
    private float maxSealNum;
    @ApiModelProperty("最高封成比")
    private float maxSealRatio;

    public String getSealPlateTime() {
        return sealPlateTime;
    }

    public void setSealPlateTime(String sealPlateTime) {
        this.sealPlateTime = sealPlateTime;
    }

    public String getOpenPlateTime() {
        return openPlateTime;
    }

    public void setOpenPlateTime(String openPlateTime) {
        this.openPlateTime = openPlateTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public float getFirstSealNum() {
        return firstSealNum;
    }

    public void setFirstSealNum(float firstSealNum) {
        this.firstSealNum = firstSealNum;
    }

    public float getFirstSealRatio() {
        return firstSealRatio;
    }

    public void setFirstSealRatio(float firstSealRatio) {
        this.firstSealRatio = firstSealRatio;
    }

    public float getMaxSealNum() {
        return maxSealNum;
    }

    public void setMaxSealNum(float maxSealNum) {
        this.maxSealNum = maxSealNum;
    }

    public float getMaxSealRatio() {
        return maxSealRatio;
    }

    public void setMaxSealRatio(float maxSealRatio) {
        this.maxSealRatio = maxSealRatio;
    }
}