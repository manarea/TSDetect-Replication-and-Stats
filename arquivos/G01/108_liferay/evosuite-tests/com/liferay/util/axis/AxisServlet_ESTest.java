/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:22:28 GMT 2020
 */

package com.liferay.util.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.xml.SAXReaderImpl;
import com.liferay.util.axis.AxisServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.axis.utils.cache.MethodCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jabsorb.JSONRPCServlet;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AxisServlet_ESTest extends AxisServlet_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      String string0 = axisServlet0.fixXml("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      SAXReaderUtil sAXReaderUtil0 = new SAXReaderUtil();
      SAXReaderImpl sAXReaderImpl0 = SAXReaderImpl.getInstance();
      sAXReaderUtil0.setSAXReader(sAXReaderImpl0);
      // Undeclared exception!
      try { 
        axisServlet0.fixXml("<wsdl:definitions");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.liferay.portal.util.PropsValues
         //
         verifyException("com.liferay.portal.xml.SAXReaderImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      String string0 = axisServlet0.fixXml("axis.enableListQuery");
      assertEquals("axis.enableListQuery", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      try { 
        axisServlet0.fixXml("<wsdl:definitions");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.xml.SAXReaderUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      MethodCache.getInstance();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      axisServlet0.service((HttpServletRequest) httpServletRequestWrapper0, (HttpServletResponse) httpServletResponseWrapper0);
      assertEquals(0, axisServlet0.getLoadCounter());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      axisServlet0.service((HttpServletRequest) null, (HttpServletResponse) null);
      assertFalse(axisServlet0.isDevelopment());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      JSONRPCServlet jSONRPCServlet0 = new JSONRPCServlet();
      try { 
        axisServlet0.init((ServletConfig) jSONRPCServlet0);
        fail("Expecting exception: ServletException");
      
      } catch(ServletException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.util.axis.AxisServlet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      axisServlet0.init((ServletConfig) axisServlet0);
      // Undeclared exception!
      try { 
        axisServlet0.doInit();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      axisServlet0.doDestroy();
      assertEquals(0, axisServlet0.getLoadCounter());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      // Undeclared exception!
      try { 
        axisServlet0.doInit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.axis.transport.http.AxisServletBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AxisServlet axisServlet0 = new AxisServlet();
      axisServlet0.destroy();
      assertEquals(0, axisServlet0.getLoadCounter());
  }
}
