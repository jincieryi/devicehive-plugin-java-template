package com.devicehive.service;

import com.devicehive.model.PluginInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PluginInfoService {

    private final PluginInfo pluginInfo;

    public PluginInfoService(@Value("${plugin.name}") String name,
                             @Value("${plugin.description}") String description) {
        name = name + System.currentTimeMillis();
        this.pluginInfo = new PluginInfo(name, description);
    }

    public PluginInfo getPluginInfo() {
        return pluginInfo;
    }
}
