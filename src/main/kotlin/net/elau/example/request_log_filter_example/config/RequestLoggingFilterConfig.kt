package net.elau.example.request_log_filter_example.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.CommonsRequestLoggingFilter

@Configuration
class RequestLoggingFilterConfig {

    @Bean
    fun logFilter(): CommonsRequestLoggingFilter = CommonsRequestLoggingFilter().apply {
        this.setIncludeQueryString(true)
        this.setIncludePayload(true)
        this.setMaxPayloadLength(10000)
        this.setIncludeHeaders(true)
    }
}