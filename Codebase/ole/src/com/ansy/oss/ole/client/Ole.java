package com.ansy.oss.ole.client;

import com.ansy.oss.ole.client.quizmaster.CreateQuestion;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
class Ole implements EntryPoint
{
	public void onModuleLoad()
	{
		RootPanel root=RootPanel.get();
		
		//root.add(new TextButton("Hello Anand"));
		root.add(new CreateQuestion().createUI());
		//root.add(new QuizStart().createUI());
		
		
	}
}
