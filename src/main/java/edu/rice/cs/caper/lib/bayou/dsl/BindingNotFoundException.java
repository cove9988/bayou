package edu.rice.cs.caper.lib.bayou.dsl;

/**
 * Created by barnett on 6/14/17.
 */
public class BindingNotFoundException extends Exception
{
    public BindingNotFoundException(String qualifiedName)
    {
        super(qualifiedName);
    }
}
