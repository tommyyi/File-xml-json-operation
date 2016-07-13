package com.example.administrator.file_xml_json_operation;

import android.content.Context;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/7/13.
 */
public class XML
{
    public static final String PROFILE = "profile";
    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String BIRTHDAY = "birthday";
    public static final String FROM = "from";

    public void write(Context context, Profile profile) throws Exception
    {
        FileOutputStream fileOutputStream = context.openFileOutput("profile.xml", Context.MODE_PRIVATE);
        XmlSerializer xmlSerializer = Xml.newSerializer();
        xmlSerializer.setOutput(fileOutputStream,"utf-8");
        xmlSerializer.startDocument("utf-8",true);
        xmlSerializer.startTag(null, PROFILE);

        xmlSerializer.startTag(null, NAME);
        xmlSerializer.text(profile.name);
        xmlSerializer.endTag(null,NAME);

        xmlSerializer.startTag(null, AGE);
        xmlSerializer.text(profile.age);
        xmlSerializer.endTag(null,AGE);

        xmlSerializer.startTag(null, BIRTHDAY);
        xmlSerializer.text(profile.birthday);
        xmlSerializer.endTag(null,BIRTHDAY);

        xmlSerializer.startTag(null, FROM);
        xmlSerializer.text(profile.from);
        xmlSerializer.endTag(null,FROM);

        xmlSerializer.endTag(null,PROFILE);
        xmlSerializer.endDocument();

        xmlSerializer.flush();
        fileOutputStream.close();
    }

    public Profile read(Context context) throws Exception
    {
        InputStream inputStream = context.getResources().getAssets().open("profile.xml", Context.MODE_PRIVATE);

        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        XmlPullParser xmlPullParser = xmlPullParserFactory.newPullParser();

        xmlPullParser.setInput(inputStream, "utf-8");
        Profile profile = new Profile();

        while (true)
        {
            xmlPullParser.next();
            switch (xmlPullParser.getEventType())
            {
                case XmlPullParser.END_DOCUMENT:
                    return profile;
                case XmlPullParser.START_DOCUMENT:
                    break;
                case XmlPullParser.START_TAG:
                    if (xmlPullParser.getName().equals("name"))
                    {
                        xmlPullParser.next();
                        profile.name = xmlPullParser.getText();
                        break;
                    }
                    else if (xmlPullParser.getName().equals("age"))
                    {
                        xmlPullParser.next();
                        profile.age = xmlPullParser.getText();
                        break;
                    }
                    else if (xmlPullParser.getName().equals("birthday"))
                    {
                        xmlPullParser.next();
                        profile.birthday = xmlPullParser.getText();
                        break;
                    }
                    else if (xmlPullParser.getName().equals("from"))
                    {
                        xmlPullParser.next();
                        profile.from = xmlPullParser.getText();
                        break;
                    }
                    else if (xmlPullParser.getName().equals("profile"))
                    {
                        break;
                    }
                case XmlPullParser.END_TAG:
                    break;
            }
        }
    }
}
