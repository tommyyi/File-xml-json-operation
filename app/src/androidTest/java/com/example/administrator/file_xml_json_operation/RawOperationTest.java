package com.example.administrator.file_xml_json_operation;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/13.
 */
public class RawOperationTest
{

    @Test
    public void testRead() throws Exception
    {
        RawOperation rawOperation=new RawOperation();
        Context targetContext = InstrumentationRegistry.getTargetContext();
        String read = rawOperation.read(targetContext);
        Log.e("s",read);
    }
}