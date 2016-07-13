package com.example.administrator.file_xml_json_operation;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/13.
 */
public class AssetsOperationTest
{

    @Test
    public void testRead() throws Exception
    {
        AssetsOperation assetsOperation=new AssetsOperation();
        assetsOperation.read(InstrumentationRegistry.getTargetContext());
    }
}