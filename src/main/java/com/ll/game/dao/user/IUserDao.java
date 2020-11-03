package com.ll.game.dao.user;

import com.ll.game.model.user.User4Login;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    User4Login login(@Param("user4Login") User4Login user4Login);

}
