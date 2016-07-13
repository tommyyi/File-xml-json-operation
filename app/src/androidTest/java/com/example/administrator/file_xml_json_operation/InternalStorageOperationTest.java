package com.example.administrator.file_xml_json_operation;

import android.support.test.InstrumentationRegistry;
import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/13.
 */
public class InternalStorageOperationTest
{

    @Test
    public void testWrite() throws Exception
    {
        InternalStorageOperation internalStorageOperation=new InternalStorageOperation();
        internalStorageOperation.write(InstrumentationRegistry.getTargetContext());
    }

    @Test
    public void testRead() throws Exception
    {
        InternalStorageOperation internalStorageOperation=new InternalStorageOperation();
        String read = internalStorageOperation.read(InstrumentationRegistry.getTargetContext());
        Log.e("aaa",read);
    }
}