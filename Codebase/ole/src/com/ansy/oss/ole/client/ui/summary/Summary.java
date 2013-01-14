package com.ansy.oss.ole.client.ui.summary;

import com.sencha.gxt.widget.core.client.Portlet;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.PortalLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class Summary extends PortalLayoutContainer {

	public Summary() {

		super(1);
		initUI();
	}

	private void initUI() {

		setColumnWidth(0, 1);
		Portlet portlet = new Portlet();
		portlet.setHeadingText("Summary");
		configPanel(portlet);
		portlet.add(new TextButton("Add here class"));
		add(portlet, 0);

	}

	private void configPanel(final Portlet portlet) {

		portlet.setCollapsible(true);
		portlet.setAnimCollapse(false);
		portlet.getHeader().addTool(new ToolButton(ToolButton.GEAR));
		portlet.getHeader().addTool(
				new ToolButton(ToolButton.CLOSE, new SelectHandler() {

					@Override
					public void onSelect(SelectEvent event) {

						portlet.removeFromParent();
					}
				}));

	}

}
