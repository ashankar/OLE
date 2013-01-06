package com.ansy.oss.ole.client.student;

import com.google.gwt.user.client.ui.HorizontalPanel;

import com.sencha.gxt.core.client.util.Padding;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.Radio;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.form.validator.MinLengthValidator;

public class QuizStart {

	public FramedPanel createUI() {

		FramedPanel panel = new FramedPanel();
		
		
		
		panel.setHeadingText("Student Form");
		panel.setWidth(1100);

		VerticalLayoutContainer vlc = new VerticalLayoutContainer();
		panel.add(vlc);
			
		TextArea tr=new TextArea();
		tr.setAllowBlank(false);
		tr.addValidator(new MinLengthValidator(10));
		vlc.add(new FieldLabel(tr, "Question"), new VerticalLayoutData(1, 200));																					
					
		HorizontalPanel hp2=new HorizontalPanel();
		vlc.add(hp2);
		
		Radio rd=new Radio();
		rd.setBoxLabel("Option 1 ");
		rd.setValue(true);
		hp2.setSpacing(50);
		hp2.add(rd);
		
		Radio rd1=new Radio();
		rd1.setBoxLabel("Option 2 ");
		rd1.setValue(true);
		hp2.setSpacing(50);
		hp2.add(rd1);
		
		Radio rd2=new Radio();
		rd2.setBoxLabel("Option 3 ");
		rd2.setValue(true);
		hp2.setSpacing(50);
		hp2.add(rd2);
		
		Radio rd3=new Radio();
		rd3.setBoxLabel("Option 4 ");
		rd3.setValue(true);
		hp2.setSpacing(50);
		hp2.add(rd3);
			
		HorizontalPanel hp1=new HorizontalPanel();
		vlc.add(hp1);
		 
		TextButton button1=new TextButton("Next ");
		hp1.setSpacing(30);
		hp1.add(button1);
		
		
		
		TextButton button2=new TextButton("Previous ");
		hp1.setSpacing(30);
		hp1.add(button2);
		
		
		
		TextButton button3=new TextButton("Finish ");
		hp1.setSpacing(30);
		hp1.add(button3);
		
		   
		
		vlc.setPixelSize(550, 400);
		return panel;

	}
		
	
}