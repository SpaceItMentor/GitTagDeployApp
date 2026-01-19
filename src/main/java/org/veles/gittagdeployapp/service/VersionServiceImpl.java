package org.veles.gittagdeployapp.service;

import org.springframework.stereotype.Service;

@Service
public class VersionServiceImpl implements VersionService {
    @Override
    public String getAppName() {
        return "GitTagDeployApp";
    }

    @Override
    public String getVersion() {
        return System.getenv().getOrDefault("APP_VERSION", "local");
    }

    @Override
    public String getAuthor() {
        return System.getenv().getOrDefault("APP_AUTHOR", "unknown");
    }
}