package com.ll.game.service.user;

import com.ll.game.common.ServerResponse;
import com.ll.game.model.user.User4Login;

import javax.servlet.http.HttpServletRequest;

public interface IUserService {


    ServerResponse login(User4Login user4Login, HttpServletRequest request);

}
