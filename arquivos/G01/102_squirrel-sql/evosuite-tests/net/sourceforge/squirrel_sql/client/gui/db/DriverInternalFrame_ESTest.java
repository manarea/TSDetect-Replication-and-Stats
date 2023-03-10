/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:07:43 GMT 2020
 */

package net.sourceforge.squirrel_sql.client.gui.db;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import net.sourceforge.squirrel_sql.client.IApplication;
import net.sourceforge.squirrel_sql.client.gui.db.DriverInternalFrame;
import net.sourceforge.squirrel_sql.client.gui.desktopcontainer.DesktopStyle;
import net.sourceforge.squirrel_sql.client.gui.mainframe.MainFrame;
import net.sourceforge.squirrel_sql.fw.id.IntegerIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.ISQLDriver;
import net.sourceforge.squirrel_sql.fw.sql.SQLDriver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

 
public class DriverInternalFrameTest { 

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 1);
      assertEquals(466, driverInternalFrame0.getHeight());
      assertEquals(557, driverInternalFrame0.getWidth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn((MainFrame) null).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      sQLDriver0.setJDBCDriverClassLoaded(true);
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 2);
      driverInternalFrame0.getSQLDriver();
      assertEquals(466, driverInternalFrame0.getHeight());
      assertEquals(557, driverInternalFrame0.getWidth());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      doReturn((GraphicsConfiguration) null).when(mainFrame0).getGraphicsConfiguration();
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      DriverInternalFrame driverInternalFrame0 = null;
      try {
        driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 32);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      IntegerIdentifier integerIdentifier0 = new IntegerIdentifier(3);
      SQLDriver sQLDriver0 = new SQLDriver(integerIdentifier0);
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 3);
      driverInternalFrame0.setTitle(")B *Q .6qGUO${-");
      assertEquals(557, driverInternalFrame0.getWidth());
      assertEquals(466, driverInternalFrame0.getHeight());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "U2zDae.GA";
      stringArray0[1] = "U2zDae.GA";
      sQLDriver0.setJarFileNames(stringArray0);
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 3);
      assertEquals(466, driverInternalFrame0.getHeight());
      assertEquals(557, driverInternalFrame0.getWidth());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn((MainFrame) null).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "net.sourceforge.squirrel_sql.client.gui.db.DriverInternalFrame$5";
      sQLDriver0.setJarFileNames(stringArray0);
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 2);
      assertEquals(466, driverInternalFrame0.getHeight());
      assertEquals(557, driverInternalFrame0.getWidth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn((MainFrame) null).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      String[] stringArray0 = new String[1];
      sQLDriver0.setJarFileNames(stringArray0);
      DriverInternalFrame driverInternalFrame0 = null;
      try {
        driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      DriverInternalFrame driverInternalFrame0 = null;
      try {
        driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal value of 32 passed for Maintenance type
         //
         verifyException("net.sourceforge.squirrel_sql.client.gui.db.DriverInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      DriverInternalFrame driverInternalFrame0 = null;
      try {
        driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal value of -1 passed for Maintenance type
         //
         verifyException("net.sourceforge.squirrel_sql.client.gui.db.DriverInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      MainFrame mainFrame0 = mock(MainFrame.class, new ViolatedAssumptionAnswer());
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn(mainFrame0).when(iApplication0).getMainFrame();
      DriverInternalFrame driverInternalFrame0 = null;
      try {
        driverInternalFrame0 = new DriverInternalFrame(iApplication0, (ISQLDriver) null, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null ISQLDriver passed
         //
         verifyException("net.sourceforge.squirrel_sql.client.gui.db.DriverInternalFrame", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DesktopStyle desktopStyle0 = mock(DesktopStyle.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(desktopStyle0).isDockTabStyle();
      IApplication iApplication0 = mock(IApplication.class, new ViolatedAssumptionAnswer());
      doReturn(desktopStyle0).when(iApplication0).getDesktopStyle();
      doReturn((MainFrame) null).when(iApplication0).getMainFrame();
      SQLDriver sQLDriver0 = new SQLDriver();
      DriverInternalFrame driverInternalFrame0 = new DriverInternalFrame(iApplication0, sQLDriver0, 2);
      driverInternalFrame0.getSQLDriver();
      assertEquals(557, driverInternalFrame0.getWidth());
      assertEquals(466, driverInternalFrame0.getHeight());
  }
}
