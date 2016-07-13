package com.example.administrator.file_xml_json_operation;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Administrator on 2016/7/13.
 */
public class RawOperation
{

    public static final String RAW_INFO = "raw info";

    public String read(Context context)throws Exception
    {
        InputStream inputStream = context.getResources().openRawResource(R.raw.readme);
        /*Reader reader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(reader);
        String line;*/
        byte[] buffer=new byte[inputStream.available()];
        inputStream.read(buffer);
        inputStream.close();
        return new String(buffer);
    }
}
