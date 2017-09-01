package springInAction_c5;

import lombok.AllArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.transaction.TransactionDefinition;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author：jintao.wang Date: 17-7-31 Time: 下午7:47
 */
@AllArgsConstructor
public class MyDaoImpl implements MyDao {
    private SimpleJdbcTemplate jdbcTemplate;

    public List<UserModel> queryUserList(UserModel userModel) {
        String sqlStr = "SELECT * FROM user WHERE dep1=?";
        String dep1 = userModel.getDep1();
        return jdbcTemplate.query(sqlStr, new RowMapper<UserModel>(){
            public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException{
                UserModel userModel = new UserModel();
                userModel.setId(rs.getInt("id"));
                userModel.setRtxId(rs.getString("rtx_id"));
                userModel.setCn(rs.getString("cn"));
                userModel.setSn(rs.getString("sn"));
                userModel.setJobCode(rs.getString("job_code"));
                userModel.setLeader(rs.getString("leader"));
                userModel.setHireType("hire_type");
                userModel.setDep1(rs.getString("dep1"));
                userModel.setDep2(rs.getString("dep2"));
                userModel.setDep3(rs.getString("dep3"));
                userModel.setDep4(rs.getString("dep4"));
                userModel.setDep5(rs.getString("dep5"));
                userModel.setRole(rs.getByte("role"));
                Date date = rs.getDate("create_time");
                DateTime dt = new DateTime(date.getTime());
                userModel.setCreateTime(dt);
                return userModel;
            }
        },dep1);
    }

    public int updateUser(UserModel userModel) {
        String sqlStr = "UPDATE user SET cn=?,dep1=?,role=?,create_time=? WHERE id=?";
        return jdbcTemplate.update(sqlStr,userModel.getCn(),userModel.getDep1(),userModel.getRole(),userModel.getCreateTime().toDate(),userModel.getId());
    }

    public int deleteUser(UserModel userModel) {
        TransactionDefinition td;
        String sqlStr = "DELETE FROM user WHERE id=?";
        return jdbcTemplate.update(sqlStr,userModel.getId());
    }

    public int insertUser(UserModel userModel) {
        String sqlStr = "INSERT INTO user(rtx_id,cn,sn,job_code,leader,hire_type,dep1,dep2,dep3,dep4,dep5,role,create_time)" +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sqlStr,userModel.getRtxId(),userModel.getCn(),userModel.getSn(),userModel.getJobCode(),
                userModel.getLeader(),userModel.getHireType(),userModel.getDep1(),userModel.getDep2(),
                userModel.getDep3(),userModel.getDep4(),userModel.getDep5(),userModel.getRole(),userModel.getCreateTime());
    }
}

