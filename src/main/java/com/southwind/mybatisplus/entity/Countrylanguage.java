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
public class Countrylanguage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CountryCode")
    private String countrycode;

    @TableField("Language")
    private String language;

    @TableField("IsOfficial")
    private String isofficial;

    @TableField("Percentage")
    private Float percentage;


}
