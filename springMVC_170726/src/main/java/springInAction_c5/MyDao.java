package springInAction_c5;

import java.util.List;

/**
 * @author：jintao.wang Date: 17-7-31 Time: 下午7:27
 */
public interface MyDao {
    List<UserModel> queryUserList(UserModel userModel);
    int updateUser(UserModel userModel);
    int deleteUser(UserModel userModel);
    int insertUser(UserModel userModel);
}








