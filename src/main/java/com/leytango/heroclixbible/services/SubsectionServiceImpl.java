package com.leytango.heroclixbible.services;

import com.leytango.heroclixbible.commons.CommonServiceImpl;
import com.leytango.heroclixbible.data.entities.Subsection;
import com.leytango.heroclixbible.data.repositories.ISubsectionDao;
import com.leytango.heroclixbible.services.iservices.ISubsectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsectionServiceImpl extends CommonServiceImpl<Subsection, ISubsectionDao> implements ISubsectionService {

    @Autowired
    public SubsectionServiceImpl(ISubsectionDao repository) {
        super(repository);
    }
}
