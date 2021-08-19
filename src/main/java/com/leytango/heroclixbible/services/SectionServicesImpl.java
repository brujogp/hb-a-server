package com.leytango.heroclixbible.services;

import com.leytango.heroclixbible.commons.CommonServiceImpl;
import com.leytango.heroclixbible.data.entities.Section;
import com.leytango.heroclixbible.data.repositories.ISectionDao;
import com.leytango.heroclixbible.services.iservices.ISectionService;
import org.springframework.stereotype.Service;

@Service
public class SectionServicesImpl extends CommonServiceImpl<Section, ISectionDao> implements ISectionService {

    public SectionServicesImpl(ISectionDao repository) {
        super(repository);
    }

    public Section findByAcronymAndLanguage(String acronym, String lang) {
        return this.repository.findByAcronymAndLanguage(acronym, lang);
    }
}
