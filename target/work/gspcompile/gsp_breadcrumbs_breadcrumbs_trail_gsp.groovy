import grails.converters.JSON
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='breadcrumbs', version='0.5.2')
class gsp_breadcrumbs_breadcrumbs_trail_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/breadcrumbs-0.5.2/grails-app/views/breadcrumbs/_trail.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
if(true && (js == true)) {
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(1)
expressionOut.print(selector)
printHtmlPart(2)
expressionOut.print(selectors ? 'true':'')
printHtmlPart(3)
expressionOut.print(selectors.encodeAsJSON())
printHtmlPart(4)
expressionOut.print(createLink(controller: 'crumb', action: 'list'))
printHtmlPart(5)
expressionOut.print(createLink(controller: 'crumb', action: 'add'))
printHtmlPart(6)
})
invokeTag('javascript','g',38,[:],2)
printHtmlPart(7)
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1281564774000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
