package com.leytango.heroclixbible.data.repositories;

import com.leytango.heroclixbible.commons.ICommonRepository;
import com.leytango.heroclixbible.data.entities.Section;

/*
 *  Interfaz para la extensión de CrudRepository
 */

public interface ISectionDao extends ICommonRepository<Section> {
    Section findByAcronymAndLanguage(String acrony, String lang);
}
