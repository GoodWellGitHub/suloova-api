package suloova.core.remote;

import suloova.model.ao.UserAo;
import suloova.model.vo.UserVo;

/**
 * Created by huajun.wang01 on 2018/10/21.
 */
public interface UserInfoRemote {
    UserAo queryUserInfo(UserVo userVo);
    Integer saveUser(UserAo userAo);
}
