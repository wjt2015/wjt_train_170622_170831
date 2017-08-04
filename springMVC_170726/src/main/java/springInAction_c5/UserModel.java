package springInAction_c5;

//import java.util.Locale;
//import org.joda.time.DateTime;
//import org.joda.time.Days;
//import org.joda.time.LocalDate;
//import org.joda.time.format.DateTimeFormat;
//import org.joda.time.format.DateTimeFormatter;

import lombok.*;
import org.joda.time.DateTime;

/**
 * @author：jintao.wang Date: 17-7-31 Time: 下午7:27
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {
    private Integer id;
    private String rtxId;
    private String cn;
    private String sn;
    private String jobCode;
    private String leader;
    private String hireType;
    private String dep1;
    private String dep2;
    private String dep3;
    private String dep4;
    private String dep5;
    private Byte role;
    private DateTime createTime;
}
//`id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
//        `rtx_id` varchar(30) NOT NULL DEFAULT '' COMMENT 'qtalk，与大讲堂数据表名称一致，唯一性约束条件,例如：wangliang.wang',
//        `cn` varchar(20) NOT NULL DEFAULT '' COMMENT '姓名,在职员工中唯一标识符, 与大讲堂数据表名称一致，例如：张宇Billy',
//        `sn` varchar(20) NOT NULL DEFAULT '' COMMENT '例如:Q138477',
//        `job_code` varchar(20) NOT NULL DEFAULT '' COMMENT '职位编码，例如：dev,qa',
//        `leader` varchar(50) NOT NULL DEFAULT '' COMMENT 'leader的名字 : 陆艳',
//        `hire_type` varchar(20) NOT NULL DEFAULT '' COMMENT '用工类型，正式/实习',
//        `dep1` varchar(20) NOT NULL DEFAULT '' COMMENT '一级部门',
//        `dep2` varchar(20) NOT NULL DEFAULT '' COMMENT '二级部门',
//        `dep3` varchar(20) NOT NULL DEFAULT '' COMMENT '三级部门',
//        `dep4` varchar(20) NOT NULL DEFAULT '' COMMENT '四级部门',
//        `dep5` varchar(20) NOT NULL DEFAULT '' COMMENT '五级部门',
//        `role` tinyint(3) unsigned DEFAULT '1' COMMENT '0:系统管理员,1:普通管理员,2:部门管理员,3:普通用户',
//        `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',