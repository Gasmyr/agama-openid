package org.gluu.inbound.oauth2;

import org.apache.commons.beanutils.BeanUtils;

import java.util.List;
import java.util.Map;

public class OAuthParams extends SimpleOAuthParams {

    private List<String> scopes;

    private String redirectUri;
    
    private boolean clientCredsInRequestBody;
    private Map<String, String> custParamsAuthReq;
    private Map<String, String> custParamsTokenReq;

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
    
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }
    
    public boolean isClientCredsInRequestBody() {
        return clientCredsInRequestBody;
    }
    
    public void setClientCredsInRequestBody(boolean clientCredsInRequestBody) {
        this.clientCredsInRequestBody = clientCredsInRequestBody;
    }
    
    public Map<String, String> getCustParamsAuthReq() {
        return custParamsAuthReq;
    }
    
    public void setCustParamsAuthReq(Map<String, String> custParamsAuthReq) {
        this.custParamsAuthReq = custParamsAuthReq;
    }
    
    public Map<String, String> getCustParamsTokenReq() {
        return custParamsTokenReq;
    }
    
    public void setCustParamsTokenReq(Map<String, String> custParamsTokenReq) {
        this.custParamsTokenReq = custParamsTokenReq;
    }

    public static OAuthParams update(OAuthParams oap, SimpleOAuthParams sop)
            throws ReflectiveOperationException {

        BeanUtils.copyProperties(oap, sop);
        return oap;

    }

}
