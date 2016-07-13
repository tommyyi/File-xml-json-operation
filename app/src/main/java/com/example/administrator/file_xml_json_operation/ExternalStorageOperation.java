package com.example.administrator.file_xml_json_operation;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ExternalStorageOperation
{
    public void write(Context context,String fileName, String content)throws Exception
    {
        if(!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
            return;

        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file=new File(externalStorageDirectory,fileName);
        if(!file.exists())
            file.createNewFile();
        if(!file.isFile())
            return;

        FileOutputStream outputStream=new FileOutputStream(file);
        outputStream.write(content.getBytes());
        outputStream.flush();
        outputStream.close();
    }

    public String read(Context context,String fileName) throws Exception
    {
        if(!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
            return null;

        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file=new File(externalStorageDirectory,fileName);
        if(!file.exists())
            return null;

        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        String content=new String(buffer);
        return content;
    }
}
