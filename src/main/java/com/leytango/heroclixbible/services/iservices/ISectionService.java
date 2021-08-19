package com.leytango.heroclixbible.services.iservices;

import com.leytango.heroclixbible.commons.ICommonService;
import com.leytango.heroclixbible.data.entities.PowerAndAbility;
import com.leytango.heroclixbible.data.entities.Section;

/*
 *  Interfaz para la generalización de servicios que tratan con DAOs, repositorios o alguina
 */

public interface ISectionService extends ICommonService<Section> {
    Section findByAcronymAndLanguage(String acronym, String language);
}
