/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:56:32 GMT 2020
 */

package org.quickserver.util.xmlreader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Proxy;
import java.net.Socket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.quickserver.util.xmlreader.AccessConstraintConfig;
import org.quickserver.util.xmlreader.IpFilterConfig;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AccessConstraintConfig_ESTest extends AccessConstraintConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      ipFilterConfig0.setEnable(true);
      IpFilterConfig ipFilterConfig1 = accessConstraintConfig0.getIpFilterConfig();
      assertSame(ipFilterConfig1, ipFilterConfig0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      ipFilterConfig0.setAllowAccess(true);
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      IpFilterConfig ipFilterConfig1 = accessConstraintConfig0.getIpFilterConfig();
      assertTrue(ipFilterConfig1.getAllowAccess());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = accessConstraintConfig0.getIpFilterConfig();
      assertNull(ipFilterConfig0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ipFilterConfig0.setEnable(true);
      // Undeclared exception!
      try { 
        accessConstraintConfig0.checkAccept(mockSocket0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      accessConstraintConfig0.checkAccept(mockSocket0);
      assertFalse(mockSocket0.isConnected());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      accessConstraintConfig0.checkAccept(mockSocket0);
      assertFalse(mockSocket0.isClosed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      accessConstraintConfig0.checkAccept((Socket) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      IpFilterConfig ipFilterConfig0 = new IpFilterConfig();
      accessConstraintConfig0.setIpFilterConfig(ipFilterConfig0);
      String string0 = accessConstraintConfig0.toXML((String) null);
      assertEquals("<access-constraint>\n\t<ip-filter>\n\t\t<enable>false</enable>\n\t\t<allow-access>false</allow-access>\n\t\t<ip-collection>\n\t\t</ip-collection>\n\t</ip-filter>\n</access-constraint>\n", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      String string0 = accessConstraintConfig0.toXML((String) null);
      assertEquals("<access-constraint>\n</access-constraint>\n", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      AccessConstraintConfig accessConstraintConfig0 = new AccessConstraintConfig();
      String string0 = accessConstraintConfig0.toXML("}1");
      assertEquals("}1<access-constraint>\n}1</access-constraint>\n", string0);
  }
}
