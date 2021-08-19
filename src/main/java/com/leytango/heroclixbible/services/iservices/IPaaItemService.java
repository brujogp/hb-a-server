package com.leytango.heroclixbible.services.iservices;

import com.leytango.heroclixbible.commons.ICommonService;
import com.leytango.heroclixbible.data.entities.PowerAndAbility;

import java.util.List;

public interface IPaaItemService extends ICommonService<PowerAndAbility> {
    List<PowerAndAbility> findByAlternativeName(String term);
}
