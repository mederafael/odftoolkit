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
package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDistanceAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawRotationAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:hatch}.
 *
 */
public class DrawHatchElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "hatch");

	/**
	 * Create the instance of <code>DrawHatchElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawHatchElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:hatch}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawColorAttribute</code> , See {@odf.attribute draw:color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawColorAttribute() {
		DrawColorAttribute attr = (DrawColorAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "color");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawColorAttribute</code> , See {@odf.attribute draw:color}
	 *
	 * @param drawColorValue   The type is <code>String</code>
	 */
	public void setDrawColorAttribute(String drawColorValue) {
		DrawColorAttribute attr = new DrawColorAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawColorValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayNameAttribute() {
		DrawDisplayNameAttribute attr = (DrawDisplayNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "display-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @param drawDisplayNameValue   The type is <code>String</code>
	 */
	public void setDrawDisplayNameAttribute(String drawDisplayNameValue) {
		DrawDisplayNameAttribute attr = new DrawDisplayNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawDisplayNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDistanceAttribute</code> , See {@odf.attribute draw:distance}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDistanceAttribute() {
		DrawDistanceAttribute attr = (DrawDistanceAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "distance");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDistanceAttribute</code> , See {@odf.attribute draw:distance}
	 *
	 * @param drawDistanceValue   The type is <code>String</code>
	 */
	public void setDrawDistanceAttribute(String drawDistanceValue) {
		DrawDistanceAttribute attr = new DrawDistanceAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawDistanceValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute() {
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute(String drawNameValue) {
		DrawNameAttribute attr = new DrawNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawRotationAttribute</code> , See {@odf.attribute draw:rotation}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawRotationAttribute() {
		DrawRotationAttribute attr = (DrawRotationAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "rotation");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawRotationAttribute</code> , See {@odf.attribute draw:rotation}
	 *
	 * @param drawRotationValue   The type is <code>String</code>
	 */
	public void setDrawRotationAttribute(String drawRotationValue) {
		DrawRotationAttribute attr = new DrawRotationAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawRotationValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleAttribute() {
		DrawStyleAttribute attr = (DrawStyleAttribute) getOdfAttribute(OdfDocumentNamespace.DRAW, "style");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @param drawStyleValue   The type is <code>String</code>
	 */
	public void setDrawStyleAttribute(String drawStyleValue) {
		DrawStyleAttribute attr = new DrawStyleAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(drawStyleValue);
	}

}
