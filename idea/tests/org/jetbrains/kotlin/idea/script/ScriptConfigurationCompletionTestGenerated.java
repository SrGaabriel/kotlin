/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.script;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/script/definition/completion")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ScriptConfigurationCompletionTestGenerated extends AbstractScriptConfigurationCompletionTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInCompletion() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/script/definition/completion"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("conflictingModule")
    public void testConflictingModule() throws Exception {
        runTest("idea/testData/script/definition/completion/conflictingModule/");
    }

    @TestMetadata("conflictingModuleCustomDef")
    public void testConflictingModuleCustomDef() throws Exception {
        runTest("idea/testData/script/definition/completion/conflictingModuleCustomDef/");
    }

    @TestMetadata("conflictingModuleJavaLib")
    public void testConflictingModuleJavaLib() throws Exception {
        runTest("idea/testData/script/definition/completion/conflictingModuleJavaLib/");
    }

    @TestMetadata("implicitReceiver")
    public void testImplicitReceiver() throws Exception {
        runTest("idea/testData/script/definition/completion/implicitReceiver/");
    }
}
