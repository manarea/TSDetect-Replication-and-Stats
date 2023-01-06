/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:28:02 GMT 2020
 */

package com.liferay.portal.security.pacl.checker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.security.pacl.permission.PortalHookPermission;
import com.liferay.portal.security.pacl.ActivePACLPolicy;
import com.liferay.portal.security.pacl.InactivePACLPolicy;
import com.liferay.portal.security.pacl.checker.PortalHookChecker;
import java.util.Properties;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.testng.xml.XmlSuite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PortalHookChecker_ESTest extends PortalHookChecker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("hasIndexer", classLoader0, (Object) null);
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      ActivePACLPolicy activePACLPolicy0 = new ActivePACLPolicy("org.testng.util.RetryAnalyzerCount", classLoader0, bouncyCastleProvider0);
      portalHookChecker0.setPACLPolicy(activePACLPolicy0);
      portalHookChecker0.initStrutsActionPaths();
      assertEquals("org.testng.util.RetryAnalyzerCount", portalHookChecker0.getServletContextName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      Properties properties0 = new Properties();
      InactivePACLPolicy inactivePACLPolicy0 = new InactivePACLPolicy("1000", classLoader0, properties0);
      portalHookChecker0.setPACLPolicy(inactivePACLPolicy0);
      portalHookChecker0.initServices();
      assertEquals("1000", portalHookChecker0.getServletContextName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      ActivePACLPolicy activePACLPolicy0 = new ActivePACLPolicy("org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECGOST3410", classLoader0, bouncyCastleProvider0);
      portalHookChecker0.setPACLPolicy(activePACLPolicy0);
      portalHookChecker0.initLanguagePropertiesLocales();
      assertEquals("org.bouncycastle.jce.provider.asymmetric.ec.KeyFactory$ECGOST3410", portalHookChecker0.getServletContextName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      Properties properties0 = new Properties();
      ActivePACLPolicy activePACLPolicy0 = new ActivePACLPolicy((String) null, classLoader0, properties0);
      portalHookChecker0.setPACLPolicy(activePACLPolicy0);
      portalHookChecker0.initIndexers();
      assertNull(portalHookChecker0.getServletContextName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      BouncyCastleProvider bouncyCastleProvider0 = new BouncyCastleProvider();
      InactivePACLPolicy inactivePACLPolicy0 = new InactivePACLPolicy("", (ClassLoader) null, bouncyCastleProvider0);
      portalHookChecker0.setPACLPolicy(inactivePACLPolicy0);
      portalHookChecker0.initCustomJspDir();
      assertEquals("", portalHookChecker0.getServletContextName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("service", classLoader0, "service");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("hasPortalPropertiesKey", classLoader0, "[u@S./1");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.initServletFilters();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.initPortalPropertiesKeys();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("strutsActionPath", classLoader0, "strutsActionPath");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("servletFilters", classLoader0, "servletFilters");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Attempted to override serlvet filters
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getSystemClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("service", classLoader0, classLoader0);
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // sun.misc.Launcher$AppClassLoader cannot be cast to java.lang.String
         //
         verifyException("com.liferay.portal.security.pacl.checker.PortalHookChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("languagePropertiesLocale", classLoader0, (Object) null);
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.PortalHookChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = portalHookChecker0.getPortalClassLoader();
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("customJspDir", classLoader0, "customJspDir");
      // Undeclared exception!
      try { 
        portalHookChecker0.checkPermission(portalHookPermission0);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Attempted to set custom jsp dir
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Integer integer0 = XmlSuite.DEFAULT_VERBOSE;
      PortalHookPermission portalHookPermission0 = new PortalHookPermission("security-manager-hook-struts-action-paths", classLoader0, integer0);
      portalHookChecker0.checkPermission(portalHookPermission0);
      assertEquals("(\"com.liferay.portal.kernel.security.pacl.permission.PortalHookPermission\" \"security-manager-hook-struts-action-paths\")", portalHookPermission0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PortalHookChecker portalHookChecker0 = new PortalHookChecker();
      // Undeclared exception!
      try { 
        portalHookChecker0.afterPropertiesSet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.security.pacl.checker.BaseChecker", e);
      }
  }
}
