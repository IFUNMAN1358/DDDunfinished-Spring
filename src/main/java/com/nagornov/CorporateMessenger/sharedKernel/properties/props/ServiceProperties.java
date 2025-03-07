package com.nagornov.CorporateMessenger.sharedKernel.properties.props;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "service")
@Getter
@Setter
public class ServiceProperties {

    private String serverUrl;
    private String clientUrl;

}
