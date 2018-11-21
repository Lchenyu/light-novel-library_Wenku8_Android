package org.mewx.wenku8.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LightNetworkTest {

    @Test
    public void encodeToHttp (){
        assertEquals("%E5%A6%B9", LightNetwork.encodeToHttp("妹"));
    }
}
