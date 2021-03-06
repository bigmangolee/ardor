// Auto generated code, do not modify
package nxt.http.callers;

import java.lang.String;
import nxt.http.APICall;

public class GetBlocksCall extends APICall.Builder<GetBlocksCall> {
    private GetBlocksCall() {
        super("getBlocks");
    }

    public static GetBlocksCall create() {
        return new GetBlocksCall();
    }

    public GetBlocksCall requireLastBlock(String requireLastBlock) {
        return param("requireLastBlock", requireLastBlock);
    }

    public GetBlocksCall includeExecutedPhased(boolean includeExecutedPhased) {
        return param("includeExecutedPhased", includeExecutedPhased);
    }

    public GetBlocksCall includeTransactions(boolean includeTransactions) {
        return param("includeTransactions", includeTransactions);
    }

    public GetBlocksCall firstIndex(int firstIndex) {
        return param("firstIndex", firstIndex);
    }

    public GetBlocksCall lastIndex(int lastIndex) {
        return param("lastIndex", lastIndex);
    }

    public GetBlocksCall requireBlock(String requireBlock) {
        return param("requireBlock", requireBlock);
    }

    public GetBlocksCall adminPassword(String adminPassword) {
        return param("adminPassword", adminPassword);
    }

    public GetBlocksCall timestamp(int timestamp) {
        return param("timestamp", timestamp);
    }
}
