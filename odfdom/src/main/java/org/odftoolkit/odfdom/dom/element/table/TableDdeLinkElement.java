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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.office.OfficeDdeSourceElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element table:dde-link}.
 *
 */
public class TableDdeLinkElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "dde-link");

	/**
	 * Create the instance of <code>TableDdeLinkElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDdeLinkElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:dde-link}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element office:dde-source}.
	 *
	 * @param officeDdeApplicationValue  the <code>String</code> value of <code>OfficeDdeApplicationAttribute</code>, see {@odf.attribute  office:dde-application} at specification
	 * @param officeDdeItemValue  the <code>String</code> value of <code>OfficeDdeItemAttribute</code>, see {@odf.attribute  office:dde-item} at specification
	 * @param officeDdeTopicValue  the <code>String</code> value of <code>OfficeDdeTopicAttribute</code>, see {@odf.attribute  office:dde-topic} at specification
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element office:dde-source}
	 */
	 public OfficeDdeSourceElement newOfficeDdeSourceElement(String officeDdeApplicationValue, String officeDdeItemValue, String officeDdeTopicValue) {
		OfficeDdeSourceElement officeDdeSource = ((OdfFileDom) this.ownerDocument).newOdfElement(OfficeDdeSourceElement.class);
		officeDdeSource.setOfficeDdeApplicationAttribute(officeDdeApplicationValue);
		officeDdeSource.setOfficeDdeItemAttribute(officeDdeItemValue);
		officeDdeSource.setOfficeDdeTopicAttribute(officeDdeTopicValue);
		this.appendChild(officeDdeSource);
		return officeDdeSource;
	}

	/**
	 * Create child element {@odf.element table:table}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element table:table}
	 */
	public TableTableElement newTableTableElement() {
		TableTableElement tableTable = ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableElement.class);
		this.appendChild(tableTable);
		return tableTable;
	}

}
