package com.ansy.oss.ole.client.ui.createexam;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.SpinnerField;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.validator.MinLengthValidator;

public class CreateQuestion
{

	public FramedPanel createUI()
	{

		FramedPanel panel = new FramedPanel();

		panel.setHeadingText("Administrator Form");

		panel.setWidth(1000);

		VerticalLayoutContainer vlc = new VerticalLayoutContainer();
		panel.add(vlc);

		HorizontalPanel hp1 = new HorizontalPanel();
		vlc.add(hp1);

		TextArea tr = new TextArea();
		tr.setAllowBlank(false);
		tr.addValidator(new MinLengthValidator(100));
		vlc.add(new FieldLabel(tr, "Question"), new VerticalLayoutData(100, 200));

		HorizontalPanel hp = new HorizontalPanel();
		vlc.add(hp);
		
		//HorizontalPanel hp1 = new HorizontalPanel();
		//vlc.add(hp1);

		//FieldLabel l2 = new FieldLabel();
		//l2.setText("Option = 1 ");
		//hp1.setSpacing(10);
		//hp1.add(l2);

		//TextArea option1 = new TextArea();
		//hp1.setSpacing(10);
		
		//hp1.add(option1);
		
		TextArea tr1 = new TextArea();
		tr1.setAllowBlank(false);
		tr1.addValidator(new MinLengthValidator(10));
		vlc.add(new FieldLabel(tr1, "Option 1 "), new VerticalLayoutData(20, 100));

		HorizontalPanel hp2 = new HorizontalPanel();
		vlc.add(hp2);

		FieldLabel l3 = new FieldLabel();
		hp2.setSpacing(10);
		l3.setText("Option = 2 ");
		hp2.add(l3);

		TextArea option2 = new TextArea();
		hp2.setSpacing(10);
		hp2.add(option2);

		HorizontalPanel hp3 = new HorizontalPanel();
		vlc.add(hp3);

		FieldLabel l4 = new FieldLabel();
		hp3.setSpacing(10);
		l4.setText("Option = 3 ");
		hp3.add(l4);

		TextArea option3 = new TextArea();
		hp3.setSpacing(10);
		hp3.add(option3);

		HorizontalPanel hp4 = new HorizontalPanel();
		vlc.add(hp4);

		FieldLabel l5 = new FieldLabel();
		hp4.setSpacing(10);
		l5.setText("Option = 4 ");
		hp4.add(l5);

		TextArea option4 = new TextArea();
		hp4.setSpacing(10);
		hp4.add(option4);

		HorizontalPanel hp5 = new HorizontalPanel();
		vlc.add(hp5);

		TextButton save = new TextButton("Save");
		hp5.setSpacing(30);
		hp5.add(save);

		// HBoxLayoutContainer c=new HBoxLayoutContainer();
		// c.setPadding(new Padding(5));
		// c.setHBoxLayoutAlign(HBoxLayoutAlign.BOTTOM);
		// c.add(new TextButton("SaveText"),new BoxLayoutData(new Margins(0,2,0,0)));
		// BoxLayoutData flex=new BoxLayoutData(new Margins(0,2,0,0));
		// flex.setFlex(1);

		vlc.setPixelSize(500, 550);

		return panel;

	}

}
