package com.ansy.oss.ole.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;

public class Ole implements EntryPoint
{
	public void onModuleLoad()
	{
		RootPanel root=RootPanel.get();
		
		root.add(new TextButton("Hello Anand"));
		
		
	}
}
