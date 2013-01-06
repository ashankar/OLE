package com.ansy.oss.ole.client;

import com.ansy.oss.ole.client.ui.Dashboard;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Ole implements EntryPoint
{
	public void onModuleLoad()
	{
		RootPanel root = RootPanel.get();

		root.add(new Dashboard().createUI());

	}
}
