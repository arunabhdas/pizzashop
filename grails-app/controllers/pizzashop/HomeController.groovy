package pizzashop
import grails.plugin.springsecurity.annotation.Secured
@Secured(['ROLE_USER'])
class HomeController {

    def index() {
        def products = Product.findAllByStatus("Available", [sort: "name", order : "asc"])

        def suborders = Suborder.list(sort: "suborderNumber", order: "asc")

        def tags = Tag.list(sort: "name", order : "asc")


        return [products : products, tags : tags, suborders: suborders]
    }

    @Secured(['ROLE_ADMIN'])
    def adminOnly() {
        render "admin"
    }
}
