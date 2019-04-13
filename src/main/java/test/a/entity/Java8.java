package test.a.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.Api;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hutao123
 * @since 2019-04-13
 */
@Data
@Api(tags = "Java8" , description = "")
@TableName("java8")
public class Java8 extends Model<Java8> {

private static final long serialVersionUID=1L;


        @TableField("java8_date")
        private LocalDate java8Date;

        @TableField("java8_time")
        private LocalTime java8Time;

        @TableField("java8_date_time")
        private LocalDateTime java8DateTime;

        @TableField("id")
        private Integer id;


@Override
protected Serializable pkVal(){
            return this.id;
        }

        }
