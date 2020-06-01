package com.nsystem.user;

import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicStatusLine;

public class Client {
    
    public StatusLine getImage(String url) {
        return new BasicStatusLine(new ProtocolVersion("", 1, 1), 1, "");
    } 
}