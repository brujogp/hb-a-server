package com.leytango.heroclixbible.controllers.api.v1.jsonview;

import com.leytango.heroclixbible.commons.CommonController;
import com.leytango.heroclixbible.commons.ICommonService;
import com.leytango.heroclixbible.data.entities.Section;
import com.leytango.heroclixbible.services.SectionServicesImpl;
import com.leytango.heroclixbible.services.iservices.ISectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1/sections")
@RestController
public class SectionFinderController extends CommonController<Section, ISectionService> {

    public SectionFinderController(ISectionService service) {
        super(service);
    }

    @GetMapping("/{acronym}")
    public ResponseEntity<?> getSectionByLanguageAndAcronym(@PathVariable String acronym, @RequestHeader("Accept-Language") String language) {
        return ResponseEntity.ok().body(this.service.findByAcronymAndLanguage(acronym, language));
    }
}
