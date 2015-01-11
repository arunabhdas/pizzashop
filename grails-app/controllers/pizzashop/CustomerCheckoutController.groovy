package pizzashop
import grails.plugin.springsecurity.annotation.Secured
class CustomerCheckoutController {

    @Secured(['ROLE_USER'])
    def index() {}
}
