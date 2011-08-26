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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleCharAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderTextAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderTextStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleLeaderWidthAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StylePositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.style.StyleTypeAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element style:tab-stop}.
 *
 */
public class StyleTabStopElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "tab-stop");

	/**
	 * Create the instance of <code>StyleTabStopElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public StyleTabStopElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element style:tab-stop}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleCharAttribute</code> , See {@odf.attribute style:char}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleCharAttribute() {
		StyleCharAttribute attr = (StyleCharAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "char");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleCharAttribute</code> , See {@odf.attribute style:char}
	 *
	 * @param styleCharValue   The type is <code>String</code>
	 */
	public void setStyleCharAttribute(String styleCharValue) {
		StyleCharAttribute attr = new StyleCharAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleCharValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderColorAttribute</code> , See {@odf.attribute style:leader-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderColorAttribute() {
		StyleLeaderColorAttribute attr = (StyleLeaderColorAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderColorAttribute</code> , See {@odf.attribute style:leader-color}
	 *
	 * @param styleLeaderColorValue   The type is <code>String</code>
	 */
	public void setStyleLeaderColorAttribute(String styleLeaderColorValue) {
		StyleLeaderColorAttribute attr = new StyleLeaderColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderStyleAttribute</code> , See {@odf.attribute style:leader-style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderStyleAttribute() {
		StyleLeaderStyleAttribute attr = (StyleLeaderStyleAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-style");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderStyleAttribute</code> , See {@odf.attribute style:leader-style}
	 *
	 * @param styleLeaderStyleValue   The type is <code>String</code>
	 */
	public void setStyleLeaderStyleAttribute(String styleLeaderStyleValue) {
		StyleLeaderStyleAttribute attr = new StyleLeaderStyleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderStyleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderTextAttribute</code> , See {@odf.attribute style:leader-text}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderTextAttribute() {
		StyleLeaderTextAttribute attr = (StyleLeaderTextAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-text");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return StyleLeaderTextAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderTextAttribute</code> , See {@odf.attribute style:leader-text}
	 *
	 * @param styleLeaderTextValue   The type is <code>String</code>
	 */
	public void setStyleLeaderTextAttribute(String styleLeaderTextValue) {
		StyleLeaderTextAttribute attr = new StyleLeaderTextAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderTextValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderTextStyleAttribute</code> , See {@odf.attribute style:leader-text-style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderTextStyleAttribute() {
		StyleLeaderTextStyleAttribute attr = (StyleLeaderTextStyleAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-text-style");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderTextStyleAttribute</code> , See {@odf.attribute style:leader-text-style}
	 *
	 * @param styleLeaderTextStyleValue   The type is <code>String</code>
	 */
	public void setStyleLeaderTextStyleAttribute(String styleLeaderTextStyleValue) {
		StyleLeaderTextStyleAttribute attr = new StyleLeaderTextStyleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderTextStyleValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderTypeAttribute</code> , See {@odf.attribute style:leader-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderTypeAttribute() {
		StyleLeaderTypeAttribute attr = (StyleLeaderTypeAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderTypeAttribute</code> , See {@odf.attribute style:leader-type}
	 *
	 * @param styleLeaderTypeValue   The type is <code>String</code>
	 */
	public void setStyleLeaderTypeAttribute(String styleLeaderTypeValue) {
		StyleLeaderTypeAttribute attr = new StyleLeaderTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleLeaderWidthAttribute</code> , See {@odf.attribute style:leader-width}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleLeaderWidthAttribute() {
		StyleLeaderWidthAttribute attr = (StyleLeaderWidthAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "leader-width");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleLeaderWidthAttribute</code> , See {@odf.attribute style:leader-width}
	 *
	 * @param styleLeaderWidthValue   The type is <code>String</code>
	 */
	public void setStyleLeaderWidthAttribute(String styleLeaderWidthValue) {
		StyleLeaderWidthAttribute attr = new StyleLeaderWidthAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleLeaderWidthValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStylePositionAttribute() {
		StylePositionAttribute attr = (StylePositionAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "position");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StylePositionAttribute</code> , See {@odf.attribute style:position}
	 *
	 * @param stylePositionValue   The type is <code>String</code>
	 */
	public void setStylePositionAttribute(String stylePositionValue) {
		StylePositionAttribute attr = new StylePositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(stylePositionValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>StyleTypeAttribute</code> , See {@odf.attribute style:type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getStyleTypeAttribute() {
		StyleTypeAttribute attr = (StyleTypeAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return StyleTypeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>StyleTypeAttribute</code> , See {@odf.attribute style:type}
	 *
	 * @param styleTypeValue   The type is <code>String</code>
	 */
	public void setStyleTypeAttribute(String styleTypeValue) {
		StyleTypeAttribute attr = new StyleTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(styleTypeValue);
	}

}
