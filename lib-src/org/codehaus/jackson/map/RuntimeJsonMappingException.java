package org.codehaus.jackson.map;

import org.xbmc.android.remote.R;

/**
 * Wrapper used when interface does not allow throwing a checked
 * {@link JsonMappingException}
 */
@SuppressWarnings("serial")
public class RuntimeJsonMappingException extends RuntimeException
{
    public RuntimeJsonMappingException(JsonMappingException cause) {
        super(cause);
    }

    public RuntimeJsonMappingException(String message) {
        super(message);
    }

    public RuntimeJsonMappingException(String message, JsonMappingException cause) {
        super(message, cause);
    }
}
