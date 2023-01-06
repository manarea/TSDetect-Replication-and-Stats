/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 07 09:13:16 GMT 2020
 */

package org.jcvi.jillion.fasta.pos;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PositionFastaRecord_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jcvi.jillion.fasta.pos.PositionFastaRecord"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/test-smell/generation-scripts/projects/92_jcvi-javacommon"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PositionFastaRecord_ESTest_scaffolding.class.getClassLoader() ,
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.Rangeable",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.core.pos.PositionSequence",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.core.Range$UnsignedIntStartLongLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.pos.Position",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.fasta.pos.PositionFastaRecord",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.core.Sequence",
      "org.jcvi.jillion.core.util.ObjectsUtil",
      "org.jcvi.jillion.core.Range$EmptyLongRange",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.fasta.FastaRecord",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.jcvi.jillion.core.pos.PositionSequence", false, PositionFastaRecord_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PositionFastaRecord_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jcvi.jillion.fasta.pos.PositionFastaRecord",
      "org.jcvi.jillion.core.pos.Position",
      "org.jcvi.jillion.core.util.ObjectsUtil"
    );
  }
}
