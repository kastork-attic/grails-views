package grails.views

/**
 * A ViewUriResolver is response for response template and view URIs using Grails' conventions.
 *
 *
 * @author Graeme Rocher
 */
interface ViewUriResolver {
    /**
     * Resolves a template URI for the given path
     *
     * Example: assert resolveTemplateUri('foo', 'bar') == /foo/_bar.gson
     *
     * @param controllerName The controller name
     * @param path The path to the template
     * @return The template URI
     */
    String resolveTemplateUri(String controllerName, String templateName)
}