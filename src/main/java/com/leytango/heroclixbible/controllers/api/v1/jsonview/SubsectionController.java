package com.leytango.heroclixbible.controllers.api.v1.jsonview;

import com.leytango.heroclixbible.commons.CommonController;
import com.leytango.heroclixbible.data.entities.Subsection;
import com.leytango.heroclixbible.services.iservices.ISubsectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/subsections")
public class SubsectionController extends CommonController<Subsection, ISubsectionService> {
    @Autowired
    public SubsectionController(ISubsectionService service) {
        super(service);
    }
}
