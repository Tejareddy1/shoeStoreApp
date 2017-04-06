package com.shoestore.utils;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by tejeshr on 6/4/17.
 */
public class ShoestoreTestConfig {

    private static final String CONFIG_PROPERTIES = "shoestoreconfig.properties";
    private static final Properties props = new Properties();

    private ShoestoreTestConfig() {
        init();
    }

    public static ShoestoreTestConfig getInstance() {
        return Holder.CONFIGURATOR_SUPPORT;
    }

    private String getProperty(String strKey) {
        return props.getProperty(strKey);
    }

    private void init() {
        FileInputStream in = null;
        final URL resource = this.getClass().getClassLoader().getResource(CONFIG_PROPERTIES);
        try {
            File f = new File(resource.toURI());
            if (f.exists()) {
                in = new FileInputStream(f);
                props.load(in);
            } else{

            }
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(in);
        }
    }

    public String getUrl() {return getProperty("url");}
    public String getBrowser() {return getProperty("browser");}
    public String getValidMailId() {return getProperty("emailId");}
    public String getInValidMailId() {return getProperty("invalidEmail");}
    public String getInValidMailIdFormat(){return getProperty("invalidEmailIdFormat");}
    private static class Holder {private static final ShoestoreTestConfig CONFIGURATOR_SUPPORT = new ShoestoreTestConfig();}
}
