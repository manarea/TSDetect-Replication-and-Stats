/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 08:18:18 GMT 2020
 */

package org.gudy.azureus2.ui.swt.views.tableitems.tracker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.ui.common.table.TableRowCore;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gudy.azureus2.plugins.ui.tables.TableCell;
import org.gudy.azureus2.plugins.ui.tables.TableColumn;
import org.gudy.azureus2.plugins.ui.tables.TableColumnInfo;
import org.gudy.azureus2.ui.swt.components.BufferedTableItem;
import org.gudy.azureus2.ui.swt.views.table.impl.FakeTableCell;
import org.gudy.azureus2.ui.swt.views.table.impl.TableCellImpl;
import org.gudy.azureus2.ui.swt.views.table.utils.TableColumnInfoImpl;
import org.gudy.azureus2.ui.swt.views.tableitems.tracker.PeersItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PeersItem_ESTest extends PeersItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      // Undeclared exception!
      try { 
        peersItem0.refresh((TableCell) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.ui.swt.views.tableitems.tracker.PeersItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      FakeTableCell fakeTableCell0 = new FakeTableCell((TableColumn) peersItem0, (Object) peersItem0);
      // Undeclared exception!
      try { 
        peersItem0.refresh(fakeTableCell0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.gudy.azureus2.ui.swt.views.tableitems.tracker.PeersItem cannot be cast to com.aelitis.azureus.core.tracker.TrackerPeerSource
         //
         verifyException("org.gudy.azureus2.ui.swt.views.tableitems.tracker.PeersItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      // Undeclared exception!
      try { 
        peersItem0.fillTableColumnInfo((TableColumnInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.gudy.azureus2.ui.swt.views.tableitems.tracker.PeersItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      TableCellImpl tableCellImpl0 = new TableCellImpl((TableRowCore) null, peersItem0, 1, (BufferedTableItem) null);
      tableCellImpl0.refresh(false, false);
      peersItem0.refresh(tableCellImpl0);
      assertEquals((-1), peersItem0.getRefreshInterval());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      TableCellImpl tableCellImpl0 = new TableCellImpl((TableRowCore) null, peersItem0, 1, (BufferedTableItem) null);
      peersItem0.refresh(tableCellImpl0);
      tableCellImpl0.refresh(false, false);
      assertEquals((-1), peersItem0.getRefreshInterval());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PeersItem peersItem0 = new PeersItem();
      TableColumnInfoImpl tableColumnInfoImpl0 = new TableColumnInfoImpl(peersItem0);
      peersItem0.fillTableColumnInfo(tableColumnInfoImpl0);
      // Undeclared exception!
      try { 
        peersItem0.fillTableColumnInfo(tableColumnInfoImpl0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
