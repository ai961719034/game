package com.ll.game.service.user.impl;

import com.ll.game.common.MessageEnum;
import com.ll.game.common.ServerResponse;
import com.ll.game.dao.user.IUserDao;
import com.ll.game.model.user.User4Login;
import com.ll.game.service.user.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public ServerResponse login(User4Login user4Login, HttpServletRequest request) {
        String username = user4Login.getUsername();
        String password = user4Login.getPassword();
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return ServerResponse.singleMessage(MessageEnum.USERNAME_OR_PASSWORD_IS_NULL);
        }

        User4Login user4Login1 = userDao.login(user4Login);
        if(null == user4Login1) {
            return ServerResponse.singleMessage(MessageEnum.USER_NOT_FOUND);
        }

        HttpSession session = request.getSession();
        request.setAttribute("user4Login", user4Login1);
        session.setAttribute("user4Login", user4Login1);
        return ServerResponse.singleMessage(MessageEnum.LOGIN_SUCCESS);
    }

}
