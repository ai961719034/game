package com.ll.game.controller.user;

import com.ll.game.common.ServerResponse;
import com.ll.game.model.user.User4Login;
import com.ll.game.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户相关的Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private IUserService userService;

    @Autowired
    private HttpServletRequest request;

    /**
     * 处理登录
     * @param user4Login 前台传过来的用户登录信息
     * @return 是否登录成功信息
     */
    @RequestMapping("/login")
    @ResponseBody
    public ServerResponse login(User4Login user4Login) {
        return userService.login(user4Login, request);
    }

    @RequestMapping(value = "/get_user_login_info", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse getUserLoginInfo() {
        HttpSession session = request.getSession();
        Object user4Login = session.getAttribute("user4Login");
        return ServerResponse.getServerResponseData(user4Login);
    }

    @RequestMapping(value = "/to_login")
    public String toLogin() {
        return "login.html";
    }

}
