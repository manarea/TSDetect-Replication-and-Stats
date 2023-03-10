/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:43:52 GMT 2020
 */

package com.aelitis.azureus.core.instancemanager.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.instancemanager.impl.AZOtherInstanceImpl;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.gudy.azureus2.core3.util.SystemTime;
import org.junit.runner.RunWith;

 
public class AZOtherInstanceImplTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("/]~%k/16rWm+DGRz&Q", "/]~%k/16rWm+DGRz&Q", inetAddress0, inetAddress0, 0, 0, 0, hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = new AZOtherInstanceImpl("/]~%k/16rWm+DGRz&Q", "/]~%k/16rWm+DGRz&Q", inetAddress0, inetAddress0, 0, 924, 924, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl0.update(aZOtherInstanceImpl1);
      assertEquals(924, aZOtherInstanceImpl0.getUDPListenPort());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("fo60/#!T~<7M*:V-P", "fo60/#!T~<7M*:V-P", inetAddress0, inetAddress0, 0, 0, 1, hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = new AZOtherInstanceImpl(";/d{h", "CfW+#Ju.h\"V~", inetAddress0, inetAddress0, 120, 1, 0, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl0.update(aZOtherInstanceImpl1);
      assertEquals(120, aZOtherInstanceImpl0.getTCPListenPort());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("r!u", "r!u", inetAddress0, inetAddress0, 0, 0, 0, hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPNonDataListenPort();
      assertEquals(0, int0);
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("&FCBeO!1", "", inetAddress0, inetAddress0, (-3425), (-3425), 120, hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPNonDataListenPort();
      assertEquals("&FCBeO!1", aZOtherInstanceImpl0.getID());
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals("", aZOtherInstanceImpl0.getApplicationID());
      assertEquals(120, int0);
      assertEquals((-3425), aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLocalHost();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, (-1315), (-1315), (-1315), hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPNonDataListenPort();
      assertEquals((-1315), int0);
      assertEquals((-1315), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals((-1315), aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("fo60/#!T~<7M*:V-P", "fo60/#!T~<7M*:V-P", inetAddress0, inetAddress0, 0, 0, 1, hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPListenPort();
      assertEquals(1, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(0, int0);
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl(";/d{h", "CfW+#Ju.h\"V~", inetAddress0, inetAddress0, 120, 1, 0, hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPListenPort();
      assertEquals(0, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals("CfW+#Ju.h\"V~", aZOtherInstanceImpl0.getApplicationID());
      assertEquals(1, int0);
      assertEquals(";/d{h", aZOtherInstanceImpl0.getID());
      assertEquals(120, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("&FCBeO!1", "", inetAddress0, inetAddress0, (-3425), (-3425), 120, hashMap0);
      int int0 = aZOtherInstanceImpl0.getUDPListenPort();
      assertEquals(120, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals("", aZOtherInstanceImpl0.getApplicationID());
      assertEquals((-3425), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-3425), int0);
      assertEquals("&FCBeO!1", aZOtherInstanceImpl0.getID());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("fo60/#!T~<7M*:V-P", "fo60/#!T~<7M*:V-P", inetAddress0, inetAddress0, 0, 0, 1, hashMap0);
      int int0 = aZOtherInstanceImpl0.getTCPListenPort();
      assertEquals(0, int0);
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("xV8pOb>Y>;@}", (String) null, inetAddress0, inetAddress0, 124, (-3425), (-3425), hashMap0);
      int int0 = aZOtherInstanceImpl0.getTCPListenPort();
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(124, int0);
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = MockInetAddress.getByAddress("S*W$<fnr/;", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("S*W$<fnr/;", "S*W$<fnr/;", inetAddress0, inetAddress0, (-5740), (-1791352286), (byte)89, hashMap0);
      int int0 = aZOtherInstanceImpl0.getTCPListenPort();
      assertEquals((-1791352286), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals((-5740), int0);
      assertEquals(89, aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("=WVr@xD2=5#6L<}bw'", "Failed to move ", inetAddress0, inetAddress0, (-1488), (-1488), 998, (Map<String, Object>) null);
      aZOtherInstanceImpl0.getProperties();
      assertEquals("=WVr@xD2=5#6L<}bw'", aZOtherInstanceImpl0.getID());
      assertEquals((-1488), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(998, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals("Failed to move ", aZOtherInstanceImpl0.getApplicationID());
      assertEquals((-1488), aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("&FCBeO!1", "", inetAddress0, inetAddress0, (-3425), (-3425), 120, hashMap0);
      aZOtherInstanceImpl0.getProperties();
      assertEquals((-3425), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(120, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals("&FCBeO!1", aZOtherInstanceImpl0.getID());
      assertEquals("", aZOtherInstanceImpl0.getApplicationID());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      hashMap0.put("*AW0\"^4#`Z[S", object0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("", "", (InetAddress) null, (InetAddress) null, 0, 0, 122, hashMap0);
      aZOtherInstanceImpl0.getProperties();
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(122, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("5@g.P_}`;;Oje_LG`|", "5@g.P_}`;;Oje_LG`|", (InetAddress) null, (InetAddress) null, (-1791352286), (-1791352286), 1, (Map<String, Object>) null);
      aZOtherInstanceImpl0.getInternalAddress();
      assertEquals((-1791352286), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-1791352286), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, 3658, 3658, 3658, hashMap0);
      aZOtherInstanceImpl0.getInternalAddress();
      assertEquals(3658, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(3658, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(3658, aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("0.0.0.0");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (-1555), (-1555), (-1555), hashMap0);
      aZOtherInstanceImpl0.getInternalAddress();
      assertEquals((-1555), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals((-1555), aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-1555), aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(1, 664.0F);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, 1, 1, 45, hashMap0);
      aZOtherInstanceImpl0.getInternalAddress();
      assertEquals(45, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(1, 664.0F);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, 1, 1, 45, hashMap0);
      aZOtherInstanceImpl0.getID();
      assertEquals(45, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("fo60/#!T~<7M*:V-P", "fo60/#!T~<7M*:V-P", inetAddress0, inetAddress0, 0, 0, 1, hashMap0);
      aZOtherInstanceImpl0.getID();
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("", "", (InetAddress) null, (InetAddress) null, 0, 0, 122, hashMap0);
      aZOtherInstanceImpl0.getID();
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(122, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, (InetAddress) null, (InetAddress) null, (byte)26, (byte)33, 119, hashMap0);
      aZOtherInstanceImpl0.getExternalAddress();
      assertEquals(26, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(119, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(33, aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("DpI[V]|Ce_4Ul", "DpI[V]|Ce_4Ul", inetAddress0, inetAddress0, 1394, 1394, 1394, hashMap0);
      aZOtherInstanceImpl0.getExternalAddress();
      assertEquals(1394, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1394, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(1394, aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("ai", "ai", inetAddress0, inetAddress0, 4958, 52401, (byte)1, hashMap0);
      aZOtherInstanceImpl0.getExternalAddress();
      assertEquals(4958, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(52401, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("0.0.0.0");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (-1555), (-1555), (-1555), hashMap0);
      aZOtherInstanceImpl0.getExternalAddress();
      assertEquals((-1555), aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-1555), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-1555), aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLocalHost();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, (-1315), (-1315), (-1315), hashMap0);
      aZOtherInstanceImpl0.getApplicationID();
      assertEquals((-1315), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-1315), aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-1315), aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("!#m9A?x#E6?}x", "!#m9A?x#E6?}x", inetAddress0, inetAddress0, (-1646), (-1646), (-1646), hashMap0);
      aZOtherInstanceImpl0.getApplicationID();
      assertEquals((-1646), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals((-1646), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-1646), aZOtherInstanceImpl0.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("&FCBeO!1", "", inetAddress0, inetAddress0, (-3425), (-3425), 120, hashMap0);
      String string0 = aZOtherInstanceImpl0.getApplicationID();
      assertEquals(120, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-3425), aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals("", string0);
      assertEquals("&FCBeO!1", aZOtherInstanceImpl0.getID());
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl(";/d{h", "CfW+#Ju.h\"V~", inetAddress0, inetAddress0, 120, 1, 0, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals(1, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(120, aZOtherInstanceImpl0.getTCPListenPort());
      
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals(0, aZOtherInstanceImpl1.getUDPNonDataListenPort());
      assertEquals(";/d{h", aZOtherInstanceImpl1.getID());
      assertEquals("CfW+#Ju.h\"V~", aZOtherInstanceImpl1.getApplicationID());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("^", "^", inetAddress0, inetAddress0, 1, (-4273), (-4273), hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals((-4273), aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals((-4273), aZOtherInstanceImpl0.getUDPListenPort());
      
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals("^", aZOtherInstanceImpl1.getApplicationID());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.255", inetAddress0, inetAddress0, 118, (byte)1, 118, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals(118, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(118, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getUDPListenPort());
      
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals("0.0.0.0", aZOtherInstanceImpl1.getID());
      assertEquals("0.0.0.255", aZOtherInstanceImpl1.getApplicationID());
      assertEquals(118, aZOtherInstanceImpl1.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("&FCBeO!1", "", inetAddress0, inetAddress0, (-3425), (-3425), 120, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals(120, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-3425), aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals((-3425), aZOtherInstanceImpl0.getTCPListenPort());
      
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals("", aZOtherInstanceImpl1.getApplicationID());
      assertEquals("&FCBeO!1", aZOtherInstanceImpl1.getID());
      assertEquals(120, aZOtherInstanceImpl1.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      // Undeclared exception!
      try { 
        aZOtherInstanceImpl0.update((AZOtherInstanceImpl) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.aelitis.azureus.core.instancemanager.impl.AZOtherInstanceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      // Undeclared exception!
      try { 
        AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("id", hashMap0);
      // Undeclared exception!
      try { 
        AZOtherInstanceImpl.decode((InetAddress) null, hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to [B
         //
         verifyException("com.aelitis.azureus.core.instancemanager.impl.AZOtherInstanceImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, 3658, 3658, 3658, hashMap0);
      System.setCurrentTimeMillis(3658);
      SystemTime.useRawProvider();
      long long0 = aZOtherInstanceImpl0.getAliveTime();
      assertEquals(3658, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(3658L, long0);
      assertEquals(3658, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(3658, aZOtherInstanceImpl0.getTCPListenPort());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      long long0 = aZOtherInstanceImpl0.getAliveTime();
      assertEquals(4958, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(1392409281320L, long0);
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("^", "^", inetAddress0, inetAddress0, 1, (-4273), (-4273), hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = new AZOtherInstanceImpl("df4Hq", "^", inetAddress0, inetAddress0, 1, (-1791352286), 1, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl0.update(aZOtherInstanceImpl1);
      assertEquals((-1791352286), aZOtherInstanceImpl0.getUDPListenPort());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("fo60/#!T~<7M*:V-P", "fo60/#!T~<7M*:V-P", inetAddress0, inetAddress0, 0, 0, 1, hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = new AZOtherInstanceImpl(";/d{h", "CfW+#Ju.h\"V~", inetAddress0, inetAddress0, 120, 1, 0, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl1.update(aZOtherInstanceImpl0);
      assertEquals(0, aZOtherInstanceImpl1.getTCPListenPort());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      InetAddress inetAddress1 = InetAddress.getLoopbackAddress();
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.255", inetAddress1, inetAddress0, 118, (byte)1, 118, hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = new AZOtherInstanceImpl("ai", "ai", inetAddress1, inetAddress1, 4958, 52401, (byte)1, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl0.update(aZOtherInstanceImpl1);
      assertEquals(4958, aZOtherInstanceImpl0.getTCPListenPort());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl0.update(aZOtherInstanceImpl0);
      assertEquals(0, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(0, aZOtherInstanceImpl0.getTCPListenPort());
      assertEquals(4958, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InetAddress inetAddress0 = InetAddress.getLoopbackAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress1 = InetAddress.getByAddress("0.0.0.0", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "CID", inetAddress1, inetAddress1, 2285, (-1), (byte)92, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      boolean boolean0 = aZOtherInstanceImpl1.update(aZOtherInstanceImpl0);
      assertEquals(92, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals((-1), aZOtherInstanceImpl1.getUDPListenPort());
      assertEquals("0.0.0.0", aZOtherInstanceImpl1.getID());
      assertEquals("CID", aZOtherInstanceImpl1.getApplicationID());
      assertTrue(boolean0);
      assertEquals(2285, aZOtherInstanceImpl1.getTCPListenPort());
      assertEquals(92, aZOtherInstanceImpl1.getUDPNonDataListenPort());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode((InetAddress) null, hashMap0);
      assertNull(aZOtherInstanceImpl1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)1;
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals(4958, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals(4958, aZOtherInstanceImpl1.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl1.getTCPListenPort());
      assertEquals(0, aZOtherInstanceImpl1.getUDPListenPort());
      assertEquals("0.0.0.0", aZOtherInstanceImpl1.getApplicationID());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      byte[] byteArray0 = new byte[4];
      InetAddress inetAddress0 = InetAddress.getByAddress("ai", byteArray0);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl("0.0.0.0", "0.0.0.0", inetAddress0, inetAddress0, (byte)0, (byte)0, 4958, hashMap0);
      aZOtherInstanceImpl0.encode(hashMap0);
      assertEquals(4958, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      
      BiFunction<String, Object, Inet4Address> biFunction0 = (BiFunction<String, Object, Inet4Address>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyString() , any());
      hashMap0.computeIfPresent("ai", biFunction0);
      AZOtherInstanceImpl aZOtherInstanceImpl1 = AZOtherInstanceImpl.decode(inetAddress0, hashMap0);
      assertEquals(4958, aZOtherInstanceImpl1.getUDPNonDataListenPort());
      assertEquals(0, aZOtherInstanceImpl1.getTCPListenPort());
      assertEquals(0, aZOtherInstanceImpl1.getUDPListenPort());
      assertEquals("0.0.0.0", aZOtherInstanceImpl1.getID());
      assertEquals("az_4.2.0.2", aZOtherInstanceImpl1.getApplicationID());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(1, 664.0F);
      AZOtherInstanceImpl aZOtherInstanceImpl0 = new AZOtherInstanceImpl((String) null, (String) null, inetAddress0, inetAddress0, 1, 1, 45, hashMap0);
      aZOtherInstanceImpl0.getInternalAddresses();
      assertEquals(1, aZOtherInstanceImpl0.getUDPListenPort());
      assertEquals(45, aZOtherInstanceImpl0.getUDPNonDataListenPort());
      assertEquals(1, aZOtherInstanceImpl0.getTCPListenPort());
  }
}
