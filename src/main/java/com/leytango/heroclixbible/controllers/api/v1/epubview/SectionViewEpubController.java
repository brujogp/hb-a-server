package com.leytango.heroclixbible.controllers.api.v1.epubview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SectionViewEpubController {
    @GetMapping(value = "/v1/content/section.epub")
    public String sections() {
        return "section.epub";
    }
}
