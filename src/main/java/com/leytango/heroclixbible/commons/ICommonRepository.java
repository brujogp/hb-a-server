package com.leytango.heroclixbible.commons;

import com.leytango.heroclixbible.data.entities.PowerAndAbility;
import com.leytango.heroclixbible.data.entities.Section;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ICommonRepository<E> extends CrudRepository<E, Integer> {
    List<E> findByName(String name);

    List<E> findByNameContaining(String name);

    List<E> findByLanguage(String lang);

    List<E> findByLanguageOrderByOrderShowing(String lang);
}
