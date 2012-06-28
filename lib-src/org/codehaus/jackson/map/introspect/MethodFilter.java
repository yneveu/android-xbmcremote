package org.codehaus.jackson.map.introspect;

import java.lang.reflect.Method;
import org.xbmc.android.remote.R;

/**
 * Simple interface that defines API used to filter out irrelevant
 * methods
 */
public interface MethodFilter
{
    public boolean includeMethod(Method m);
}
