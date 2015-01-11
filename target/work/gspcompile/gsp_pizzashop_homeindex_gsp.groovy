import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzashop_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
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
createClosureForHtmlPart(9, 2)
invokeTag('javascript','g',17,[:],2)
printHtmlPart(10)
invokeTag('render','g',21,['template':("productCard"),'collection':(products),'var':("product")],-1)
printHtmlPart(11)
expressionOut.print(hello)
printHtmlPart(12)
createClosureForHtmlPart(13, 2)
invokeTag('javascript','g',33,[:],2)
printHtmlPart(14)
createClosureForHtmlPart(15, 2)
invokeTag('link','g',39,['controller':("product"),'action':("list")],2)
printHtmlPart(16)
for( tag in (tags) ) {
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(tag.name)
})
invokeTag('link','g',41,['controller':("product"),'action':("listfiltered")],3)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('render','g',49,['template':("shoppingCart"),'collection':(suborders),'var':("suborder")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417975488000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
