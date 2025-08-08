package io.github.Guimaraes131.super_poderes_inuteis.superPoder;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/poderes")
public class SuperPoderController {

    private final SuperPoderService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("superpoderes", service.index());
        return "index";
    }
}
