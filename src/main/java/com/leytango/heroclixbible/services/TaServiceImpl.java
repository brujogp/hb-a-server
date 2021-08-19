package com.leytango.heroclixbible.services;

import com.leytango.heroclixbible.commons.CommonServiceImpl;
import com.leytango.heroclixbible.data.entities.TeamAbility;
import com.leytango.heroclixbible.data.repositories.ITaDao;
import com.leytango.heroclixbible.services.iservices.ITaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaServiceImpl extends CommonServiceImpl<TeamAbility, ITaDao> implements ITaService {

    @Autowired
    public TaServiceImpl(ITaDao repository) {
        super(repository);
    }
}
