package com.leytango.heroclixbible.services;

import com.leytango.heroclixbible.commons.CommonServiceImpl;
import com.leytango.heroclixbible.data.entities.PowerAndAbility;
import com.leytango.heroclixbible.data.repositories.IPaaItemDao;
import com.leytango.heroclixbible.services.iservices.IPaaItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaaItemServiceImpl extends CommonServiceImpl<PowerAndAbility, IPaaItemDao> implements IPaaItemService {
    @Autowired
    public PaaItemServiceImpl(IPaaItemDao repository) {
        super(repository);
    }

    @Override
    public List<PowerAndAbility> findByAlternativeName(String term) {
        return this.repository.findByAlternativeNameContaining(term);
    }
}
