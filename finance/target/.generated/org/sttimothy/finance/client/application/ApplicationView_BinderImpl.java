package org.sttimothy.finance.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, org.sttimothy.finance.client.application.ApplicationView>, org.sttimothy.finance.client.application.ApplicationView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final org.sttimothy.finance.client.application.ApplicationView owner) {


    return new Widgets(owner).get_main();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.sttimothy.finance.client.application.ApplicationView owner;


    public Widgets(final org.sttimothy.finance.client.application.ApplicationView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.sttimothy.finance.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.sttimothy.finance.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.sttimothy.finance.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.sttimothy.finance.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(org.sttimothy.finance.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for main called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_main() {
      return build_main();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_main() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel main = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.


      owner.main = main;

      return main;
    }
  }
}
