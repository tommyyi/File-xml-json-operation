package com.example.administrator.file_xml_json_operation;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Administrator on 2016/7/13.
 */
public class AssetsOperation
{
    public static final String ASSETS_INFO = "assets info";

    public void read(Context context) throws Exception
    {
        InputStream inputStream = context.getResources().getAssets().open("readme.txt", Context.MODE_PRIVATE);
        Reader reader=new InputStreamReader(inputStream,"utf-8");
        BufferedReader bufferedReader=new BufferedReader(reader);
        String line;
        while ((line=bufferedReader.readLine())!=null)
            Log.e(ASSETS_INFO,line);
        bufferedReader.close();
        reader.close();
        inputStream.close();
    }
}
