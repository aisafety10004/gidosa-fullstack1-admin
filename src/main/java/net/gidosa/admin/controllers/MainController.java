package net.gidosa.admin.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.gidosa.admin.services.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static net.gidosa.admin.constants.UrlConsts.PREFIX_THYMELEAF_BASE;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {
    private final MainService mainService;

    @GetMapping
    public String index(Model model) {
        return PREFIX_THYMELEAF_BASE + "main/main";
    }
}
