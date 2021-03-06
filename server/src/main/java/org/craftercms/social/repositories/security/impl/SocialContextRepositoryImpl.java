/*
 * Copyright (C) 2007-${year} Crafter Software Corporation.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.social.repositories.security.impl;

import org.craftercms.commons.mongo.AbstractJongoRepository;
import org.craftercms.commons.mongo.MongoDataException;
import org.craftercms.social.domain.social.system.SocialContext;
import org.craftercms.social.repositories.SocialContextRepository;

/**
 *
 */
public class SocialContextRepositoryImpl extends AbstractJongoRepository<SocialContext> implements
    SocialContextRepository {

    public SocialContextRepositoryImpl() {
        super();
    }

    @Override
    public SocialContext findById(final String id) throws MongoDataException {
        String query = getQueryFor("social.context.byId");
        return findOne(query, id);
    }
}
