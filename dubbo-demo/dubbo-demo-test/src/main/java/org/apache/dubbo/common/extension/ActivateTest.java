package org.apache.dubbo.common.extension;

import org.apache.dubbo.cache.support.lru.LruCache;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Protocol;
import org.testng.annotations.Test;

import java.util.List;


public class ActivateTest {

    @Test
    public void testActivateExtension() throws Exception {
        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = new URL("", "", 0);
        List<Filter> list = extensionLoader.getActivateExtension(url, "name");
        System.out.println(list.size());
        url = url.addParameter("name", "cache"); // 激活名称为cache的扩展点。即，CacheFilter
        System.out.println(extensionLoader.getActivateExtension(url, "name").size());
    }

    @Test
    public void testActivateExtension2() throws Exception {
        Protocol protocol = ExtensionLoader.getExtensionLoader(org.apache.dubbo.rpc.Protocol.class)
                .getExtension("dubbo");
        System.out.println();
    }
}
