package com.gwtplatform.mvp.client.proxy;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.DefaultPlaceManager injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.proxy.TokenFormatter result = get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.proxy.PlaceManager result = get_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter
   */
  public com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter result = com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_methodInjection() {
    return new com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter();
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.DefaultPlaceManager declared at:
   *   Implicit binding for com.gwtplatform.mvp.client.proxy.DefaultPlaceManager
   */
  public com.gwtplatform.mvp.client.proxy.DefaultPlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.DefaultPlaceManager result = com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$DefaultPlace$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$ErrorPlace$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$UnauthorizedPlace$());
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.client.proxy.DefaultPlaceManager com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2, java.lang.String _3, java.lang.String _4) {
    return new com.gwtplatform.mvp.client.proxy.DefaultPlaceManager(_0, _1, _2, _3, _4);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
