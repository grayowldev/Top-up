package stradatech.com.topup;

import android.content.Intent;

/**
 * Created by GrayOwl on 5/31/17.
 */

public class TopUpFeatures {
    String network = "MTN";
    String prevActivityCode = "Home";


    public void checkBalance(){

    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getPrevActivityCode() {
        return prevActivityCode;
    }

    public void setPrevActivityCode(String prevActivityCode) {
        this.prevActivityCode = prevActivityCode;
    }



}
