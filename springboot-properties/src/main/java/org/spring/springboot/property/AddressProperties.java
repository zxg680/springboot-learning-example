package org.spring.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Xiaogang.Zhang
 * @version V1.0
 * @PROJECT_NAME springboot
 * @Package org.spring.springboot.property
 * @Description: TODO
 * @date 2017/4/25 15:46
 */
@Component
@ConfigurationProperties(prefix = "addr")
public class AddressProperties {

    private String  city;

    private String district;

    private String building;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "AddressProperties{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", building='" + building + '\'' +
                '}';
    }
}
