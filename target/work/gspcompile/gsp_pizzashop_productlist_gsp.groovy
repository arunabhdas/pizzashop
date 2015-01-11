import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzashop_productlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/list.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
invokeTag('resources','blueprint',6,[:],-1)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'app.css'))
printHtmlPart(5)
invokeTag('require','r',8,['modules':("bootstrap")],-1)
printHtmlPart(1)
invokeTag('javascript','g',9,['library':("jquery")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',16,['controller':("login"),'action':("auth")],3)
printHtmlPart(1)
})
invokeTag('ifNotLoggedIn','sec',17,[:],2)
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('username','sec',19,[:],-1)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',19,['controller':("logout")],3)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',20,['class':("create"),'controller':("customerCheckout"),'action':("index")],3)
printHtmlPart(1)
})
invokeTag('ifAllGranted','sec',21,['roles':("ROLE_USER")],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('javascript','g',25,[:],2)
printHtmlPart(17)
invokeTag('render','g',29,['template':("productCard"),'collection':(products),'var':("product")],-1)
printHtmlPart(18)
expressionOut.print(hello)
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('javascript','g',41,[:],2)
printHtmlPart(21)
createClosureForHtmlPart(22, 2)
invokeTag('link','g',47,['controller':("product"),'action':("list")],2)
printHtmlPart(23)
for( tag in (tags) ) {
printHtmlPart(24)
createTagBody(3, {->
expressionOut.print(tag.name)
})
invokeTag('link','g',49,['controller':("product"),'action':("listfiltered")],3)
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('render','g',57,['template':("shoppingCart"),'collection':(suborders),'var':("suborder")],-1)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417981652000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
