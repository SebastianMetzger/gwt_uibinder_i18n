package com.sebastianmetzger.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class WelcomePanel extends Composite {

    public WelcomePanel() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    interface IconButtonBinder extends UiBinder<HTMLPanel, WelcomePanel> {
    }

    private static IconButtonBinder ourUiBinder = GWT.create(IconButtonBinder.class);
}
