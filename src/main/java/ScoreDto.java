import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class ScoreDto implements Serializable {
    @ApiModelProperty("股票代码")
    public String secuCode;
    @ApiModelProperty("市场类型")
    public String exchange;
    //其他值
    @ApiModelProperty("AI得分")
    public float aiScore;
    @ApiModelProperty("当日主力资金（超大单净流入+大单净流入）")
    public float mainNetIn;
    @ApiModelProperty("主力占比（超大单、大单成交量占总成交量比例）")
    public float mainRate;
    @ApiModelProperty("5日主力（5日超大单、大单净流入和）")
    public float fiveDayMainNetIn;
    @ApiModelProperty("5日涨幅（当前价对比[T-5日]收盘价）")
    public float fiveDayUpdownscope;
    //基本面
    @ApiModelProperty("净利润环比增长排名分位数")
    public int netProfitGrowRateRank;
    @ApiModelProperty("净利润环比增长排名分位数")
    public int netProfitMomRank;
    @ApiModelProperty("PE_TTM在个股历史PE_TTM中的排名分位数")
    public int pETllRank;
    //资金
    @ApiModelProperty("超大单净流入占比")
    public float superRate;
    @ApiModelProperty("大单净流入占比")
    public float largeRate;
    @ApiModelProperty("超大单净流入占比（标准化）")
    public float superRateStd;
    @ApiModelProperty("大单净流入占比(标准化)")
    public float largeRateStd;
    @ApiModelProperty("超大单净流入")
    public float superNetIn;
    @ApiModelProperty("大单净流入")
    public float largeNetIn;
    @ApiModelProperty("30分内主动净买额")
    public float thirdMinNetIn;
    @ApiModelProperty("30分内成交量")
    public float thirdMinVolume;
    @ApiModelProperty("30分主动净买入占成交量比例")
    public float thirdMinNetInRate;
    @ApiModelProperty("30分主动净买入占成交量比例（标准化）")
    public float thirdMinNetInRateStd;
    @ApiModelProperty("成交量")
    public float volume;
    @ApiModelProperty("时间")
    public String time;
    @ApiModelProperty("日期")
    public long date;
    //人气
    @ApiModelProperty("5日换手率在全市场的排名分位数")
    public float fiveChangHandRatio;
    @ApiModelProperty("5日总换手率")
    public float totalChangeRate;
    //均线
    @ApiModelProperty("组合成立的比例")
    public float maRatio;
    @ApiModelProperty("均线族排列")
    public String maInfo;
    //股性
    @ApiModelProperty("个股10日涨幅中最大的三个值的平均值")
    public float avgUpdownup;
    @ApiModelProperty("股性得分打败全市场排名分位数")
    public int stockNatureRankPercent;


    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getSecuCode() {
        return secuCode;
    }

    public void setSecuCode(String secuCode) {
        this.secuCode = secuCode;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public float getAiScore() {
        return aiScore;
    }

    public void setAiScore(float aiScore) {
        this.aiScore = aiScore;
    }

    public float getMainNetIn() {
        return mainNetIn;
    }

    public void setMainNetIn(float mainNetIn) {
        this.mainNetIn = mainNetIn;
    }

    public float getMainRate() {
        return mainRate;
    }

    public void setMainRate(float mainRate) {
        this.mainRate = mainRate;
    }

    public float getFiveDayMainNetIn() {
        return fiveDayMainNetIn;
    }

    public void setFiveDayMainNetIn(float fiveDayMainNetIn) {
        this.fiveDayMainNetIn = fiveDayMainNetIn;
    }

    public float getFiveDayUpdownscope() {
        return fiveDayUpdownscope;
    }

    public void setFiveDayUpdownscope(float fiveDayUpdownscope) {
        this.fiveDayUpdownscope = fiveDayUpdownscope;
    }

    public int getNetProfitGrowRateRank() {
        return netProfitGrowRateRank;
    }

    public void setNetProfitGrowRateRank(int netProfitGrowRateRank) {
        this.netProfitGrowRateRank = netProfitGrowRateRank;
    }

    public int getNetProfitMomRank() {
        return netProfitMomRank;
    }

    public void setNetProfitMomRank(int netProfitMomRank) {
        this.netProfitMomRank = netProfitMomRank;
    }

    public int getpETllRank() {
        return pETllRank;
    }

    public void setpETllRank(int pETllRank) {
        this.pETllRank = pETllRank;
    }

    public float getSuperRate() {
        return superRate;
    }

    public void setSuperRate(float superRate) {
        this.superRate = superRate;
    }

    public float getLargeRate() {
        return largeRate;
    }

    public void setLargeRate(float largeRate) {
        this.largeRate = largeRate;
    }

    public float getSuperRateStd() {
        return superRateStd;
    }

    public void setSuperRateStd(float superRateStd) {
        this.superRateStd = superRateStd;
    }

    public float getLargeRateStd() {
        return largeRateStd;
    }

    public void setLargeRateStd(float largeRateStd) {
        this.largeRateStd = largeRateStd;
    }

    public float getSuperNetIn() {
        return superNetIn;
    }

    public void setSuperNetIn(float superNetIn) {
        this.superNetIn = superNetIn;
    }

    public float getLargeNetIn() {
        return largeNetIn;
    }

    public void setLargeNetIn(float largeNetIn) {
        this.largeNetIn = largeNetIn;
    }

    public float getThirdMinNetIn() {
        return thirdMinNetIn;
    }

    public void setThirdMinNetIn(float thirdMinNetIn) {
        this.thirdMinNetIn = thirdMinNetIn;
    }

    public float getThirdMinVolume() {
        return thirdMinVolume;
    }

    public void setThirdMinVolume(float thirdMinVolume) {
        this.thirdMinVolume = thirdMinVolume;
    }

    public float getThirdMinNetInRate() {
        return thirdMinNetInRate;
    }

    public void setThirdMinNetInRate(float thirdMinNetInRate) {
        this.thirdMinNetInRate = thirdMinNetInRate;
    }

    public float getThirdMinNetInRateStd() {
        return thirdMinNetInRateStd;
    }

    public void setThirdMinNetInRateStd(float thirdMinNetInRateStd) {
        this.thirdMinNetInRateStd = thirdMinNetInRateStd;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getFiveChangHandRatio() {
        return fiveChangHandRatio;
    }

    public void setFiveChangHandRatio(float fiveChangHandRatio) {
        this.fiveChangHandRatio = fiveChangHandRatio;
    }

    public float getTotalChangeRate() {
        return totalChangeRate;
    }

    public void setTotalChangeRate(float totalChangeRate) {
        this.totalChangeRate = totalChangeRate;
    }

    public float getMaRatio() {
        return maRatio;
    }

    public void setMaRatio(float maRatio) {
        this.maRatio = maRatio;
    }

    public String getMaInfo() {
        return maInfo;
    }

    public void setMaInfo(String maInfo) {
        this.maInfo = maInfo;
    }

    public float getAvgUpdownup() {
        return avgUpdownup;
    }

    public void setAvgUpdownup(float avgUpdownup) {
        this.avgUpdownup = avgUpdownup;
    }

    public int getStockNatureRankPercent() {
        return stockNatureRankPercent;
    }

    public void setStockNatureRankPercent(int stockNatureRankPercent) {
        this.stockNatureRankPercent = stockNatureRankPercent;
    }
}
