package com.example.orderbackv1.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName goods_detail
 */
@TableName(value ="goods_detail")
@Data
public class GoodsDetail implements Serializable {
    /**
     * 
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    /**
     * 
     */
    private String goodsName;

    /**
     * 
     */
    private BigDecimal goodsPrice;

    /**
     * 
     */
    private Integer goodsNumber;

    /**
     * 
     */
    private Integer goodsWeight;

    /**
     * 
     */
    private String goodsIntroduce;

    /**
     * 
     */
    private Integer goodsDeleted;

    /**
     * 
     */
    private Integer goodsState;

    /**
     * 
     */
    private String goodsCat;

    /**
     * 
     */
    private String picUrl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GoodsDetail other = (GoodsDetail) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsPrice() == null ? other.getGoodsPrice() == null : this.getGoodsPrice().equals(other.getGoodsPrice()))
            && (this.getGoodsNumber() == null ? other.getGoodsNumber() == null : this.getGoodsNumber().equals(other.getGoodsNumber()))
            && (this.getGoodsWeight() == null ? other.getGoodsWeight() == null : this.getGoodsWeight().equals(other.getGoodsWeight()))
            && (this.getGoodsIntroduce() == null ? other.getGoodsIntroduce() == null : this.getGoodsIntroduce().equals(other.getGoodsIntroduce()))
            && (this.getGoodsDeleted() == null ? other.getGoodsDeleted() == null : this.getGoodsDeleted().equals(other.getGoodsDeleted()))
            && (this.getGoodsState() == null ? other.getGoodsState() == null : this.getGoodsState().equals(other.getGoodsState()))
            && (this.getGoodsCat() == null ? other.getGoodsCat() == null : this.getGoodsCat().equals(other.getGoodsCat()))
            && (this.getPicUrl() == null ? other.getPicUrl() == null : this.getPicUrl().equals(other.getPicUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsPrice() == null) ? 0 : getGoodsPrice().hashCode());
        result = prime * result + ((getGoodsNumber() == null) ? 0 : getGoodsNumber().hashCode());
        result = prime * result + ((getGoodsWeight() == null) ? 0 : getGoodsWeight().hashCode());
        result = prime * result + ((getGoodsIntroduce() == null) ? 0 : getGoodsIntroduce().hashCode());
        result = prime * result + ((getGoodsDeleted() == null) ? 0 : getGoodsDeleted().hashCode());
        result = prime * result + ((getGoodsState() == null) ? 0 : getGoodsState().hashCode());
        result = prime * result + ((getGoodsCat() == null) ? 0 : getGoodsCat().hashCode());
        result = prime * result + ((getPicUrl() == null) ? 0 : getPicUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsWeight=").append(goodsWeight);
        sb.append(", goodsIntroduce=").append(goodsIntroduce);
        sb.append(", goodsDeleted=").append(goodsDeleted);
        sb.append(", goodsState=").append(goodsState);
        sb.append(", goodsCat=").append(goodsCat);
        sb.append(", picUrl=").append(picUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}