package com.leytango.heroclixbible.views;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component("section.epub")
public class EpubSections extends AbstractView {
    public EpubSections() {
        // setContentType("application/epub+zip");
        setContentType("image/jpeg");
    }

    @Override
    protected void renderMergedOutputModel(Map<String, Object> map, HttpServletRequest httpServletRequest,
                                           HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=\"test.jpg\"");
        httpServletResponse.setContentType(getContentType());
    }

    @Override
    protected boolean generatesDownloadContent() {
        return true;
    }
}
