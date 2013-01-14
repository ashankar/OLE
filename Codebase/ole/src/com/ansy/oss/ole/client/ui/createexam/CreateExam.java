package com.ansy.oss.ole.client.ui.createexam;

import com.sencha.gxt.widget.core.client.Portlet;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.PortalLayoutContainer;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;

public class CreateExam extends PortalLayoutContainer {

	public CreateExam() {

		super(1);
		initUI();
	}

	private void initUI() {

		setColumnWidth(0, 1);
		Portlet portlet = new Portlet();
		portlet.setHeadingText("CreateExam");
		configPanel(portlet);
		portlet.add(new CreateQuestion());
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
