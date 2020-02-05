/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/inputservlet")

public class Inputservlet extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws 
    IOException , ServletException
    {
        PrintWriter pr=res.getWriter();// line 10
        res.setContentType("text/html");
        try
        {
           int x=Integer.parseInt(req.getParameter("t1"));
           int y=Integer.parseInt(req.getParameter("t2"));
           int z=x+y;
           pr.println("<HTML>");
           pr.println("<HEAD><TITLE>Hello</TITLE></HEAD>");
           pr.println("<BODY>");
           pr.println("First No.<input type=text value=" +x +"><br><br>");
           pr.println("Second No.<input type=text value=" +y +"><br><br>");
           pr.println("Output No:<input type=text value=" +z +"><br><br>");
           pr.println("<input type=submit value=submit>");
           pr.println("</BODY></HTML>");
        }
        catch(Exception e)
        {
        pr.println("Invalid Input");
        }
    } 
    
}
