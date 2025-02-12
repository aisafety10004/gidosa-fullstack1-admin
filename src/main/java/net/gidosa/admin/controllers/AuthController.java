package net.gidosa.admin.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.gidosa.admin.services.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static net.gidosa.admin.constants.UrlConsts.PREFIX_THYMELEAF_BASE;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @GetMapping("/login")
    public String login(Model model) {
        String test1 = authService.test1();

        model.addAttribute("test1", test1);
        return PREFIX_THYMELEAF_BASE + "auth/login";
    }

    @GetMapping("/login2")
    public String login2(Model model) {
        return "auth/login";
//        return "index2";
    }
}
