/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.105
 * Generated at: 2025-05-28 06:03:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class report_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2 (2).jar", Long.valueOf(1748371621597L));
    _jspx_dependants.put("jar:file:/C:/Users/HP/eclipse-desktop/HostelManagement/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HostelWebApp/WEB-INF/lib/jstl-1.2%20(2).jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("jar:file:/C:/Users/HP/eclipse-desktop/HostelManagement/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HostelWebApp/WEB-INF/lib/jstl-1.2%20(2).jar!/META-INF/fmt.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Generate Report</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        select, input[type=\"text\"], input[type=\"date\"] {\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            margin: 10px 0 20px 0;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            padding: 8px 16px;\r\n");
      out.write("            background-color: #28a745;\r\n");
      out.write("            color: white;\r\n");
      out.write("            border: none;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #218838;\r\n");
      out.write("        }\r\n");
      out.write("        .hidden {\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function toggleFields() {\r\n");
      out.write("            const reportType = document.getElementById(\"reportType\").value;\r\n");
      out.write("            document.getElementById(\"roomFields\").classList.add(\"hidden\");\r\n");
      out.write("            document.getElementById(\"dateFields\").classList.add(\"hidden\");\r\n");
      out.write("\r\n");
      out.write("            if (reportType === \"roomNumber\") {\r\n");
      out.write("                document.getElementById(\"roomFields\").classList.remove(\"hidden\");\r\n");
      out.write("            } else if (reportType === \"admissionDate\") {\r\n");
      out.write("                document.getElementById(\"dateFields\").classList.remove(\"hidden\");\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h2>Generate Student Report</h2>\r\n");
      out.write("    <form action=\"report\" method=\"get\">\r\n");
      out.write("        <label for=\"reportType\">Select Report Type:</label><br>\r\n");
      out.write("        <select name=\"reportType\" id=\"reportType\" onchange=\"toggleFields()\" required>\r\n");
      out.write("            <option value=\"\">--Select--</option>\r\n");
      out.write("            <option value=\"pendingFees\">Students with Pending Fees</option>\r\n");
      out.write("            <option value=\"roomNumber\">Students by Room Number</option>\r\n");
      out.write("            <option value=\"admissionDate\">Students by Admission Date Range</option>\r\n");
      out.write("        </select><br>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"roomFields\" class=\"hidden\">\r\n");
      out.write("            <label for=\"roomNumber\">Room Number:</label><br>\r\n");
      out.write("            <input type=\"text\" name=\"roomNumber\" id=\"roomNumber\"><br>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"dateFields\" class=\"hidden\">\r\n");
      out.write("            <label for=\"startDate\">Start Date:</label><br>\r\n");
      out.write("            <input type=\"date\" name=\"startDate\" id=\"startDate\"><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"endDate\">End Date:</label><br>\r\n");
      out.write("            <input type=\"date\" name=\"endDate\" id=\"endDate\"><br>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Generate Report\">\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
