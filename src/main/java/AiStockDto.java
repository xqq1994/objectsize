import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel
public class AiStockDto extends ScoreDto implements Serializable {
    @ApiModelProperty("当前收益")
    private float returnRate;
    @ApiModelProperty("涨幅")
    private float updownscope;
    @ApiModelProperty("行业")
    public String industry;
    @ApiModelProperty("入选时间")
    private String choseTime;
    @ApiModelProperty("入选价格")
    public float chosePrice;
    @ApiModelProperty("现价")
    private float nowPrice;
    @ApiModelProperty("换手")
    private float changRate;
    @ApiModelProperty("量比")
    private float quantityRate;
    @ApiModelProperty("流通市值")
    private float flowvalue;

    public float getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(float returnRate) {
        this.returnRate = returnRate;
    }

    public float getUpdownscope() {
        return updownscope;
    }

    public void setUpdownscope(float updownscope) {
        this.updownscope = updownscope;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getChoseTime() {
        return choseTime;
    }

    public void setChoseTime(String choseTime) {
        this.choseTime = choseTime;
    }

    public float getChosePrice() {
        return chosePrice;
    }

    public void setChosePrice(float chosePrice) {
        this.chosePrice = chosePrice;
    }

    public float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(float nowPrice) {
        this.nowPrice = nowPrice;
    }

    public float getChangRate() {
        return changRate;
    }

    public void setChangRate(float changRate) {
        this.changRate = changRate;
    }

    public float getQuantityRate() {
        return quantityRate;
    }

    public void setQuantityRate(float quantityRate) {
        this.quantityRate = quantityRate;
    }

    public float getFlowvalue() {
        return flowvalue;
    }

    public void setFlowvalue(float flowvalue) {
        this.flowvalue = flowvalue;
    }
}
