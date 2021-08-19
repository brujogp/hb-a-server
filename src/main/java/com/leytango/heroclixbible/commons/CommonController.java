package com.leytango.heroclixbible.commons;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {
        "https://www.heroclixbible.com",
        "https://m.heroclixbible.com",
        "https://heroclix-bible-test.web.app",
})
public class CommonController<E, S extends ICommonService<E>> {
    protected S service;

    public CommonController(S service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<?> getByLanguage(@RequestHeader("Accept-Language") String language) {
        return ResponseEntity.ok().body(service.findByLanguage(language));
    }


    @GetMapping()
    public ResponseEntity<?> getByName(@RequestParam String q) {
        return ResponseEntity.ok().body(this.service.findByContaining(q));
    }


}
