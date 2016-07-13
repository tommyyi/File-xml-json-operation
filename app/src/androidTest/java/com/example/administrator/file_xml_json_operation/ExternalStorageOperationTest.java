package com.example.administrator.file_xml_json_operation;

import android.support.test.InstrumentationRegistry;
import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ExternalStorageOperationTest
{

    public static final String README_TXT = "readme.txt";

    @Test
    public void testWrite() throws Exception
    {
        ExternalStorageOperation externalStorageOperation = new ExternalStorageOperation();
        externalStorageOperation.write(InstrumentationRegistry.getTargetContext(), README_TXT,"when i was young");
    }

    @Test
    public void testRead() throws Exception
    {
        ExternalStorageOperation externalStorageOperation = new ExternalStorageOperation();
        String read = externalStorageOperation.read(InstrumentationRegistry.getTargetContext(), README_TXT);
        Log.e(README_TXT,read);
    }
}