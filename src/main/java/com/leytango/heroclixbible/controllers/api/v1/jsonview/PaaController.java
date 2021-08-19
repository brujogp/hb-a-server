package com.leytango.heroclixbible.controllers.api.v1.jsonview;

import com.leytango.heroclixbible.commons.CommonController;
import com.leytango.heroclixbible.data.entities.PowerAndAbility;
import com.leytango.heroclixbible.services.PaaItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1/paa")
public class PaaController extends CommonController<PowerAndAbility, PaaItemServiceImpl> {
    @Autowired
    public PaaController(PaaItemServiceImpl service) {
        super(service);
    }

    @GetMapping("/alternative")
    public ResponseEntity<?> paaFinderAlternativeName(@RequestParam String q) {
        return ResponseEntity.ok().body(this.service.findByAlternativeName(q));
    }
}
