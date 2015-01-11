import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzashop_productshowdetail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/showdetail.gsp" }
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
printHtmlPart(1)
invokeTag('resources','blueprint',5,[:],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'app.css'))
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',12,['template':("productCard"),'collection':(products),'var':("product")],-1)
printHtmlPart(7)
expressionOut.print(hello)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',26,['controller':("product"),'action':("list")],2)
printHtmlPart(10)
for( tag in (tags) ) {
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(tag.name)
})
invokeTag('link','g',28,['controller':("product"),'action':("listfiltered")],3)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('render','g',36,['template':("shoppingCart"),'collection':(suborders),'var':("suborder")],-1)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417381272000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
