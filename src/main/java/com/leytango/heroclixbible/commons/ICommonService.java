package com.leytango.heroclixbible.commons;

import java.util.List;


public interface ICommonService<E> {
    List<E> findByLanguage(String lang);

    List<E> findByContaining(String term);

    List<E> getByName(String name);

    List<E> findByLanguageOrderByList(String lang);
}
