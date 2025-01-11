package ru.netology.HW_SpringBoot_Task1_Conditional.profile;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
