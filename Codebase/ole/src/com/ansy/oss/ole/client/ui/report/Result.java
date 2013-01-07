package com.ansy.oss.ole.client.ui.report;

import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;

public class Result
{

	public FramedPanel createUI()
	{

		FramedPanel panel = new FramedPanel();

		panel.setHeadingText("Report Form");
		panel.setWidth(1100);

		VerticalLayoutContainer vlc = new VerticalLayoutContainer();
		panel.add(vlc);
		
		
		return panel;
	}
	
}
