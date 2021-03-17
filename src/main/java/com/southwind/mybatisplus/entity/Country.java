package com.southwind.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leon.King
 * @since 2021-03-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Code")
    private String code;

    @TableField("Name")
    private String name;

    @TableField("Continent")
    private String continent;

    @TableField("Region")
    private String region;

    @TableField("SurfaceArea")
    private Float surfacearea;

    @TableField("IndepYear")
    private Integer indepyear;

    @TableField("Population")
    private Integer population;

    @TableField("LifeExpectancy")
    private Float lifeexpectancy;

    @TableField("GNP")
    private Float gnp;

    @TableField("GNPOld")
    private Float gnpold;

    @TableField("LocalName")
    private String localname;

    @TableField("GovernmentForm")
    private String governmentform;

    @TableField("HeadOfState")
    private String headofstate;

    @TableField("Capital")
    private Integer capital;

    @TableField("Code2")
    private String code2;


}
