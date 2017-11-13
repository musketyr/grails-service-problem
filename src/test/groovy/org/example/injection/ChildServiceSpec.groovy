package org.example.injection

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ChildServiceSpec extends Specification implements ServiceUnitTest<ChildService>{

    void "get profile from parent"() {
        when:
            service.profile
        then:
            thrown(NullPointerException)

    }


    void "get profile from child"() {
        when:
            String profile = service.profileFromChild
        then:
            noExceptionThrown()
            profile == 'web'
    }


}
