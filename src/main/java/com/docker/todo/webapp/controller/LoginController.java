/**
 * Sample Docker MVC Login controller.
 */

package com.docker.todo.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller class for login.
 * 
 * @author satya
 *
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login(final Model model) {
        // return "doto-list";
        System.out.println("login method ");
        return "forward:/todo/todolist";
    }

    /**
     * login form action handler.
     * 
     * @param userName - userName
     * @param password - Password
     * @param model    - Spring Model class
     * @return
     */
    @RequestMapping(value = "/loginform", method = RequestMethod.POST)
    public String login(@RequestParam(name = "userName", required = true) final String userName,
            @RequestParam(name = "password", required = true) final String password, final Model model) {

        System.out.println("User Name " + userName);
        System.out.println("Password " + password);
        if (userName != null && userName.trim().length() > 4) {
            return "list";
        } else {
            return "login";
        }
    }

    public String logout(@RequestParam(name = "userName", required = true) final String userName, final Model model) {
        return "home";
    }
}
