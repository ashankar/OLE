package com.ansy.oss.ole.client.ui.takeexam;

import com.google.gwt.user.client.ui.IsWidget;
import com.sencha.gxt.widget.core.client.Portlet;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.PortalLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class TakeExam extends PortalLayoutContainer implements IsWidget
{

	public TakeExam(int columns)
	{
		super(columns);
	}

	void initUI()
	{
		Portlet takeExamPortlet = new Portlet();
		takeExamPortlet.setHeadingText("Take Exam");
		configPanel(takeExamPortlet);
		// here
	}

	void createUI()
	{

	}

	private void configPanel(final Portlet portlet)
	{

		portlet.setCollapsible(true);
		portlet.setAnimCollapse(false);
		portlet.getHeader().addTool(new ToolButton(ToolButton.GEAR));
		portlet.getHeader().addTool(new ToolButton(ToolButton.CLOSE, new SelectHandler()
		{

			@Override
			public void onSelect(SelectEvent event)
			{

				portlet.removeFromParent();
			}
		}));

	}

}
