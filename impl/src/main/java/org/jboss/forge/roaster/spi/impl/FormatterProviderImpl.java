/**
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.roaster.spi.impl;

import java.util.Properties;

import org.jboss.forge.roaster.model.util.impl.Formatter;
import org.jboss.forge.roaster.spi.FormatterProvider;

/**
 * Implementation of the {@link FormatterProvider} interface.
 *
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public class FormatterProviderImpl implements FormatterProvider
{
   @Override
   public String format(String source)
   {
      return Formatter.format(source);
   }

   @Override
   public String format(Properties properties, String source)
   {
      Properties shadedProperties = Formatter.applyShadedPackageName(properties);
      return Formatter.format(shadedProperties, source);
   }
}