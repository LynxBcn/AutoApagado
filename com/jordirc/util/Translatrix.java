package com.jordirc.util;

/**
 * Created by LynxBcn on 22/03/2015.
 */

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Translatrix
{
    private static ResourceBundle langResources;
    private static String bundleName;

    public Translatrix(String bundle)
    {
        bundleName = new String(bundle);
        try
        {
            langResources = ResourceBundle.getBundle(bundleName);
        }
        catch(MissingResourceException mre)
        {
            logException("MissingResourceException while loading language file", mre);
        }
    }

    public static void setBundleName(String bundle)
    {
        bundleName = new String(bundle);
        try
        {
            langResources = ResourceBundle.getBundle(bundleName);
        }
        catch(MissingResourceException mre)
        {
            logException("MissingResourceException while loading language file", mre);
        }
    }

    public static void setLocale(Locale locale)
    {
        if(bundleName == null)
        {
            return;
        }
        if(locale != null)
        {
            try
            {
                langResources = ResourceBundle.getBundle(bundleName, locale);
            }
            catch(MissingResourceException mre1)
            {
                try
                {
                    langResources = ResourceBundle.getBundle(bundleName);
                }
                catch(MissingResourceException mre2)
                {
                    logException("MissingResourceException while loading language file", mre2);
                }
            }
        }
        else
        {
            try
            {
                langResources = ResourceBundle.getBundle(bundleName);
            }
            catch(MissingResourceException mre)
            {
                logException("MissingResourceException while loading language file", mre);
            }
        }
    }

    public static void setLocale(String sLanguage, String sCountry)
    {
        if(sLanguage != null && sCountry != null)
        {
            setLocale(new Locale(sLanguage, sCountry));
        }
    }

    public static String getTranslationString(String originalText)
    {
        if(langResources == null || bundleName == null)
        {
            return originalText;
        }
        else
        {
            try
            {
                return langResources.getString(originalText);
            }
            catch(Exception e)
            {
                return originalText;
            }
        }
    }

    private static void logException(String internalMessage, Exception e)
    {
        System.err.println(internalMessage);
        e.printStackTrace(System.err);
    }
}