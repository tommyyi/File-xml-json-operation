package com.example.administrator.file_xml_json_operation;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/7/13.
 */
public class XMLTest
{
    @Test
    public void testRead() throws Exception
    {
        XML xml=new XML();
        Profile read = xml.read(InstrumentationRegistry.getTargetContext());

        xml.write(InstrumentationRegistry.getTargetContext(),read);
    }
}