package org.example.injection

import grails.core.GrailsApplication

class AbstractParentService {

    GrailsApplication grailsApplication

    String getProfile() {
        grailsApplication.config.grails?.profile
    }

}
