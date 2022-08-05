# skaffold-m-svc-2

### Spring application properties are externalized from resources project directory to separate git repository https://github.com/sinhasonalkumar/skaffold-m-svc-config.git
### So clone this repo and provide relative path of service config in environment variable "spring.config.location" as indicated below


### Add under-noted environment variable to load properties file in spring application context

spring.config.location=../skaffold-m-svc-config/m-svc-2/
spring.profiles.active=local