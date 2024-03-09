package com.aaa.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 黑马程序员
 * @since 2024-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tbl_log")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer id;


}
