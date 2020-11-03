package com.ll.game.service.user.impl;

import com.ll.game.common.MessageEnum;
import com.ll.game.dao.user.IUserDao;
import com.ll.game.model.user.User4Login;
import com.ll.game.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public MessageEnum login(User4Login user4Login) {
        User4Login user4Login1 = userDao.login(user4Login);
        System.out.println(user4Login);
        return MessageEnum.LOGIN_SUCCESS;
    }

}
