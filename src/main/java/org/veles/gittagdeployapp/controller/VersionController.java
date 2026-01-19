package org.veles.gittagdeployapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.veles.gittagdeployapp.service.VersionService;

import java.util.Map;

@RestController
public class VersionController {
    private final VersionService svc;

    public VersionController(VersionService svc) {
        this.svc = svc;
    }

    @GetMapping("/version")
    public Map<String, String> version() {
        return Map.of("app", svc.getAppName(),
                "version", svc.getVersion(),
                "author", svc.getAuthor());
    }
}
