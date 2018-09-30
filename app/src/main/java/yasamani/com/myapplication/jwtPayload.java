package yasamani.com.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class jwtPayload {

    @SerializedName("http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name")
    @Expose
    private String httpSchemasXmlsoapOrgWs200505IdentityClaimsName;
    @SerializedName("http://schemas.microsoft.com/ws/2008/06/identity/claims/userdata")
    @Expose
    private String httpSchemasMicrosoftComWs200806IdentityClaimsUserdata;
    @SerializedName("IsActive")
    @Expose
    private String isActive;
    @SerializedName("NewDevice")
    @Expose
    private String newDevice;
    @SerializedName("nbf")
    @Expose
    private Integer nbf;
    @SerializedName("exp")
    @Expose
    private Integer exp;
    @SerializedName("iss")
    @Expose
    private String iss;
    @SerializedName("aud")
    @Expose
    private String aud;

    public String getHttpSchemasXmlsoapOrgWs200505IdentityClaimsName() {
        return httpSchemasXmlsoapOrgWs200505IdentityClaimsName;
    }

    public void setHttpSchemasXmlsoapOrgWs200505IdentityClaimsName(String httpSchemasXmlsoapOrgWs200505IdentityClaimsName) {
        this.httpSchemasXmlsoapOrgWs200505IdentityClaimsName = httpSchemasXmlsoapOrgWs200505IdentityClaimsName;
    }

    public String getHttpSchemasMicrosoftComWs200806IdentityClaimsUserdata() {
        return httpSchemasMicrosoftComWs200806IdentityClaimsUserdata;
    }

    public void setHttpSchemasMicrosoftComWs200806IdentityClaimsUserdata(String httpSchemasMicrosoftComWs200806IdentityClaimsUserdata) {
        this.httpSchemasMicrosoftComWs200806IdentityClaimsUserdata = httpSchemasMicrosoftComWs200806IdentityClaimsUserdata;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getNewDevice() {
        return newDevice;
    }

    public void setNewDevice(String newDevice) {
        this.newDevice = newDevice;
    }

    public Integer getNbf() {
        return nbf;
    }

    public void setNbf(Integer nbf) {
        this.nbf = nbf;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getIss() {
        return iss;
    }

    public void setIss(String iss) {
        this.iss = iss;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }
}
