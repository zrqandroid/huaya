package com.huaya.frame;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.huaya.frame.download.FileUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
        FileUtils.createFile(context);
    }
}
