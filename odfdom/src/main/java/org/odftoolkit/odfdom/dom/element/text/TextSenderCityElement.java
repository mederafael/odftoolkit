/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextFixedAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:sender-city}.
 *
 */
public class TextSenderCityElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "sender-city");

	/**
	 * Create the instance of <code>TextSenderCityElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextSenderCityElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:sender-city}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextFixedAttribute() {
		TextFixedAttribute attr = (TextFixedAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "fixed");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextFixedAttribute</code> , See {@odf.attribute text:fixed}
	 *
	 * @param textFixedValue   The type is <code>Boolean</code>
	 */
	public void setTextFixedAttribute(Boolean textFixedValue) {
		TextFixedAttribute attr = new TextFixedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textFixedValue.booleanValue());
	}

	/**
	 * Add text content. Only elements which are allowed to have text content offer this method.
	 */
	 public void newTextNode(String content) {
		if (content != null && !content.equals("")) {
			this.appendChild(this.getOwnerDocument().createTextNode(content));
		}
	 }
}
