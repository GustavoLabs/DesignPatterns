package chain.chains.options.trackOrder;

import chain.chains.Chain;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import java.util.regex.*;

public class trackInfo implements Chain {

    private static final String REGEX =  "[A-Z]{2}\.[0-9]{5}";

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void serviceOptions() {

    }

    private String putMask(){

    }

}
