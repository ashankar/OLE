/**
 * (C) 2013 - 2013, Ansy India Pvt. Ltd., All rights reserved.
 */
package com.ansy.oss.ole.client.ui;

import com.ansy.oss.ole.client.ui.createexam.CreateExam;
import com.ansy.oss.ole.client.ui.report.Report;
import com.ansy.oss.ole.client.ui.settings.Settings;
import com.ansy.oss.ole.client.ui.summary.Summary;
import com.ansy.oss.ole.client.ui.takeexam.TakeExam;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabPanel;

/**
 * @Author : anand <br/>
 * 
 *         Description about Dashboard : <br/>
 */
public class Dashboard {

	private TabPanel tp;

	private void initUI() {
		tp = new TabPanel();

	}

	public Widget createUI() {
		initUI();
		HTML shortText = new HTML("Hello Short Text");
		shortText.addStyleName("pad-text");

		tp.setTabIndex(0);
		tp.add(new Summary(), "Summary");

		tp.setTabIndex(1);
		tp.add(new TakeExam(), "Take Exam");

		tp.setTabIndex(2);
		tp.add(new CreateExam(), "Create Exam");

		tp.setTabIndex(3);
		tp.add(new Report(), "Report");

		tp.setTabIndex(4);
		tp.add(new Settings(), "Settings");

		return tp;
	}

}
