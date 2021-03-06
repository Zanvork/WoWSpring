/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zanvork.wowspring.model.DAO;

import com.zanvork.wowspring.model.Realm;
import com.zanvork.wowspring.model.enums.Regions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jgreeman
 */
@Transactional
public interface RealmHibernateDAO extends CrudRepository<Realm, Long>{
    
    
    public Realm findByRegionAndSlug(Regions region, String slug);
    public Realm findByRegionAndName(Regions region, String name);
}
