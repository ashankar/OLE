/**
 * (C) 2013 - 2013, Ansy India Pvt. Ltd., All rights reserved.
 */
package com.ansy.oss.ole.client.ui;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabPanel;

/**
 * @Author : anand <br/>
 * 
 *         Description about Dashboard : <br/>
 */
public class Dashboard
{

	private TabPanel tp;

	private void initUI()
	{
		tp = new TabPanel();

	}

	public Widget createUI()
	{
		initUI();
		HTML shortText = new HTML("Hello Short Text");
		shortText.addStyleName("pad-text");

		tp.add(shortText, "Take Exam");

		tp.add(shortText, "Settings");

		tp.add(shortText, "Report");

		tp.add(shortText, "Create Exam");

		return tp;
	}

}
