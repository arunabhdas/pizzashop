import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='breadcrumbs', version='0.5.2')
class gsp_breadcrumbs_breadcrumbs_resources_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/breadcrumbs-0.5.2/grails-app/views/breadcrumbs/_resources.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('javascript','g',1,['library':("jquery.easing"),'plugin':("breadcrumbs")],-1)
printHtmlPart(1)
invokeTag('javascript','g',2,['library':("jquery.jBreadCrumb"),'plugin':("breadcrumbs")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'BreadCrumb.css', plugin: 'breadcrumbs'))
printHtmlPart(3)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1280089418000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
