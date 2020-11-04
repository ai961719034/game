package com.ll.game.service.user;

import com.ll.game.common.MessageEnum;
import com.ll.game.model.user.User4Login;

public interface IUserService {


    Enum<MessageEnum> login(User4Login user4Login);

}
