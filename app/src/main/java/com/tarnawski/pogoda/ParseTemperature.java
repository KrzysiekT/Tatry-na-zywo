package com.tarnawski.pogoda;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Kris on 22.04.15.
 */

public class ParseTemperature {

    // TODO: Please move that to config
    private static final String XML_ADDRESS = "http://www.test.tatrynet.pl/pogoda/weatherMiddleware_v1.0/xml/lokalizacje1.xml";

    private XmlPullParser parser;
    private InputStream sourceXml;
    private List<String> temperatures;

    public ParseTemperature() {

        //this.parser = parser;

        try {
            String xml = loadXmlFromHttpGet();
            //this.sourceXml = loadXml();
            //parser.setInput(sourceXml, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

/*    public List<String> fetchTemperaturesFromXml() {

        String temperature;

        int event = parser.getEventType();
        while (event != XmlPullParser.END_DOCUMENT) {
            String name = parser.getName();
            switch (event) {
                case XmlPullParser.START_TAG:
                    break;
                case XmlPullParser.END_TAG:
                    if (name.equals("temperature")) {
                        temperature = parser.getAttributeValue(null, "value");
                    }
                    break;
            }
            event = parser.next();
        }
    }

    public String getTemparatureForLocation(String location) {


    }*/

    private String loadXmlFromHttpGet() {
        String xml = null;

        // TODO: Maybe this should be loaded as InputStream
        try {
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(XML_ADDRESS);

            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity = httpResponse.getEntity();
            xml = EntityUtils.toString(httpEntity);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.d("XML", xml);

        return xml;
    }

}
