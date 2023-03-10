/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:53:00 GMT 2020
 */

package com.liferay.portal.kernel.scheduler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.liferay.portal.kernel.scheduler.CronText;
import java.util.Calendar;
import java.util.TimeZone;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateBuilder;
import org.apache.xmlbeans.XmlCalendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

 
public class CronTextTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-4013L));
      GDateBuilder gDateBuilder0 = new GDateBuilder(mockDate0);
      GDate gDate0 = new GDate(gDateBuilder0);
      XmlCalendar xmlCalendar0 = gDate0.getCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      cronText0.setInterval(30);
      assertEquals(30, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 7, 2768);
      int int0 = cronText0.getFrequency();
      assertEquals(7, int0);
      assertEquals(2768, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CronText cronText0 = new CronText((Calendar) null);
      cronText0.getStartDate();
      assertEquals(1, cronText0.getFrequency());
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      xmlCalendar0.setLenient(false);
      cronText0.getStartDate();
      assertEquals(0, cronText0.getInterval());
      assertEquals(1, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      xmlCalendar0.setMinimalDaysInFirstWeek(0);
      CronText cronText0 = new CronText(xmlCalendar0);
      cronText0.getStartDate();
      assertEquals(0, cronText0.getInterval());
      assertEquals(1, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      xmlCalendar0.setMinimalDaysInFirstWeek((-1015));
      CronText cronText0 = new CronText(xmlCalendar0);
      cronText0.getStartDate();
      assertEquals(1, cronText0.getFrequency());
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      xmlCalendar0.setFirstDayOfWeek((-561));
      cronText0.getStartDate();
      assertEquals(1, cronText0.getFrequency());
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 3, 11);
      int int0 = cronText0.getInterval();
      assertEquals(11, int0);
      assertEquals(3, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 3, (-253));
      int int0 = cronText0.getInterval();
      assertEquals((-253), int0);
      assertEquals(3, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CronText cronText0 = new CronText((Calendar) null);
      // Undeclared exception!
      try { 
        cronText0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.liferay.portal.kernel.scheduler.CronText", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      xmlCalendar0.setTimeZone((TimeZone) null);
      CronText cronText0 = new CronText(xmlCalendar0);
      // Undeclared exception!
      try { 
        cronText0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      xmlCalendar0.setLenient(false);
      CronText cronText0 = new CronText(xmlCalendar0);
      // Undeclared exception!
      try { 
        cronText0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YEAR
         //
         verifyException("java.util.GregorianCalendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = null;
      try {
        cronText0 = new CronText(xmlCalendar0, (-2580), (-2580));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -2580
         //
         verifyException("com.liferay.portal.kernel.scheduler.CronText", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 7, 2768);
      cronText0.setFrequency(7);
      assertEquals(2768, cronText0.getInterval());
      assertEquals(7, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      
      cronText0.setFrequency(2);
      cronText0.toString();
      assertEquals(2, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      
      cronText0.setFrequency(6);
      assertEquals(6, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      
      cronText0.setFrequency(4);
      assertEquals(4, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-1280), (-1280), 0);
      XmlCalendar xmlCalendar0 = new XmlCalendar(mockDate0);
      CronText cronText0 = new CronText(xmlCalendar0);
      cronText0.setFrequency(1);
      assertEquals(1, cronText0.getFrequency());
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      
      cronText0.setFrequency(3);
      assertEquals(3, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 5, 6);
      String string0 = cronText0.toString();
      assertEquals("0 0 0 1/42 * ? *", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      String string0 = cronText0.toString();
      assertEquals("0 0 0 1 1 ? 1", string0);
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      // Undeclared exception!
      try { 
        cronText0.setFrequency(1703);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1703
         //
         verifyException("com.liferay.portal.kernel.scheduler.CronText", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      
      cronText0.setFrequency(5);
      assertEquals(5, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 7, 2231);
      String string0 = cronText0.toString();
      assertEquals("0 0 0 1 1 ? 1/2231", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 6, 1);
      String string0 = cronText0.toString();
      assertEquals("0 0 0 1 1/1 ? *", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 3, 1);
      String string0 = cronText0.toString();
      assertEquals("0 * */1 * * ? *", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0, 4, 5);
      String string0 = cronText0.toString();
      assertEquals("0 0 0 1/5 * ? *", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      int int0 = cronText0.getInterval();
      assertEquals(0, int0);
      assertEquals(1, cronText0.getFrequency());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      cronText0.setStartDate(xmlCalendar0);
      assertEquals(1, cronText0.getFrequency());
      assertEquals(0, cronText0.getInterval());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XmlCalendar xmlCalendar0 = new XmlCalendar();
      CronText cronText0 = new CronText(xmlCalendar0);
      int int0 = cronText0.getFrequency();
      assertEquals(0, cronText0.getInterval());
      assertEquals(1, int0);
  }
}
