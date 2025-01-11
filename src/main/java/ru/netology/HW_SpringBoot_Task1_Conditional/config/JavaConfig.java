package ru.netology.HW_SpringBoot_Task1_Conditional.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.HW_SpringBoot_Task1_Conditional.profile.DevProfile;
import ru.netology.HW_SpringBoot_Task1_Conditional.profile.ProductionProfile;
import ru.netology.HW_SpringBoot_Task1_Conditional.profile.SystemProfile;

/**
 * JavaConfig, в котором объявим бины классов DevProfile и ProductionProfile
 */
@Configuration
public class JavaConfig {

    /**
     * Атрибуты prefix и name используются для обозначения свойства конфигурации, которое необходимо проверить.
     * Атрибут haveValue, он определяет значение, которое должно иметь свойство,
     * чтобы конкретный компонент был добавлен в контейнер Spring.
     * @return метод
     */
    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "netology.profile", name = "dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }

}
