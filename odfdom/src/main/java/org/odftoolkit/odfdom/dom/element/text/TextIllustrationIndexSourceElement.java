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
import org.odftoolkit.odfdom.dom.attribute.text.TextCaptionSequenceFormatAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextCaptionSequenceNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextIndexScopeAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextRelativeTabStopPositionAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextUseCaptionAttribute;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:illustration-index-source}.
 *
 */
public class TextIllustrationIndexSourceElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "illustration-index-source");

	/**
	 * Create the instance of <code>TextIllustrationIndexSourceElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextIllustrationIndexSourceElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:illustration-index-source}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCaptionSequenceFormatAttribute</code> , See {@odf.attribute text:caption-sequence-format}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCaptionSequenceFormatAttribute() {
		TextCaptionSequenceFormatAttribute attr = (TextCaptionSequenceFormatAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "caption-sequence-format");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCaptionSequenceFormatAttribute</code> , See {@odf.attribute text:caption-sequence-format}
	 *
	 * @param textCaptionSequenceFormatValue   The type is <code>String</code>
	 */
	public void setTextCaptionSequenceFormatAttribute(String textCaptionSequenceFormatValue) {
		TextCaptionSequenceFormatAttribute attr = new TextCaptionSequenceFormatAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCaptionSequenceFormatValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextCaptionSequenceNameAttribute</code> , See {@odf.attribute text:caption-sequence-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextCaptionSequenceNameAttribute() {
		TextCaptionSequenceNameAttribute attr = (TextCaptionSequenceNameAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "caption-sequence-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextCaptionSequenceNameAttribute</code> , See {@odf.attribute text:caption-sequence-name}
	 *
	 * @param textCaptionSequenceNameValue   The type is <code>String</code>
	 */
	public void setTextCaptionSequenceNameAttribute(String textCaptionSequenceNameValue) {
		TextCaptionSequenceNameAttribute attr = new TextCaptionSequenceNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textCaptionSequenceNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextIndexScopeAttribute() {
		TextIndexScopeAttribute attr = (TextIndexScopeAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "index-scope");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return TextIndexScopeAttribute.DEFAULT_VALUE;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextIndexScopeAttribute</code> , See {@odf.attribute text:index-scope}
	 *
	 * @param textIndexScopeValue   The type is <code>String</code>
	 */
	public void setTextIndexScopeAttribute(String textIndexScopeValue) {
		TextIndexScopeAttribute attr = new TextIndexScopeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(textIndexScopeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextRelativeTabStopPositionAttribute() {
		TextRelativeTabStopPositionAttribute attr = (TextRelativeTabStopPositionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "relative-tab-stop-position");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TextRelativeTabStopPositionAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextRelativeTabStopPositionAttribute</code> , See {@odf.attribute text:relative-tab-stop-position}
	 *
	 * @param textRelativeTabStopPositionValue   The type is <code>Boolean</code>
	 */
	public void setTextRelativeTabStopPositionAttribute(Boolean textRelativeTabStopPositionValue) {
		TextRelativeTabStopPositionAttribute attr = new TextRelativeTabStopPositionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textRelativeTabStopPositionValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextUseCaptionAttribute</code> , See {@odf.attribute text:use-caption}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTextUseCaptionAttribute() {
		TextUseCaptionAttribute attr = (TextUseCaptionAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "use-caption");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TextUseCaptionAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TextUseCaptionAttribute</code> , See {@odf.attribute text:use-caption}
	 *
	 * @param textUseCaptionValue   The type is <code>Boolean</code>
	 */
	public void setTextUseCaptionAttribute(Boolean textUseCaptionValue) {
		TextUseCaptionAttribute attr = new TextUseCaptionAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(textUseCaptionValue.booleanValue());
	}

	/**
	 * Create child element {@odf.element text:illustration-index-entry-template}.
	 *
	 * @param textStyleNameValue  the <code>String</code> value of <code>TextStyleNameAttribute</code>, see {@odf.attribute  text:style-name} at specification
	 * @return the element {@odf.element text:illustration-index-entry-template}
	 */
	 public TextIllustrationIndexEntryTemplateElement newTextIllustrationIndexEntryTemplateElement(String textStyleNameValue) {
		TextIllustrationIndexEntryTemplateElement textIllustrationIndexEntryTemplate = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIllustrationIndexEntryTemplateElement.class);
		textIllustrationIndexEntryTemplate.setTextStyleNameAttribute(textStyleNameValue);
		this.appendChild(textIllustrationIndexEntryTemplate);
		return textIllustrationIndexEntryTemplate;
	}

	/**
	 * Create child element {@odf.element text:index-title-template}.
	 *
	 * @return the element {@odf.element text:index-title-template}
	 */
	public TextIndexTitleTemplateElement newTextIndexTitleTemplateElement() {
		TextIndexTitleTemplateElement textIndexTitleTemplate = ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexTitleTemplateElement.class);
		this.appendChild(textIndexTitleTemplate);
		return textIndexTitleTemplate;
	}

}
