package com.leytango.heroclixbible.data.repositories;

import com.leytango.heroclixbible.commons.ICommonRepository;
import com.leytango.heroclixbible.data.entities.PowerAndAbility;

import java.util.List;

public interface IPaaItemDao extends ICommonRepository<PowerAndAbility> {
    List<PowerAndAbility> findByAlternativeNameContaining(String term);
}
