import pizzashop.Product
import pizzashop.Role
import pizzashop.Tag
import pizzashop.User
import pizzashop.UserRole


class BootStrap {

    def init = { servletContext ->
        def tag1 = new Tag(name: 'Celery', description: 'Celery topping').save()
        def tag2 = new Tag(name: 'Cilantro', description: 'Cilantro').save()

        def pizza1 = new Product(name: 'Celery Pizza', description: 'Pizza with celery topping ', status: "Available")
        // TODO Figure out why this doesn't work
        // pizza1.addToTags(tag : tag1)
        pizza1.save()


        def pizza2 = new Product(name: 'Cilantro Pizza', description: 'Pizza with cilantro topping ', status: "Available")
        // pizza2.addToTags(tag : tag2)
        pizza2.save()

        // def order1 = new Order(orderNumber: 1, createdDate: new Date()).save()
        // def order2 = new Order(orderNumber: 2, createdDate: new Date()).save()
        // def order3 = new Order(orderNumber: 3, createdDate: new Date()).save()


        def adminRole = Role.findByAuthority('ROLE_ADMIN') ?: new Role(authority: 'ROLE_ADMIN').save(failOnError: true)
        def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)

        def user1 = User.findByUsername('user') ?: new User(username: 'user', enabled: true, password: 'password', firstName : 'Regular', lastName: 'User')
        user1.save(failOnError: true)
        if (!user1.authorities.contains(userRole)) {
            UserRole.create user1, userRole, true
        }
        def user2 = User.findByUsername('admin') ?: new User(username: 'admin', enabled: true, password: 'password', firstName : 'Admin', lastName: 'Admin')
        user2.save(failOnError: true)
        if (!user2.authorities.contains(userRole)) {
            UserRole.create user2, userRole, true
        }
        if (!user2.authorities.contains(adminRole)) {
            UserRole.create user2, adminRole, true
        }
        assert User.count() == 2
        assert Role.count() == 2
        assert UserRole.count() == 3

    }
    def destroy = {
    }
}





