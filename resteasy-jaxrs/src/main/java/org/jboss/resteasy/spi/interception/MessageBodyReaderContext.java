package org.jboss.resteasy.spi.interception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface MessageBodyReaderContext
{
   Class getType();

   void setType(Class type);

   Type getGenericType();

   void setGenericType(Type genericType);

   Annotation[] getAnnotations();

   void setAnnotations(Annotation[] annotations);

   MediaType getMediaType();

   void setMediaType(MediaType mediaType);

   MultivaluedMap<String, String> getHeaders();

   InputStream getInputStream();

   void setInputStream(InputStream is);

   Object proceed() throws IOException, WebApplicationException;
}