package solutions.lightprocessing.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import solutions.lightprocessing.storage.fs.reader.OperationTypeReader

@Configuration
@ComponentScan("solutions.lightprocessing.storage.fs")
class StorageFsConfiguration {
    @Bean
    OperationTypeReader operationTypeReader() {
        new OperationTypeReader("file:src/main/resources/operation-types")
    }
}
