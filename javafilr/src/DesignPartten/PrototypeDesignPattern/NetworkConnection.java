package DesignPartten.PrototypeDesignPattern;

public class NetworkConnection implements Cloneable{
    String ip;
    String impotantData;
    NetworkConnection(){}

    public NetworkConnection(String ip, String impotantData) {
        this.ip = ip;
        this.impotantData = impotantData;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpotantData() {
        return impotantData;
    }

    public void setImpotantData(String impotantData) {
        this.impotantData = impotantData;
    }

    public void loadImpotantData(){
        this.impotantData="its VaryImpotant data for connection";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString(){
        return "[ ip="+ip+" ImpotantData="+impotantData+" ]";
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
