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
import org.odftoolkit.odfdom.dom.attribute.text.TextIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:changed-region}.
 *
 */
public class TextChangedRegionElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "changed-region");

	/**
	 * Create the instance of <code>TextChangedRegionElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextChangedRegionElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:changed-region}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIdAttribute() {
		TextIdAttribute attr = (TextIdAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIdAttribute</code> , See {@odf.attribute text:id}
	 *
	 * @param textIdValue   The type is <code>String</code>
	 */
	public void setTextIdAttribute(String textIdValue) {
		TextIdAttribute attr = new TextIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIdValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute() {
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute(String xmlIdValue) {
		XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xmlIdValue);
	}

	/**
	 * Create child element {@odf.element text:deletion}.
	 *
	 * @return the element {@odf.element text:deletion}
	 */
	public TextDeletionElement newTextDeletionElement() {
		TextDeletionElement textDeletion = ((OdfFileDom) this.ownerDocument).newOdfElement(TextDeletionElement.class);
		this.appendChild(textDeletion);
		return textDeletion;
	}

	/**
	 * Create child element {@odf.element text:format-change}.
	 *
	 * @return the element {@odf.element text:format-change}
	 */
	public TextFormatChangeElement newTextFormatChangeElement() {
		TextFormatChangeElement textFormatChange = ((OdfFileDom) this.ownerDocument).newOdfElement(TextFormatChangeElement.class);
		this.appendChild(textFormatChange);
		return textFormatChange;
	}

	/**
	 * Create child element {@odf.element text:insertion}.
	 *
	 * @return the element {@odf.element text:insertion}
	 */
	public TextInsertionElement newTextInsertionElement() {
		TextInsertionElement textInsertion = ((OdfFileDom) this.ownerDocument).newOdfElement(TextInsertionElement.class);
		this.appendChild(textInsertion);
		return textInsertion;
	}

}
