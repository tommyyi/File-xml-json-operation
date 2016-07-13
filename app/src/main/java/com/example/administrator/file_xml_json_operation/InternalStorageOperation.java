package com.example.administrator.file_xml_json_operation;

import android.content.Context;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * Created by Administrator on 2016/7/13.
 */
public class InternalStorageOperation
{
    public void write(Context context)throws Exception
    {
        FileOutputStream fileOutputStream = context.openFileOutput("readme.txt", Context.MODE_PRIVATE);
        Writer writer=new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("when i was young, i have a girlfriend, she loved me so much");
        bufferedWriter.flush();
        bufferedWriter.close();
        writer.close();
        fileOutputStream.close();
    }

    public String read(Context context)throws Exception
    {
        FileInputStream fileInputStream = context.openFileInput("readme.txt");
        byte[] buffer=new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        return new String(buffer);
    }
}
