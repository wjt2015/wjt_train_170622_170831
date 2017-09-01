package springInAction_c5;

import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author：jintao.wang Date: 17-7-31 Time: 下午8:36
 */
public class MyDaoImplTest {
    @Test
    public void func1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c5/c5_aop.xml");
        Object obj = ctx.getBean("mydao");
        MyDaoImpl myDao = (MyDaoImpl)obj;
        UserModel userModel = new UserModel(2,"ttz1498905067470","张宇Billy","Q138477","super_dev","Clinton",
                "正式","大住宿事业部","技术产品部","酒店技术中心","搜索排序技术部","搜索技术",
                new Byte((byte)1), DateTime.parse("2017-07-01T18:31:07"));
        System.out.println("userModel=" + userModel);
        List<UserModel> userModelList = myDao.queryUserList(userModel);
        System.out.println("userModelList=" + userModelList);
        int iret = myDao.updateUser(userModel);
//        iret = myDao.insertUser(userModel);
//        iret = myDao.deleteUser(userModel);
    }

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
//        `create_time` timestamp NOT NUL