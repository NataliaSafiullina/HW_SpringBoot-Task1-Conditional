package ru.netology.HW_SpringBoot_Task1_Conditional.profile;

public class ProductionProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
