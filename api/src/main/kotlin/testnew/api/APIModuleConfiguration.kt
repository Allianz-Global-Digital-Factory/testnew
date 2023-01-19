package testnew.api

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(basePackages = ["testnew.api"])
open class APIModuleConfiguration
