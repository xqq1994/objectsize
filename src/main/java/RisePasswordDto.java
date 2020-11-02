import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Deque;
import java.util.List;

@ApiModel
public class RisePasswordDto implements Serializable {
    @ApiModelProperty("股票代码")
    private String secuCode;
    @ApiModelProperty("市场类型")
    private String market;
    @ApiModelProperty("股票名称")
    private String secuName;
    @ApiModelProperty("涨跌类型 1一字板 2T字板 3换手板 4涨停开板池 5跌停 6跌停开板")
    private int upDownType;
    @ApiModelProperty("现价")
    private float nowPrice;
    @ApiModelProperty("涨跌幅")
    private float updownscope;
    @ApiModelProperty("换手率")
    private float changeRate;
    @ApiModelProperty("首次封板时间")
    private String firstSealTime;
    @ApiModelProperty("最后封板时间")
    private String lastSealTime;
    @ApiModelProperty("最新封成量")
    private float latestSealNum;
    @ApiModelProperty("最新封成比")
    private float latestSealRatio;
    @ApiModelProperty("开板数")
    private int openPlateNum;
    @ApiModelProperty("连板数")
    private int seriesPlateNum;
    @ApiModelProperty("几天几板")
    private String seriesPlateInfo;
    @ApiModelProperty("打板分数")
    private int score;
    @ApiModelProperty("流通市值")
    private float flowvalue;
    @ApiModelProperty("总市值")
    private float sumvalue;
    @ApiModelProperty("开板封板信息列表（涨停）")
    private List<OpenClosePlateDto> risePlateList = Lists.newArrayList();
    @ApiModelProperty("开板封板信息列表（跌停）")
    private List<OpenClosePlateDto> dropPlateList = Lists.newArrayList();
    @ApiModelProperty("日期 yyyyMMdd")
    private String date;
    @ApiModelProperty("时间")
    private String time;
    @ApiModelProperty("天数")
    public int dayNum;
    @ApiModelProperty("几板")
    public int plateNum;
    @ApiModelProperty("一字板数")
    public int onePlateNum;
    @ApiModelProperty("日均换手率")
    public float avgChangeRate;
    @ApiModelProperty("天数")
    public int days;

    public String getSecuCode() {
        return secuCode;
    }

    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getSecuName() {
        return secuName;
    }

    public void setSecuName(String secuName) {
        this.secuName = secuName;
    }

    public int getUpDownType() {
        return upDownType;
    }

    public void setUpDownType(int upDownType) {
        this.upDownType = upDownType;
    }

    public float getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(float nowPrice) {
        this.nowPrice = nowPrice;
    }

    public float getUpdownscope() {
        return updownscope;
    }

    public void setUpdownscope(float updownscope) {
        this.updownscope = updownscope;
    }

    public float getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(float changeRate) {
        this.changeRate = changeRate;
    }

    public String getFirstSealTime() {
        return firstSealTime;
    }

    public void setFirstSealTime(String firstSealTime) {
        this.firstSealTime = firstSealTime;
    }

    public String getLastSealTime() {
        return lastSealTime;
    }

    public void setLastSealTime(String lastSealTime) {
        this.lastSealTime = lastSealTime;
    }

    public float getLatestSealNum() {
        return latestSealNum;
    }

    public void setLatestSealNum(float latestSealNum) {
        this.latestSealNum = latestSealNum;
    }

    public float getLatestSealRatio() {
        return latestSealRatio;
    }

    public void setLatestSealRatio(float latestSealRatio) {
        this.latestSealRatio = latestSealRatio;
    }

    public int getOpenPlateNum() {
        return openPlateNum;
    }

    public void setOpenPlateNum(int openPlateNum) {
        this.openPlateNum = openPlateNum;
    }

    public int getSeriesPlateNum() {
        return seriesPlateNum;
    }

    public void setSeriesPlateNum(int seriesPlateNum) {
        this.seriesPlateNum = seriesPlateNum;
    }

    public String getSeriesPlateInfo() {
        return seriesPlateInfo;
    }

    public void setSeriesPlateInfo(String seriesPlateInfo) {
        this.seriesPlateInfo = seriesPlateInfo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getFlowvalue() {
        return flowvalue;
    }

    public void setFlowvalue(float flowvalue) {
        this.flowvalue = flowvalue;
    }

    public float getSumvalue() {
        return sumvalue;
    }

    public void setSumvalue(float sumvalue) {
        this.sumvalue = sumvalue;
    }

    public List<OpenClosePlateDto> getRisePlateList() {
        return risePlateList;
    }

    public void setRisePlateList(List<OpenClosePlateDto> risePlateList) {
        this.risePlateList = risePlateList;
    }

    public List<OpenClosePlateDto> getDropPlateList() {
        return dropPlateList;
    }

    public void setDropPlateList(List<OpenClosePlateDto> dropPlateList) {
        this.dropPlateList = dropPlateList;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(int plateNum) {
        this.plateNum = plateNum;
    }

    public int getOnePlateNum() {
        return onePlateNum;
    }

    public void setOnePlateNum(int onePlateNum) {
        this.onePlateNum = onePlateNum;
    }

    public float getAvgChangeRate() {
        return avgChangeRate;
    }

    public void setAvgChangeRate(float avgChangeRate) {
        this.avgChangeRate = avgChangeRate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
