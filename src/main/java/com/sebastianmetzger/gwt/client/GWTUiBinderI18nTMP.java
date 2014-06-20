package com.sebastianmetzger.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;
import com.google.gwt.user.client.ui.RootPanel;
import com.sebastianmetzger.gwt.client.i18n.WelcomeMessages;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTUiBinderI18nTMP implements EntryPoint {
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private final Messages messages = GWT.create(WelcomeMessages.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        RootPanel.get("content").add(new WelcomePanel());
    }
}
