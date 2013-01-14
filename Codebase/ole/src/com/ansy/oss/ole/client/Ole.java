package com.ansy.oss.ole.client;

import javax.swing.table.TableColumn;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;

public class Ole implements EntryPoint 
{
	public void onModuleLoad()
	{
		RootPanel root=RootPanel.get();
		
		root.add(new TextButton("Hello Anand"));
		
		
	}
}
