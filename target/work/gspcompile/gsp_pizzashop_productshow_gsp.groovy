import pizzashop.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzashop_productshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'product.label', default: 'Product'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/admin'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (productInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("product.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(productInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.description)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("product.description.label"),'default':("Description")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(productInstance),'field':("description")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.price)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("product.price.label"),'default':("Price")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(productInstance),'field':("price")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.status)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("product.status.label"),'default':("Status")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(productInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (productInstance?.tags)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("product.tags.label"),'default':("Tags")],-1)
printHtmlPart(25)
for( t in (productInstance.tags) ) {
printHtmlPart(26)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',67,['controller':("tag"),'action':("show"),'id':(t.id)],4)
printHtmlPart(27)
}
printHtmlPart(28)
}
printHtmlPart(29)
createTagBody(2, {->
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',76,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',76,['class':("edit"),'action':("edit"),'resource':(productInstance)],3)
printHtmlPart(31)
invokeTag('actionSubmit','g',77,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(32)
})
invokeTag('form','g',79,['url':([resource:productInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',81,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417372971000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
