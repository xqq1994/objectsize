import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(value = "com.tgw360.entity.slave.PerformancePool")
public class PerformancePool implements Serializable {
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "投顾id")
    private Long teacherId;

    @ApiModelProperty(value = "股票代码")
    private String secuCode;

    @ApiModelProperty(value = "市场类型 1sz 2sh")
    private Integer market;

    @ApiModelProperty(value = "工作室id")
    private Integer roomId;

    @ApiModelProperty(value = "池子类型")
    private Integer poolType;

    @ApiModelProperty(value = "产品id")
    private Long productId;

    @ApiModelProperty(value = "产品子类型")
    private Long productType;

    @ApiModelProperty(value = "标签")
    private String label;

    @ApiModelProperty(value = "seq")
    private Long seq;

    @ApiModelProperty(value = "状态1在池 2出池")
    private Integer status;

    @ApiModelProperty(value = "入池时间")
    private Long chooseTime;

    @ApiModelProperty(value = "入池价格")
    private BigDecimal choosePrice = BigDecimal.ZERO;

    @ApiModelProperty(value = "平均成本")
    private BigDecimal avgPrice = BigDecimal.ZERO;

    @ApiModelProperty(value = "出池价格")
    private BigDecimal endPrice = new BigDecimal("-1");

    @ApiModelProperty(value = "出池时间")
    private Long endTime = -1L;

    @ApiModelProperty(value = "最大涨跌幅")
    private BigDecimal maxZdf = BigDecimal.ZERO;

    @ApiModelProperty(value = "null")
    private String xrDrXd = "";

    @ApiModelProperty(value = "创建时间")
    private Long createTime;

    @ApiModelProperty(value = "修改时间")
    private Long updateTime;

    @ApiModelProperty(value = "是否有效")
    private Integer isEnable;

    private BigDecimal t1MaxZdf = BigDecimal.ZERO;

    private BigDecimal t3MaxZdf = BigDecimal.ZERO;

    private BigDecimal t5MaxZdf = BigDecimal.ZERO;

    private BigDecimal t10MaxZdf = BigDecimal.ZERO;

    private BigDecimal t20MaxZdf = BigDecimal.ZERO;

    private BigDecimal t60MaxZdf = BigDecimal.ZERO;

    private BigDecimal t120MaxZdf = BigDecimal.ZERO;

    private BigDecimal t1OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t3OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t5OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t10OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t20OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t60OpenMaxZdf = BigDecimal.ZERO;

    private BigDecimal t120OpenMaxZdf = BigDecimal.ZERO;

    private Integer cycle;

    private BigDecimal t1MaxPrice = BigDecimal.ZERO;

    private BigDecimal t3MaxPrice = BigDecimal.ZERO;

    private BigDecimal t5MaxPrice = BigDecimal.ZERO;

    private BigDecimal t10MaxPrice = BigDecimal.ZERO;

    private BigDecimal t20MaxPrice = BigDecimal.ZERO;

    private BigDecimal t60MaxPrice = BigDecimal.ZERO;

    private BigDecimal t120MaxPrice = BigDecimal.ZERO;

    private BigDecimal openPrice = BigDecimal.ZERO;

    private BigDecimal maxPrice = BigDecimal.ZERO;


}