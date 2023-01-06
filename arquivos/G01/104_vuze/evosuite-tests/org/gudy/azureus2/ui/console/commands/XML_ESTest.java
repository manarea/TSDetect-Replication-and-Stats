/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:33:30 GMT 2020
 */

package org.gudy.azureus2.ui.console.commands;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.core.AzureusCore;
import java.io.InputStream;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.gudy.azureus2.ui.console.ConsoleInput;
import org.gudy.azureus2.ui.console.UserProfile;
import org.gudy.azureus2.ui.console.commands.XML;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XML_ESTest extends XML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XML xML0 = new XML();
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      // Undeclared exception!
      try { 
        xML0.execute("Y6{T45 SR_KNxq.D", (ConsoleInput) null, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.ui.console.commands.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XML xML0 = new XML();
      StringReader stringReader0 = new StringReader(",qwf=");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-3886));
      linkedList0.addFirst(integer0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("com.aelitis.azureus.core.impl.AzureusCoreImpl$4");
      Boolean boolean0 = Boolean.TRUE;
      UserProfile userProfile0 = new UserProfile();
      ConsoleInput consoleInput0 = new ConsoleInput("xml [<file>]\t\t\t\tOutput stats in xml format (to <file> if given)", (AzureusCore) null, stringReader0, mockPrintStream0, boolean0, userProfile0);
      // Undeclared exception!
      try { 
        xML0.execute(",qwf=", consoleInput0, linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.gudy.azureus2.ui.console.commands.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XML xML0 = new XML();
      MockPrintStream mockPrintStream0 = new MockPrintStream("Rn8D1;n}77WYO9");
      ConsoleInput consoleInput0 = new ConsoleInput((AzureusCore) null, mockPrintStream0);
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      xML0.execute("w5V(p?kp4+_i~vVpR", consoleInput0, list0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XML xML0 = new XML();
      MockPrintStream mockPrintStream0 = new MockPrintStream(",qmf=");
      ConsoleInput consoleInput0 = new ConsoleInput((AzureusCore) null, mockPrintStream0);
      xML0.execute((String) null, consoleInput0, consoleInput0.torrents);
      //  // Unstable assertion: assertFalse(consoleInput0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XML xML0 = new XML();
      MockPrintStream mockPrintStream0 = new MockPrintStream(",qmf=");
      ConsoleInput consoleInput0 = new ConsoleInput((AzureusCore) null, mockPrintStream0);
      xML0.execute("^KM :$rg.)", consoleInput0, (List) null);
      //  // Unstable assertion: assertFalse(consoleInput0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XML xML0 = new XML();
      String string0 = xML0.getCommandDescriptions();
      assertEquals("xml [<file>]\t\t\t\tOutput stats in xml format (to <file> if given)", string0);
  }
}
