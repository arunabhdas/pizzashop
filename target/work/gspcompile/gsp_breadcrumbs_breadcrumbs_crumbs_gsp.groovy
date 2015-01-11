import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='breadcrumbs', version='0.5.2')
class gsp_breadcrumbs_breadcrumbs_crumbs_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/breadcrumbs-0.5.2/grails-app/views/breadcrumbs/_crumbs.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(home)
printHtmlPart(1)
loop:{
int i = 0
for( crumb in (crumbtrail) ) {
printHtmlPart(2)
if(true && ((i+1) < crumbtrail.size())) {
printHtmlPart(3)
expressionOut.print(crumb.href)
printHtmlPart(4)
expressionOut.print(crumb.name)
printHtmlPart(5)
}
else {
printHtmlPart(6)
expressionOut.print(crumb.name)
printHtmlPart(7)
}
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1280085818000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
