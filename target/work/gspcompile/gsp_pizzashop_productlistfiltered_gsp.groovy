import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzashop_productlistfiltered_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/listfiltered.gsp" }
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
invokeTag('render','g',12,['template':("productCard"),'collection':(filteredproducts),'var':("filteredproduct")],-1)
printHtmlPart(7)
expressionOut.print(filteredproduct.name)
printHtmlPart(8)
expressionOut.print(filteredproduct.description)
printHtmlPart(8)
expressionOut.print(filteredproduct.price)
printHtmlPart(9)
for( tag in (tags) ) {
printHtmlPart(10)
createTagBody(3, {->
expressionOut.print(tag.name)
})
invokeTag('link','g',27,['controller':("product"),'action':("listfiltered")],3)
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',34,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417367746000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
