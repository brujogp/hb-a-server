package com.leytango.heroclixbible.commons;

import java.util.List;

public class CommonServiceImpl<E, R extends ICommonRepository<E>> implements ICommonService<E> {
    protected R repository;

    public CommonServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public List<E> findByLanguage(String lang) {
        return this.repository.findByLanguage(lang);
    }

    @Override
    public List<E> findByContaining(String term) {
        return this.repository.findByNameContaining(term);
    }

    @Override
    public List<E> getByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public List<E> findByLanguageOrderByList(String lang) {
        return this.repository.findByLanguageOrderByOrderShowing(lang);
    }

}
