    1   /*
    2    * Licensed to the Apache Software Foundation (ASF) under one or more
    3    * contributor license agreements.  See the NOTICE file distributed with
    4    * this work for additional information regarding copyright ownership.
    5    * The ASF licenses this file to You under the Apache License, Version 2.0
    6    * (the "License"); you may not use this file except in compliance with
    7    * the License.  You may obtain a copy of the License at
    8    * 
    9    *      http://www.apache.org/licenses/LICENSE-2.0
   10    * 
   11    * Unless required by applicable law or agreed to in writing, software
   12    * distributed under the License is distributed on an "AS IS" BASIS,
   13    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   14    * See the License for the specific language governing permissions and
   15    * limitations under the License.
   16    */
   17   
   18   package org.apache.jasper.runtime;
   19   
   20   import java.io.IOException;
   21   
   22   import javax.servlet.ServletConfig;
   23   import javax.servlet.ServletException;
   24   import javax.servlet.http.HttpServlet;
   25   import javax.servlet.http.HttpServletRequest;
   26   import javax.servlet.http.HttpServletResponse;
   27   import javax.servlet.jsp.HttpJspPage;
   28   import javax.servlet.jsp.JspFactory;
   29   
   30   import org.apache.jasper.compiler.Localizer;
   31   
   32   /**
   33    * This is the super class of all JSP-generated servlets.
   34    *
   35    * @author Anil K. Vijendran
   36    */
   37   public abstract class HttpJspBase 
   38       extends HttpServlet 
   39       implements HttpJspPage 
   40           
   41       
   42   {
   43       
   44       protected HttpJspBase() {
   45       }
   46   
   47       public final void init(ServletConfig config) 
   48   	throws ServletException 
   49       {
   50           super.init(config);
   51   	jspInit();
   52           _jspInit();
   53       }
   54       
   55       public String getServletInfo() {
   56   	return Localizer.getMessage("jsp.engine.info");
   57       }
   58   
   59       public final void destroy() {
   60   	jspDestroy();
   61   	_jspDestroy();
   62       }
   63   
   64       /**
   65        * Entry point into service.
   66        */
   67       public final void service(HttpServletRequest request, HttpServletResponse response) 
   68   	throws ServletException, IOException 
   69       {
   70           _jspService(request, response);
   71       }
   72       
   73       public void jspInit() {
   74       }
   75   
   76       public void _jspInit() {
   77       }
   78   
   79       public void jspDestroy() {
   80       }
   81   
   82       protected void _jspDestroy() {
   83       }
   84   
   85       public abstract void _jspService(HttpServletRequest request, 
   86   				     HttpServletResponse response) 
   87   	throws ServletException, IOException;
   88   }
