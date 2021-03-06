// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class BlacklistAPIProxyPeerCall extends APICall.Builder<BlacklistAPIProxyPeerCall> {
    private BlacklistAPIProxyPeerCall() {
        super("blacklistAPIProxyPeer");
    }

    public static BlacklistAPIProxyPeerCall create() {
        return new BlacklistAPIProxyPeerCall();
    }

    public BlacklistAPIProxyPeerCall peer(String peer) {
        return param("peer", peer);
    }

    public BlacklistAPIProxyPeerCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }
}
