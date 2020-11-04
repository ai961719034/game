package com.ll.game.controller.user;

import com.ll.game.common.MessageEnum;
import com.ll.game.model.user.User4Login;
import com.ll.game.service.user.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private IUserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public Enum<MessageEnum> login(User4Login user4Login) {
        return userService.login(user4Login);
    }

}
