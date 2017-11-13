package org.example.injection

import grails.core.GrailsApplication
import grails.gorm.transactions.Transactional

@Transactional
class ChildService extends AbstractParentService {

    GrailsApplication grailsApplication

    String getProfileFromChild() {
        grailsApplication.config.grails?.profile
    }

}
