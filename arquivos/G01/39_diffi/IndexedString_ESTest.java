/*
 * This file was automatically generated by EvoSuite
 * Thu May 07 09:13:51 GMT 2020
 */

package de.beiri22.stringincrementor.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.beiri22.stringincrementor.helper.IndexedString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

 
public class IndexedStringTest { 

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("KCl,&]`3s+Wl(2LfDD");
      char[] charArray0 = new char[3];
      charArray0[0] = 'f';
      charArray0[1] = 'f';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("KCl,&]`3s+Wl(2LfDD");
      char[] charArray0 = new char[3];
      charArray0[0] = 'f';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("");
      // Undeclared exception!
      try { 
        indexedString0.indexOf((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.beiri22.stringincrementor.helper.IndexedString", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("");
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        indexedString0.indexOf(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.beiri22.stringincrementor.helper.IndexedString", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("de.beiri22.stringincrementor.helper.IndexedString");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IndexedString indexedString0 = null;
      try {
        indexedString0 = new IndexedString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("\"%*3uUOk@(]fmU{^WKO");
      char[] charArray0 = new char[3];
      charArray0[0] = '(';
      charArray0[1] = ']';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("\"%*3uUOk@(]fmU{^WKO");
      char[] charArray0 = new char[1];
      charArray0[0] = ']';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("\"%*3uUOk@(]fmU{^WKO");
      char[] charArray0 = new char[13];
      charArray0[0] = ']';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }
}
