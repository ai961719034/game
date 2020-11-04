package com.ll.game.service.user.impl;

import com.ll.game.common.MessageEnum;
import com.ll.game.dao.user.IUserDao;
import com.ll.game.model.user.User4Login;
import com.ll.game.service.user.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public Enum<MessageEnum> login(User4Login user4Login) {
        String username = user4Login.getUsername();
        String password = user4Login.getPassword();
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return MessageEnum.USERNAME_OR_PASSWORD_IS_NULL;
        }

        User4Login user4Login1 = userDao.login(user4Login);
        if(null == user4Login1) {
            return MessageEnum.USER_NOT_FOUND;
        }
        return MessageEnum.LOGIN_SUCCESS;
    }

}
